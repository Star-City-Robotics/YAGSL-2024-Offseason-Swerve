package frc.robot.commands;

import java.util.concurrent.locks.Condition;

import au.grapplerobotics.LaserCan;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.LoaderSubsystem;

public class IntakeCommand extends Command{

    private final IntakeSubsystem intake;
    private final LoaderSubsystem loader;

    private LaserCan intakeSensor = new LaserCan(Constants.Intake.intakeSensorID);
    private LaserCan.Measurement measurement = intakeSensor.getMeasurement();

    private WaitCommand wait = new WaitCommand(.1);

    private boolean hasNote;
    private boolean amDone;

    public IntakeCommand(IntakeSubsystem intake, LoaderSubsystem loader) {
        this.intake = intake;
        this.loader = loader;
        addRequirements(intake);
        addRequirements(loader);

        
    }

    @Override
    public void initialize() {
        intake.powerIntake();
        loader.powerLoader();

        hasNote = false;
        amDone = false;
    }

    @Override
    public void execute() {

        if (measurement != null && measurement.status == LaserCan.LASERCAN_STATUS_VALID_MEASUREMENT) {
            hasNote = true;
        }

        if (hasNote = true) {

            if (measurement != null) {
            amDone = true;
            }

        }
    }

    @Override
    public boolean isFinished() {
        return amDone;
    }

    @Override
    public void end(boolean interrupted) {
        intake.stopIntake();
        loader.stopLoader();
    }

}

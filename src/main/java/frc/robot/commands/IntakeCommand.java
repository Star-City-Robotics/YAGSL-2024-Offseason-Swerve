package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.LoaderSubsystem;

public class IntakeCommand extends Command{

    private final IntakeSubsystem intake;
    private final LoaderSubsystem loader;

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
    }

    @Override
    public void execute() {

    }

    @Override
    public void end(boolean interrupted) {
        intake.stopIntake();
        loader.stopLoader();
    }

}

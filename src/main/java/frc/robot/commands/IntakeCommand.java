package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeCommand extends Command{
    private final IntakeSubsystem intake;

    public IntakeCommand(IntakeSubsystem subsystem) {
        intake = subsystem;
        addRequirements(intake);
    }

    @Override
    public void initialize() {
        intake.powerIntake();
    }

    @Override
    public void execute() {

    }

    @Override
    public void end(boolean interrupted) {
        intake.stopIntake();
    }

}

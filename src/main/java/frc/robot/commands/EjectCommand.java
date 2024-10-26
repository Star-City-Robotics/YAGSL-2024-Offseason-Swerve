package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.LoaderSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

public class EjectCommand extends Command {
    
    private final IntakeSubsystem intake;
    private final ShooterSubsystem shooter;
    private final LoaderSubsystem loader;

    public EjectCommand(IntakeSubsystem intake, ShooterSubsystem shooter, LoaderSubsystem loader) {
        this.intake = intake;
        this.shooter = shooter;
        this.loader = loader;
        addRequirements(intake);
        addRequirements(shooter);
    }

    @Override
    public void initialize() {
        intake.ejectLoader();
        shooter.ejectShooter();
        loader.ejectLoader();
    }

    @Override
    public void execute() {

    }

    @Override
    public void end(boolean interrupted) {
        intake.stopIntake();
        shooter.stopShooter();
        loader.stopLoader();
    }

}

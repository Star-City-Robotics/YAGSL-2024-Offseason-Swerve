package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.LoaderSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

public class ShooterCommand extends Command {
    
    private final ShooterSubsystem shooter;
    private final LoaderSubsystem loader;

    public ShooterCommand(ShooterSubsystem shooter, LoaderSubsystem loader) {
        this.shooter = shooter;
        this.loader = loader;
        addRequirements(shooter);
        addRequirements(loader);
    }

    @Override
    public void initialize() {
        shooter.powerShooter();
        new WaitCommand(0.5);
        loader.powerLoader();
    }

    @Override
    public void execute() {

    }

    @Override
    public void end(boolean interrupted) {
        shooter.stopShooter();
        loader.stopLoader();
    }
}

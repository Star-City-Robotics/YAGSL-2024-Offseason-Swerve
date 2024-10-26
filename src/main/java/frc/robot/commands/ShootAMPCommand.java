package frc.robot.commands;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.LoaderSubsystem;
import frc.robot.subsystems.PivotSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

public class ShootAMPCommand extends Command {
    
    private final PivotSubsystem pivot;
    private final ShooterSubsystem shooter;
    private final LoaderSubsystem loader;

    private WaitCommand wait = new WaitCommand(0.5);

    public ShootAMPCommand(PivotSubsystem pivot, ShooterSubsystem shooter, LoaderSubsystem loader) {
        this.pivot = pivot;
        this.shooter = shooter;
        this.loader = loader;
        addRequirements(pivot);
        addRequirements(shooter);
        addRequirements(loader);
    }

    @Override
    public void initialize() {
        pivot.pivot90();   
        wait.andThen(
            Commands.runOnce(shooter::shooterAMP)).andThen(
            Commands.runOnce(loader::powerLoader)).andThen(
            Commands.runOnce(pivot::pivotAMP));

    }

    @Override
    public void execute() {

    }

    @Override
    public void end(boolean interrupted) {
        pivot.stopPivot();
    }
}

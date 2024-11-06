package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSubsystem extends SubsystemBase {
    
    private CANSparkMax shooterMotorTop = new CANSparkMax(Constants.Shooter.shooterMotorTopID, MotorType.kBrushless);
    private CANSparkMax shooterMotorBottom = new CANSparkMax(Constants.Shooter.shooterMotorBottomID, MotorType.kBrushless);

    public ShooterSubsystem() {

    }
    
    public void powerShooter() {
        shooterMotorTop.set(2);
        shooterMotorBottom.set(2);
    }

    public void stopShooter() {
        shooterMotorTop.set(0);
        shooterMotorBottom.set(0);
    }

    public void ejectShooter() {
        shooterMotorTop.set(-1);
        shooterMotorBottom.set(-1);
    }

    public void shooterAMP() {
        shooterMotorTop.set(0.2);
        shooterMotorBottom.set(0.1);
    }
}

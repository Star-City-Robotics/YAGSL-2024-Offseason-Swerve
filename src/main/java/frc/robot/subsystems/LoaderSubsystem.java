package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class LoaderSubsystem extends SubsystemBase{
    
    private CANSparkMax loaderMotor = new CANSparkMax(Constants.Loader.loaderMotorID, MotorType.kBrushless);

    public LoaderSubsystem() {

    }

    public void powerLoader() {
        loaderMotor.set(1);
    }

    public void stopLoader() {
        loaderMotor.set(0);
    }

    public void ejectLoader() {
        loaderMotor.set(-1);
    }
}

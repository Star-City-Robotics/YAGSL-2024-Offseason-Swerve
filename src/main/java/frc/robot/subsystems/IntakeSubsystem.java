package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


import au.grapplerobotics.LaserCan;
import au.grapplerobotics.ConfigurationFailedException;

public class IntakeSubsystem extends SubsystemBase{

    private CANSparkMax intakeMotor = new CANSparkMax(Constants.Intake.intakeMotorID, MotorType.kBrushless);
    private LaserCan intakeSensor = new LaserCan(Constants.Intake.intakeSensorID);

    public IntakeSubsystem() {

    }
    
    public void powerIntake() {
        intakeMotor.set(1);
    }

    public void stopIntake() {
        intakeMotor.set(0); 
    }

    public void ejectLoader() {
        intakeMotor.set(-1);
    }
    
    public void sensor() {
        LaserCan.Measurement measurement = intakeSensor.getMeasurement();
    }
}

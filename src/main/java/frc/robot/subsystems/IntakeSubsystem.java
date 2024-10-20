package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase{

    private CANSparkMax intakeMotor = new CANSparkMax(Constants.Intake.intakeMotorID, MotorType.kBrushless);

    public IntakeSubsystem() {

    }
    
    public void powerIntake() {
        intakeMotor.set(1);
    }

    public void stopIntake() {
        intakeMotor.set(0); 
    }

    public void ejectLoader () {
        intakeMotor.set(-1);
    }
    
}

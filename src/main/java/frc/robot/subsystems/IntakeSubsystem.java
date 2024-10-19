package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase{

    private CANSparkMax intakeMotor = new CANSparkMax(Constants.Intake.intakeMotorID, MotorType.kBrushless);

    public IntakeSubsystem()
    {
        
    }


    public Command power() {
        return run(() -> intakeMotor.set(1));
    }
    
    public void stop() {
        intakeMotor.set(0);
        
    }



    public void ppower() {
        intakeMotor.set(1);
    }
    
}

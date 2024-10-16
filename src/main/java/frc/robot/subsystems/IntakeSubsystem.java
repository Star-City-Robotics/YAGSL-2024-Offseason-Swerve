package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase{

    private Spark intakeMotor = new Spark(Constants.Intake.intakeMotorID);

    public IntakeSubsystem()
    {
        
    }


    public Command power() {
        return run(() -> intakeMotor.set(1));
    }
    
    public Command stop() {
        return run(() -> intakeMotor.set(0));
        
    }



    public void ppower() {
        intakeMotor.set(1);
    }
    
}

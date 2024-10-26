package frc.robot.subsystems;


import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class PivotSubsystem extends SubsystemBase{
    
    private CANSparkMax pivotMotorLeft = new CANSparkMax(Constants.Pivot.pivotMotorLeftID, MotorType.kBrushless);
    private CANSparkMax pivotMotorRight = new CANSparkMax(Constants.Pivot.pivotMotorRightID, MotorType.kBrushless);

    public PivotSubsystem() {

    }

    public void upPivot() {
        pivotMotorLeft.set(1);
        pivotMotorRight.set(1);
    }

    public void downPivot() {
        pivotMotorLeft.set(-1);
        pivotMotorRight.set(-1);
    }

    public void stopPivot() {
        pivotMotorLeft.set(0);
        pivotMotorRight.set(0);
    }
}

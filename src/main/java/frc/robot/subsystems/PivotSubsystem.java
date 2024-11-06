package frc.robot.subsystems;


import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class PivotSubsystem extends SubsystemBase{
    
    private CANSparkMax pivotMotorLeft = new CANSparkMax(Constants.Pivot.pivotMotorLeftID, MotorType.kBrushless);
    private CANSparkMax pivotMotorRight = new CANSparkMax(Constants.Pivot.pivotMotorRightID, MotorType.kBrushless);
    //private static final SparkMaxAlternateEncoder pivotEncoder = new SparkMaxAlternateEncoder(pivotMotorLeft, null, 1);
    //pivotMotorLeft.Encoder
    //private Variable pivotEncoder = pivotMotorLeft.getAbsoluteEncoder(SparkMaxAbsoluteEncoder.Type.kDutyCycle);
    //private SparkAbsoluteEncoder pivotEncoder = pivotMotorLeft.getAbsoluteEncoder();
    private RelativeEncoder pivotEncoder = pivotMotorLeft.getEncoder();

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

    public void pivotAMP() {
        pivotEncoder.setPosition(0);
    }

    public void pivotSpeaker() {
        pivotEncoder.setPosition(0);
    }

    public void pivot90() {
        pivotEncoder.setPosition(0);
    }
}

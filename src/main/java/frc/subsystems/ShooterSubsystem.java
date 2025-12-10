package frc.subsystems;

import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import frc.robot.RobotMap;
import frc.robot.RobotMap.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase{
    private SparkFlex ShooterMotor;

    public ShooterSubsystem() {
        ShooterMotor = new SparkFlex(RobotMap.NeoVortexShooterPort, MotorType.kBrushless);
    }

    public void setSpeed(double ShooterSpeed){
        ShooterMotor.set(ShooterSpeed);
    }
    public void stop(){
        ShooterMotor.set(0);
    }
}


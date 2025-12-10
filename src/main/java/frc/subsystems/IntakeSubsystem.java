package frc.subsystems;

import com.ctre.phoenix6.controls.VoltageOut;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class IntakeSubsystem extends SubsystemBase{
    private TalonFX IntakeMotor = new TalonFX(RobotMap.KrakenShooterCanID);
     public IntakeSubsystem() {
        IntakeMotor = new TalonFX(RobotMap.KrakenShooterPort);
        
    }

    public void setSpeed(double climberSpeed){
        IntakeMotor.setControl(new VoltageOut(climberSpeed));
    }
    public void stop(){
        IntakeMotor.setControl(new VoltageOut(0));
    }
}


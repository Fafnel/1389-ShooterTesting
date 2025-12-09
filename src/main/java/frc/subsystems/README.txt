Implement all subsystems by extending SubsystemBase
Simple subsystem code example below

package frc.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClimberSubsystem extends SubsystemBase{
    private SparkFlex climberMotor;

    public ClimberSubsystem() {
        climberMotor = new SparkFlex(RobotMap.MotorPorts.climberMotor, MotorType.kBrushless);
    }

    public void setSpeed(double climberSpeed){
        climberMotor.set(climberSpeed);
    }
    public void stop(){
        climberMotor.set(0);
    }
}

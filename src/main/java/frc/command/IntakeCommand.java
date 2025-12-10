package frc.command;

import frc.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class IntakeCommand extends Command {
    public IntakeSubsystem IntakeSubsystem;

    public IntakeCommand(IntakeSubsystem IntakeSubsystem) {
        this.IntakeSubsystem = IntakeSubsystem;
    }

    public void initialize(){
        //put things that need to be initialized here (such as a timer). No need to @Override.
    }

    @Override
    public void execute() {
        //This gets called multiple times a second. Put something here that should be constantly called such as setting motor speed. 
        IntakeSubsystem.setSpeed(12);
    }

    @Override
    public void end(boolean interrupted) {
        //this gets called when the input stops being given. So you should put a stop motor command here for example. 
        IntakeSubsystem.setSpeed(0);
    }

    @Override
    public boolean isFinished(){
        //If true is returned, the command will stop being run. Can be used to check if a encoder is at right place or limit switch is press (for example)
        return false;
    }
}

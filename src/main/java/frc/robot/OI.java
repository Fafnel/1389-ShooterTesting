package frc.robot;

import com.pathplanner.lib.commands.PathPlannerAuto;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.subsystems.ShooterSubsystem;
import frc.command.IntakeCommand;
import frc.command.ShooterCommand;
import frc.subsystems.IntakeSubsystem;

public class OI {

    ShooterSubsystem ShooterSubsystem = new ShooterSubsystem();
    IntakeSubsystem IntakeSubsystem = new IntakeSubsystem();
    final CommandXboxController manipController = new CommandXboxController(1);
    final CommandXboxController driveController = new CommandXboxController(0);
    public OI() {

        configureBindings();
    }

    /**
     * Initialize JoystickButtons and Controllers
     */


    private void configureBindings() {
        //PUT YOUR COMMANDS in here! Default commands go first.  
        manipController.y().whileTrue(new ShooterCommand(ShooterSubsystem));
        manipController.a().whileTrue(new IntakeCommand(IntakeSubsystem));
    }

    public Command getAutonomousCommand() {
        // AUTOS not PATHS in path planner should be called here
        return new PathPlannerAuto("AutoName");
    }


}
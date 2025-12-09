package frc.robot;

import com.pathplanner.lib.commands.PathPlannerAuto;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;

public class OI {


    public XboxController driveController, manipController;

    public OI() {
        initControllers();

    }

    /**
     * Initialize JoystickButtons and Controllers
     */
    private void initControllers() {
        //Just bc it says xbox controller, doesn't mean you have to use an xbox controller.
        //Look at the raw inputs in driverstation and you can figure out what buttons to use. 
        driveController = new XboxController(0);
        manipController = new XboxController(1);
    }

    private void configureBindings() {
        //PUT YOUR COMMANDS in here! Default commands go first.  
        
    }

    public Command getAutonomousCommand() {
        // AUTOS not PATHS in path planner should be called here
        return new PathPlannerAuto("AutoName");
    }


}
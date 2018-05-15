package org.usfirst.frc.team7190.robot.Commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class SwitchDrop extends CommandGroup {

    public SwitchDrop(){
        String gameData;
        gameData = DriverStation.getInstance().getGameSpecificMessage();
        if(gameData.length() > 0)
        {
            if(gameData.charAt(0) == 'L')
            {
                addSequential(new Baseline());
                addSequential(new TurnRight());
                addSequential(new FireSolenoid());
                addSequential(new TurnLeft());
            } else {
                addSequential(new Baseline());
            }
        }
    }
}

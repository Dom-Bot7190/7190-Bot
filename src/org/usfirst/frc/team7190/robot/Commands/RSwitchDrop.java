package org.usfirst.frc.team7190.robot.Commands;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class RSwitchDrop extends CommandGroup {

    public RSwitchDrop(){
        String gameData;
        gameData = DriverStation.getInstance().getGameSpecificMessage();
        if(gameData.length() > 0)
        {
            if(gameData.charAt(0) == 'R')
            {
                addSequential(new Baseline());
                addSequential(new TurnLeft());
                addSequential(new FireSolenoid());
                addSequential(new TurnRight());
            } else {
                addSequential(new Baseline());
            }
        }
    }
}

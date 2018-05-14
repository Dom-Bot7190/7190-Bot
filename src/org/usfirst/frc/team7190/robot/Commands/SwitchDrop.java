package org.usfirst.frc.team7190.robot.Commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class SwitchDrop extends CommandGroup {

    public SwitchDrop(){
        addSequential(new Baseline());
        addSequential(new TurnRight());
        addSequential(new FireSolenoid);
        addSequential(new TurnLeft());
    }
}

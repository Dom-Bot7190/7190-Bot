package org.usfirst.frc.team7190.robot.Commands;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class FireSolenoid extends Command {
    private Timer m_timer = new Timer();
    private Solenoid aSolenoid = new Solenoid(0);

    public FireSolenoid() {
        super("FireSolenoid");
    }

    protected void initialize() {
        m_timer.reset();
        m_timer.start();
    }

    protected void execute() {
        if (m_timer.get() < 2.0) {
            aSolenoid.set(true); // fire solenoid
        } else {
            aSolenoid.set(false);
        }
    }

    protected boolean isFinished() {
        return false;
    }
}
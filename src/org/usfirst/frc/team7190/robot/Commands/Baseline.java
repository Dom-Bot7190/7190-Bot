package org.usfirst.frc.team7190.robot.Commands;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Baseline extends Command {
    private Timer m_timer = new Timer();
    private DifferentialDrive m_robotDrive
            = new DifferentialDrive(new Spark(0), new Spark(1));

    public Baseline() {
        super("Baseline");
    }
    protected void initialize() {
        m_timer.reset();
        m_timer.start();
        }

    protected void execute() {
        if (m_timer.get() < 2.0) {
            m_robotDrive.arcadeDrive(0.5, 0.0); // drive forwards half speed
        } else {
            m_robotDrive.stopMotor(); // stop robot
        }
    }
    protected boolean isFinished() {
        return false;
    }
    }
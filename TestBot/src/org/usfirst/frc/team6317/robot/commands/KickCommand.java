package org.usfirst.frc.team6317.robot.commands;

import org.usfirst.frc.team6317.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class KickCommand extends Command{

	public KickCommand(){
		this.requires(Robot.Shooter);
	}
	
	protected void initialize(){
		
	}
	
	protected void execute(){
		Robot.Shooter.kick();
		setTimeout(1);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		//Robot.Shooter.notKick();
	}

	@Override
	protected void interrupted() {
	}
}

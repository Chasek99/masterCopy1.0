package org.usfirst.frc.team6317.robot;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

public class RobotMap {
	public static SpeedController rightDrive1 = new Victor(0);//motor controller is set to pim 0
	public static SpeedController rightDrive2 = new Victor(1);//motor controller is set to pim 1
	public static SpeedController leftDrive1 = new Victor(2);//motor controller is set to pim 2
	public static SpeedController leftDrive2 = new Victor(3);//motor controller is set to pim 3
	
	public static SpeedController intakeMotorBottom = new Victor(4);//controlling front end motor using pin number 4
	public static SpeedController intakeMotorTop = new Victor(5);
	public static SpeedController kickerMotor = new Victor(6);
	public static SpeedController shooterMotor = new Victor(7);
	public static SpeedController winchMotor = new Victor(8);
}

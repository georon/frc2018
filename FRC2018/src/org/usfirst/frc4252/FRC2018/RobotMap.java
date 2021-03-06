// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4252.FRC2018;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.Encoder.IndexingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static final int rollerMotorPort = 4;
	// Cameras
	public static UsbCamera camera1;
	
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	/**
    public static SpeedController driveTrainSpeedController1;
    public static SpeedController driveTrainSpeedController2;
    public static SpeedController driveTrainSpeedController3;
    public static SpeedController driveTrainSpeedController4;
    public static RobotDrive driveTrainRobotDrive41;
    public static Ultrasonic pIDSubsystem1Ultrasonic1;
    public static SpeedController pIDSubsystem1SpeedControllerPid1;
    public static PIDController pIDSubsystem1PIDController1;
    public static PowerDistributionPanel dummySubsystem1PowerDistributionPanel1;
    public static Compressor dummySubsystem1Compressor1;
    public static Relay dummySubsystem1Spike1;
    public static AnalogPotentiometer dummySubsystem1AnalogPotentiometer1;
    public static DigitalOutput dummySubsystem1DigitalOutput1;
    public static Servo dummySubsystem1Servo1;
    public static Relay dummySubsystem1RelaySolenoid1;
    public static DigitalInput dummySubsystem1DigitalInput1;
    public static AnalogInput dummySubsystem1AnalogInput1;
    public static DigitalInput dummySubsystem1LimitSwitch1;
    public static Encoder dummySubsystem1QuadratureEncoder1;
    public static Encoder dummySubsystem1IndexedEncoder1;
	**/
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public static RobotDrive robotDrive;
	public static Spark rollerSpeedController;

    public static void init() {
    	robotDrive = new RobotDrive(0, 1, 2, 3);
    	rollerSpeedController = new Spark(rollerMotorPort);
    	camera1 = CameraServer.getInstance().startAutomaticCapture(0);
    	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    	/**
        driveTrainSpeedController1 = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 1", (Talon) driveTrainSpeedController1);
        
        driveTrainSpeedController2 = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 2", (Talon) driveTrainSpeedController2);
        
        driveTrainSpeedController3 = new Talon(2);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 3", (Talon) driveTrainSpeedController3);
        
        driveTrainSpeedController4 = new Talon(3);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 4", (Talon) driveTrainSpeedController4);
        
        driveTrainRobotDrive41 = new RobotDrive(driveTrainSpeedController1, driveTrainSpeedController2,
              driveTrainSpeedController3, driveTrainSpeedController4);
        
        driveTrainRobotDrive41.setSafetyEnabled(true);
        driveTrainRobotDrive41.setExpiration(0.1);
        driveTrainRobotDrive41.setSensitivity(0.5);
        driveTrainRobotDrive41.setMaxOutput(1.0);

        driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        pIDSubsystem1Ultrasonic1 = new Ultrasonic(0, 1);
        LiveWindow.addSensor("PID Subsystem 1", "Ultrasonic 1", pIDSubsystem1Ultrasonic1);
        
        pIDSubsystem1SpeedControllerPid1 = new Talon(5);
        LiveWindow.addActuator("PID Subsystem 1", "Speed Controller Pid1", (Talon) pIDSubsystem1SpeedControllerPid1);
        
        pIDSubsystem1PIDController1 = new PIDController(1.0, 0.0, 0.0, 0.0, pIDSubsystem1Ultrasonic1, pIDSubsystem1SpeedControllerPid1, 0.02);
        LiveWindow.addActuator("PID Subsystem 1", "PID Controller 1", pIDSubsystem1PIDController1);
        pIDSubsystem1PIDController1.setContinuous(false);
        pIDSubsystem1PIDController1.setAbsoluteTolerance(0.2);

        pIDSubsystem1PIDController1.setOutputRange(-1.0, 1.0);
        dummySubsystem1PowerDistributionPanel1 = new PowerDistributionPanel(0);
        LiveWindow.addSensor("DummySubsystem1", "PowerDistributionPanel 1", dummySubsystem1PowerDistributionPanel1);
        
        dummySubsystem1Compressor1 = new Compressor(0);
        
        
        dummySubsystem1Spike1 = new Relay(0);
        LiveWindow.addActuator("DummySubsystem1", "Spike 1", dummySubsystem1Spike1);
        
        dummySubsystem1AnalogPotentiometer1 = new AnalogPotentiometer(0, 1.0, 0.0);
        LiveWindow.addSensor("DummySubsystem1", "Analog Potentiometer 1", dummySubsystem1AnalogPotentiometer1);
        
        dummySubsystem1DigitalOutput1 = new DigitalOutput(2);
        LiveWindow.addActuator("DummySubsystem1", "Digital Output 1", dummySubsystem1DigitalOutput1);
        
        dummySubsystem1Servo1 = new Servo(4);
        LiveWindow.addActuator("DummySubsystem1", "Servo 1", dummySubsystem1Servo1);
        
        dummySubsystem1RelaySolenoid1 = new Relay(1);
        LiveWindow.addActuator("DummySubsystem1", "Relay Solenoid 1", dummySubsystem1RelaySolenoid1);
        
        dummySubsystem1DigitalInput1 = new DigitalInput(3);
        LiveWindow.addSensor("DummySubsystem1", "Digital Input 1", dummySubsystem1DigitalInput1);
        
        dummySubsystem1AnalogInput1 = new AnalogInput(1);
        LiveWindow.addSensor("DummySubsystem1", "Analog Input 1", dummySubsystem1AnalogInput1);
        
        dummySubsystem1LimitSwitch1 = new DigitalInput(4);
        LiveWindow.addSensor("DummySubsystem1", "Limit Switch 1", dummySubsystem1LimitSwitch1);
        
        dummySubsystem1QuadratureEncoder1 = new Encoder(5, 6, false, EncodingType.k4X);
        LiveWindow.addSensor("DummySubsystem1", "Quadrature Encoder 1", dummySubsystem1QuadratureEncoder1);
        dummySubsystem1QuadratureEncoder1.setDistancePerPulse(1.0);
        dummySubsystem1QuadratureEncoder1.setPIDSourceType(PIDSourceType.kRate);
        dummySubsystem1IndexedEncoder1 = new Encoder(7, 8, false);
        LiveWindow.addSensor("DummySubsystem1", "Indexed Encoder 1", dummySubsystem1IndexedEncoder1);
        dummySubsystem1IndexedEncoder1.setDistancePerPulse(1.0);
        dummySubsystem1IndexedEncoder1.setPIDSourceType(PIDSourceType.kRate);
        dummySubsystem1IndexedEncoder1.setIndexSource(9, IndexingType.kResetOnRisingEdge);
		**/
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}

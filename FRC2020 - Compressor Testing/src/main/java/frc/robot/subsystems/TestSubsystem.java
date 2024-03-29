/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.Robot;
import frc.robot.RobotMap;


/**
 * Add your docs here.
 */
public class TestSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private DoubleSolenoid testSolenoid =  new DoubleSolenoid(RobotMap.solenoidChlTwo,RobotMap.solenoidChlOne );

  private Compressor cp26Compressor = new Compressor();

  public TestSubsystem(){
    testSolenoid.clearAllPCMStickyFaults();
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void openTest(){
    testSolenoid.set(DoubleSolenoid.Value.kReverse);
  }

  public void closeTest(){
    testSolenoid.set(DoubleSolenoid.Value.kForward);
  }

  public double current(){
    return cp26Compressor.getCompressorCurrent();
  }
}

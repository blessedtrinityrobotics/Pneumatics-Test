/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import frc.robot.RobotMap;
import frc.robot.commands.pull;
import frc.robot.commands.push;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  private XboxController operator = new XboxController(0);

  // Starts Operator Buttons
  Button xButtonOperator           = new JoystickButton(operator, RobotMap.xButton);
  Button aButtonOperator           = new JoystickButton(operator, RobotMap.aButton);
  Button bButtonOperator           = new JoystickButton(operator, RobotMap.bButton);
  Button yButtonOperator           = new JoystickButton(operator, RobotMap.yButton);
  Button backButtonOperator        = new JoystickButton(operator, RobotMap.backButton);
  Button startButtonOperator       = new JoystickButton(operator, RobotMap.startButton);
  Button leftBumperButtonOperator  = new JoystickButton(operator, RobotMap.leftBumperButton);
  Button rightBumperButtonOperator = new JoystickButton(operator, RobotMap.rightBumperButton);
  Button leftStickButtonOperator   = new JoystickButton(operator, RobotMap.leftStickButton);
  Button rightStickButtonOperator  = new JoystickButton(operator, RobotMap.rightStickButton);

  
  public OI() {
    aButtonOperator.whenPressed(new pull());
    bButtonOperator.whenPressed(new push());
  }

}

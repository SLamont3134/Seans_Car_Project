package edu.fgcu.eagle.stlamont3134;

/**
 * Illegal Chassis Exception class called when a parameter is found to be invalid by the setter
 * method.
 *
 * @author Sean Lamont COP 3003 Car Project Fall 2019
 */
public class IllegalChassisArgumentException extends Exception {

  public IllegalChassisArgumentException() {
    super("Invalid argument for the Stock class method");
  }

  public IllegalChassisArgumentException(String message) {
    super(message);
  }
}

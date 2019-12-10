package edu.fgcu.eagle.stlamont3134;


/**
 * Illegl Vehicle Exception class called when a parameter is found to be invalid by the setter
 * method.
 *
 * @author Sean Lamont COP 3003 Car Project Fall 2019
 */
public class IllegalVehicleArgumentException extends Exception {

  public IllegalVehicleArgumentException() {
    super("Invalid argument for the Stock class method");
  }

  public IllegalVehicleArgumentException(String message) {
    super(message);
  }
}

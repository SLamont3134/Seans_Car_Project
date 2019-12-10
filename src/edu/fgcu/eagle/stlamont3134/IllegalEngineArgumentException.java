package edu.fgcu.eagle.stlamont3134;

/**
 * Illegal Engine Exception class called when a parameter is found to be invalid by the setter
 * method.
 *
 * @author Sean Lamont COP 3003 Car Project Fall 2019
 */
public class IllegalEngineArgumentException extends Exception {

  public IllegalEngineArgumentException() {
    super("Invalid argument for the Stock class method");
  }

  public IllegalEngineArgumentException(String message) {
    super(message);
  }
}
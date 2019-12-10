package edu.fgcu.eagle.stlamont3134;

/**
 * Created an interface named Chassis.  Add the following to the interface:. • A public constant
 * string named chassis with a value of Chassis. The definition of a public getChassisType method
 * that returns an instance of Chassis. • The definition of a public setChassisType that accepts a
 * string named vehicleChassis and returns a void.
 *
 * @author Sean Lamont COP 3003 Car Project Fall 2019
 */
public interface Chassis {

  /**
   * A public constant string named chassis with a value of Chassis .
   */
  public static final String chassis = "Chassis";

  /**
   * The definition of a public getChassisType method that returns an instance of Chassis.
   *
   * @return Chassis
   */
  public Chassis getChassisType();


  /**
   * The definition of a public setChassisType that accepts a string named vehicleChassis and //
   * returns a void.
   *
   * @param vehicleChassis Sets the String vehicleChassis.
   * @throws IllegalChassisArgumentException thrown if a parameter is found to be invalid.
   */
  public void setChassisType(String vehicleChassis) throws IllegalChassisArgumentException;
}

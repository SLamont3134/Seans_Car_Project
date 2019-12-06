package lamont;

/**
 * Created an interface named lamont.Chassis.  Add the following to the interface:. • A public
 * constant string named chassis with a value of lamont.Chassis. The definition of a public
 * getChassisType method that returns an instance of lamont.Chassis. • The definition of a public
 * setChassisType that accepts a string named vehicleChassis and returns a void.
 *
 * @author Sean Lamont COP 3003 Car Project Fall 2019
 */
public interface Chassis {

  /**
   * A public constant string named chassis with a value of lamont.Chassis .
   */
  public static final String chassis = "lamont.Chassis";

  /**
   * The definition of a public getChassisType method that returns an instance of lamont.Chassis.
   *
   * @return lamont.Chassis
   */
  public Chassis getChassisType();


  /**
   * The definition of a public setChassisType that accepts a string named vehicleChassis and //
   * returns a void.
   *
   * @param vehicleChassis Sets the String vehicleChassis.
   */
  public void setChassisType(String vehicleChassis);
}

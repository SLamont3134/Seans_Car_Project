package lamont;

/**
 * Created a concrete class named lamont.VehicleChassis that implements the interface lamont.Chassis
 * with the following: • Created a String named chassisName instance variable. • A public default
 * constructor and an overloaded constructor with the following value: A String with a parameter
 * value of chassisName • Set the chassisName instance variable in both, use the interface constant
 * as the default String value. • A public method named getChassisType that doesnt have a formal
 * parameter and that returns an instance of the interface lamont.Chassis (hint that would be a copy
 * of this class). • A public method setChassisType that takes a String parameter vehicleChassis and
 * that returns a void. It should set the instance variable chassisName. • A public toString method
 * that returns the following: lamont.Chassis Name        : lamont.Chassis for the parameters. •
 * Write a static main method that creates two objects, one with the default constructor and the
 * other with the constructor with parameters. Give sample data
 *
 * @author Sean Lamont COP 3003 Car Project Fall 2019
 */

public class VehicleChassis implements Chassis {

  // • Created a String named chassisName instance variable.
  private String chassisName;
  private String defaultChassis = "lamont.Chassis";

  /**
   * A public default constructor and an overloaded constructor with the following value: A String
   * with a parameter value of chassisName Set the chassisName instance variable in both, use the
   * interface constant as the default String value.
   */
  public VehicleChassis() {
    super();
    this.chassisName = defaultChassis;
  }

  /**
   * An overloaded constructor with the following value: A String with a parameter value of
   * chassisName Set the chassisName instance variable in both, use the interface constant as the
   * default String value.
   *
   * @param chassisName String, sets the chassisName to this value.
   */
  public VehicleChassis(String chassisName) {
    super();
    this.chassisName = chassisName;
  }

  /**
   * Write a static main method that creates two objects, one with the default constructor and the
   * other with the constructor with parameters. Give sample data.
   *
   * @param args main method.
   */
  public static void main(String[] args) {
    VehicleChassis test1 = new VehicleChassis();
    System.out.println(test1.toString() + "\n\n\n");

    VehicleChassis test2 = new VehicleChassis("Truck Frame");
    System.out.println(test2.toString() + "\n\n\n");
  }

  /**
   * A public method named getChassisType that doesnt have a formal parameter and that returns an //
   * instance of the interface lamont.Chassis (hint that would be a copy of this class).
   */
  public VehicleChassis getChassisType() {

    return this;
  }

  /**
   * A public method setChassisType that takes a String parameter vehicleChassis and that returns a
   * void. It should set the instance variable chassisName.
   *
   * @param vehicleChassis Sets the String vehicleChassis.
   */
  public void setChassisType(String vehicleChassis) {
    this.chassisName = vehicleChassis;
  }

  /**
   * A public toString method that returns the following: lamont.Chassis Name: lamont.Chassis.
   */
  public String toString() {
    return ("lamont.Chassis Name: " + chassisName);
  }
}

/*
Sean Lamont
COP 3003
OOP Car Project
Fall 2019
 */

/*
Create an interface named Chassis.  Add the following to the interface:
• A public constant string named chassis with a value of “Chassis”.
• The definition of a public getChassisType method that returns an instance of Chassis.
• The definition of a public setChassisType that accepts a string named vehicleChassis and
returns a void.
 */

public interface Chassis {

  // • A public constant string named chassis with a value of “Chassis”.
  public static final String chassis = "Chassis";

  // • The definition of a public getChassisType method that returns an instance of Chassis.
  public Chassis getChassisType();

  // • The definition of a public setChassisType that accepts a string named vehicleChassis and
  // returns a void.
  public void setChassisType(String vehicleChassis);
}

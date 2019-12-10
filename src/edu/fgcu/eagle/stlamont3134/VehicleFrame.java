package edu.fgcu.eagle.stlamont3134;

/**
 * Created a concrete class named VehicleFrame that implements the interface Chassis with the
 * following: • Created a String named vehicleFrameType instance variable. • A public default
 * constructor and an overloaded constructor with the following value: A String with a parameter
 * value of vehicleFrameType  Set the vehicleFrameType instance variable in both, use Unibody as the
 * default String value.• A public method named getChassisType that didn't have a formal parameter
 * and that returns an instance of the interface Chassis (hint that would be a copy of this class).
 * • A public method setChassisType that takes a String parameter vehicleFrameType and that returns
 * a void. It should set the instance variable vehicleFrameType. • A public toString method that
 * returns the following: Chassis             : Chassis Vehicle Frame       : Unibody • Write a
 * static main method that tests two scenarios: 1. One that prints all fuel grade values, like:
 * Chassis             : Chassis Vehicle Frame       : Unibody 2. One that prints a value set by a
 * single string value. Vehicle Frame       : Ladder Frame • Created a String named vehicleFrameType
 * instance variable.
 *
 * @author Sean Lamont COP 3003 Car Project Fall 2019
 */
public class VehicleFrame implements Chassis {

  // • Created a String named vehicleFrameType instance variable.
  private String vehicleFrameType;
  private String defaultFrameType = "Unibody";

  /**
   * A public default constructor and an overloaded constructor with the following value: A String
   * with a parameter value of vehicleFrameType • Set the vehicleFrameType instance variable in
   * both, use Unibody as the default String value.
   *
   * @throws IllegalChassisArgumentException thrown if a parameter is found to be invalid.
   */
  public VehicleFrame() throws IllegalChassisArgumentException {
    setChassisType(defaultFrameType);
  }

  /**
   * Overloaded Constructor.
   *
   * @param vehicleFrameType String.
   * @throws IllegalChassisArgumentException thrown if a parameter is found to be invalid.
   */
  public VehicleFrame(String vehicleFrameType) throws IllegalChassisArgumentException {
    setChassisType(vehicleFrameType);
  }


  /**
   * The main method to test VehicleFrame. One that prints a value set by a single string value.
   * Vehicle Frame : Ladder Frame
   *
   * @param args the main method.
   */
  public static void main(String[] args) {
    try {
      VehicleFrame test1 = new VehicleFrame();
      System.out.println(test1.getChassisType() + "\n" + test1.toString() + "\n");
    } catch (IllegalChassisArgumentException e) {
      System.out.println(e);
    }

    try {
      VehicleFrame test2 = new VehicleFrame("Ladder Frame");
      System.out.println(test2.toString() + "\n");
    } catch (IllegalChassisArgumentException e) {
      System.out.println(e);
    }
  }

  /**
   * A public method named getChassisType that didn't have a formal parameter and that returns an.
   * instance of the interface
   *
   * @return VehicleFrame.
   */
  public VehicleFrame getChassisType() {
    return this;
  }

  //

  /**
   * A public method setChassisType that takes a String parameter vehicleFrameType and that. returns
   * a void. It should set the instance variable vehicleFrameType.
   *
   * @param vehicleFrameType String.
   * @throws IllegalChassisArgumentException thrown if a parameter is found to be invalid.
   */
  public void setChassisType(String vehicleFrameType) throws IllegalChassisArgumentException {
    if (vehicleFrameType != null && vehicleFrameType.length() > 0) {
      this.vehicleFrameType = vehicleFrameType;
    } else {
      throw new IllegalChassisArgumentException(
          "Invalid Vehicle Frame Type " + vehicleFrameType
              + " Must be at least one character.");
    }
  }

  /**
   * VehicleFrame toString method.
   *
   * @return VehicleFrame toString.
   */
  public String toString() {
    return ("Vehicle Frame: " + vehicleFrameType);
  }
}

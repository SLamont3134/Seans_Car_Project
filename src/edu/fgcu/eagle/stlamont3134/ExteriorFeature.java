package edu.fgcu.eagle.stlamont3134;

/**
 * Created a concrete class named ExteriorFeature that implements the interface Feature with the
 * following: • Created a String named exteriorFeature as an instance variable. • A public default
 * constructor without parameters that sets the exteriorFeature instance variable. • An overloaded
 * constructor with the following value: A String with a parameter value of exteriorFeature • Set
 * the exteriorFeature instance variable in both, use features as String values. • A public method
 * named getFeature that doesnt have a formal parameter and that returns an instance of String. • A
 * public method setFeature that takes a String parameter exteriorFeature and that returns a void.
 * It should set the instance variable exteriorFeature. • A public toString method that returns the
 * following: Exterior [Generic] • Write a static main method that tests two scenarios: • One that
 * prints all fuel grade values, like: Exterior [Generic] Another like Exterior [Fog Lamps] •
 * Created a String named exteriorFeature as an instance variable.
 *
 * @author Sean Lamont COP 3003 Car Project Fall 2019
 */
public class ExteriorFeature implements Feature {

  // • Created a String named exteriorFeature as an instance variable.
  private String exteriorFeature;
  private String defaultExteriorFeature = "Generic";


  /**
   * A public default constructor without parameters that sets the exteriorFeature instance.
   * variable.
   *
   * @throws IllegalVehicleArgumentException thrown if a parameter is found to be invalid.
   */
  public ExteriorFeature() throws IllegalVehicleArgumentException {
    setFeature(defaultExteriorFeature);
  }

  /**
   * An overloaded constructor with the following value: A String with a parameter value of. //
   * exteriorFeature Set the exteriorFeature instance variable in both, use features as String
   * values.
   *
   * @param exteriorFeature String.
   * @throws IllegalVehicleArgumentException thrown if a parameter is found to be invalid.
   */
  public ExteriorFeature(String exteriorFeature) throws IllegalVehicleArgumentException {
    // Set the exteriorFeature instance variable in both, use features as String values.
    setFeature(exteriorFeature);
  }

  /**
   * Write a static main method that tests two scenarios:. One that prints all fuel grade values,
   * like: Exterior [Generic] Another like Exterior [Fog Lamps]
   *
   * @param args The main method to test the ExteriorFeature class.
   */
  public static void main(String[] args) {
    try {
      // One that prints all fuel grade values, like: Exterior [Generic]
      ExteriorFeature test1 = new ExteriorFeature();
      System.out.println(test1.toString() + "\n");

      // Another like Exterior [Fog Lamps]
      ExteriorFeature test2 = new ExteriorFeature("Fog Lamps");
      System.out.println(test2.toString() + "\n");
    } catch (IllegalVehicleArgumentException e) {
      System.out.println(e);
    }
  }


  /**
   * A public method named getFeature that doesnt have a formal parameter and that returns an.
   * instance of String.
   *
   * @return exteriorFeature as a String.
   */
  public String getFeature() {
    return exteriorFeature;
  }


  /**
   * A public method setFeature that takes a String parameter exteriorFeature and that returns a.
   * void. It should set the instance variable exteriorFeature.
   *
   * @param exteriorFeature String.
   * @throws IllegalVehicleArgumentException thrown if a parameter is found to be invalid.
   */
  public void setFeature(String exteriorFeature) throws IllegalVehicleArgumentException {
    if (exteriorFeature != null && exteriorFeature.length() > 0) {
      // It should set the instance variable exteriorFeature.
      this.exteriorFeature = exteriorFeature;
    } else {
      throw new IllegalVehicleArgumentException(
          "Invalid Exterior Feature " + exteriorFeature
              + " Must be at least one character.");
    }
  }

  /**
   * A public toString method that returns the following: Exterior [Generic].
   *
   * @return ExteriorFeature toString.
   */
  public String toString() {
    return ("\nExterior: " + "[" + exteriorFeature + "]");
  }
}

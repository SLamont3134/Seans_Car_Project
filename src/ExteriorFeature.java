/*
Sean Lamont
COP 3003
OOP Car Project
Fall 2019
 */


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
 * prints all fuel grade values, like: Exterior [Generic] Another like Exterior [Fog Lamps] • Created
 * a String named exteriorFeature as an instance variable.
 */
public class ExteriorFeature implements Feature {

  // • Created a String named exteriorFeature as an instance variable.
  private String exteriorFeature;
  private String defaultExteriorFeature = "Generic";


  /**
   * A public default constructor without parameters that sets the exteriorFeature instance.
   * variable.
   */
  public ExteriorFeature() {
    this.exteriorFeature = defaultExteriorFeature;
  }

  /**
   * An overloaded constructor with the following value: A String with a parameter value of. //
   * exteriorFeature Set the exteriorFeature instance variable in both, use features as String
   * values.
   *
   * @param exteriorFeature String.
   */
  public ExteriorFeature(String exteriorFeature) {
    // Set the exteriorFeature instance variable in both, use features as String values.
    this.exteriorFeature = exteriorFeature;
  }

  /**
   * Write a static main method that tests two scenarios:. One that prints all fuel grade values,
   * like: Exterior [Generic] Another like Exterior [Fog Lamps]
   *
   * @param args The main method to test the ExteriorFeature class.
   */
  public static void main(String[] args) {
    // One that prints all fuel grade values, like: Exterior [Generic]
    ExteriorFeature test1 = new ExteriorFeature();
    System.out.println(test1.toString() + "\n\n\n");

    // Another like Exterior [Fog Lamps]
    ExteriorFeature test2 = new ExteriorFeature("Fog Lamps");
    System.out.println(test2.toString() + "\n\n\n");
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
   */
  public void setFeature(String exteriorFeature) {
    // It should set the instance variable exteriorFeature.
    this.exteriorFeature = exteriorFeature;
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

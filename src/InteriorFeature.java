/*
Sean Lamont
COP 3003
OOP Car Project
Fall 2019
 */


/**
 * Create a concrete class named InteriorFeature that implements the interface Feature. with the
 * following: • Create a String named interiorFeature as an instance variable. • A public default
 * constructor without parameters that sets the interiorFeature instance variable to Generic. • An
 * overloaded constructor with the following value: A String with a parameter value of
 * interiorFeature • Set the interiorFeature instance variable to the parameter interiorFeature. • A
 * public method named getFeature that doesnt have a formal parameter and that returns an instance
 * of String. • A public method setFeature that takes a String parameter interiorFeature and that
 * returns a void. It should set the instance variable interiorFeature. • A public toString method
 * that returns the following: Interior [Generic] • Write a static main method that tests two
 * scenarios: • One that prints all fuel grade values, like: Interior [Generic] Another like
 * Interior [Climate Control]
 */
public class InteriorFeature implements Feature {

  // Create a String named interiorFeature as an instance variable.
  private String interiorFeature;
  private String defaultInteriorFeature = "Generic";

  /**
   * A public default constructor without parameters that sets the interiorFeature instance.
   * variable to Generic.
   */
  public InteriorFeature() {
    this.interiorFeature = defaultInteriorFeature;
  }


  /**
   * An overloaded constructor with the following value: A String with a parameter value of.
   * interiorFeature
   *
   * @param interiorFeature String InteriorFeature.
   */
  public InteriorFeature(String interiorFeature) {
    // Set the interiorFeature instance variable to the parameter interiorFeature.
    this.interiorFeature = interiorFeature;
  }

  /**
   * Write a static main method that tests two scenarios:. • One that prints all fuel grade values,
   * like: Interior [Generic] Another like Interior [Climate Control]
   *
   * @param args Main method to test the InteriorFeature class.
   */
  public static void main(String[] args) {
    // One that prints all fuel grade values, like: Interior [Generic]
    InteriorFeature test1 = new InteriorFeature();
    System.out.println(test1.toString() + "\n\n\n");

    // Another like Interior [Climate Control]
    InteriorFeature test2 = new InteriorFeature("Climate Control");
    System.out.println(test2.toString() + "\n\n\n");
  }


  /**
   * A public method named getFeature that doesnt have a formal parameter and that returns an.
   * instance of String.
   *
   * @return String returns the interior feature.
   */
  public String getFeature() {
    return interiorFeature;
  }

  /**
   * A public method setFeature that takes a String parameter interiorFeature and that returns a.
   * void.
   *
   * @param interiorFeature String to create new Interior Feature.
   */
  public void setFeature(String interiorFeature) {
    // It should set the instance variable interiorFeature.
    this.interiorFeature = interiorFeature;
  }

  /**
   * A public toString method that returns the following: Interior [Generic].
   *
   * @return String the Interior Feature in the format of a String ready to display.
   */
  public String toString() {
    return ("\nInterior: " + "[" + interiorFeature + "]");
  }
}

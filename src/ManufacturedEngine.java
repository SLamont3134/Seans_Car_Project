/*
Sean Lamont
COP 3003
OOP Car Project
Fall 2019
 */

import java.time.Instant;
import java.util.Date;

// Create a concrete class named ManufacturedEngine that implements the interface Engine with the
// following:
public class ManufacturedEngine implements Engine {

  /*
  Create the following private instance variables:
  String     engineManufacturer; */
  String engineManufacturer;

  // Date       engineManufacturedDate;
  Date engineManufaturedDate;

  // String     engineMake;
  String engineMake;

  // String engineModel
  String engineModel;

  // int       engineCylinders;
  int engineCylinders;

  // String     engineType;
  String engineType;


  String defaultValue = "Generic";


  /**
   * A public defaultValue constructor with no formal parameters and initialize all instance
   * variables with generic literal values.
   */
  public ManufacturedEngine() {
    this.engineManufacturer = defaultValue;
    this.engineManufaturedDate = Date.from(Instant.now());
    this.engineMake = defaultValue;
    this.engineModel = defaultValue;
    this.engineCylinders = 0;
    this.engineType = defaultValue;
  }

  /**
   * A public overloaded constructor with values for all of the variables defined above.
   *
   * @param engineManufacturer String.
   * @param engineManufaturedDate Date.
   * @param engineMake String.
   * @param engineModel String.
   * @param engineCylinders int.
   * @param engineType String.
   */
  public ManufacturedEngine(
      String engineManufacturer,
      Date engineManufaturedDate,
      String engineMake,
      String engineModel,
      int engineCylinders,
      String engineType) {
    this.engineManufacturer = engineManufacturer;
    setEngineManufacturedDate(engineManufaturedDate);
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
  }

  /**
   * Write a static main method that tests two scenarios.
   *
   * @param args the main method to test Manufactured Engine.
   */
  public static void main(String[] args) {
    /*
    One that prints a generic set of strings, like:
    Engine Manufacturer : Generic
    Engine Manufactured : Thu Feb 02 00:55:44 MST 2012
    Engine Make         : Generic
    Engine Model        : Generic
    Engine Type         : 85 AKI
    Engine Cylinders    : 0
    //not implemented because of redundency with vehicle drivetrain
    Drive Train         : 2WD: Two-Wheel Drive
     */
    ManufacturedEngine test1 = new ManufacturedEngine();
    System.out.println(test1.toString() + "\n\n\n");

    /*
    One that accepts call parameters and returns the following:
    Engine Manufacturer : Honda
    Engine Manufactured : Tue Jan 03 07:13:19 MST 2012
    Engine Make         : H-Series
    Engine Model        : H23A1
    Engine Type         : 88 AKI
    Engine Cylinders    : 4
    Drive Train         : 2WD: Two-Wheel Drive
     */
    ManufacturedEngine test2 =
        new ManufacturedEngine(
            "Honda",
            Date.from(Instant.now()),
            "H-Series",
            "H23A1",
            4,
            "88 AKI");
    System.out.println(test2.toString() + "\n\n\n");
  }

  // A public method implementations for all of the public methods found in the Engine interface
  // setEngineCylinders(int engineCylinders);
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  // setEngineManufacturedDate(Date date);
  public void setEngineManufacturedDate(Date date) {
    this.engineManufaturedDate = new Date(date.getTime());
  }

  // setEngineManufacturer(String manufacturer);
  public void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }

  // setEngineMake(String engineMake);
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  // setEngineModel(String engineModel);
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  // setDriveTrain(String driveTrain);
  /*public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }
*/
  // setEngineType(String fuel);
  public void setEngineType(String fuel) {
    this.engineType = fuel;
  }


  /**
   * A public toString method that returns the following:. Engine Manufacturer : Generic Engine
   * Manufactured : Thu Feb 02 00:55:44 MST 2012 Engine Make         : Generic Engine Model        :
   * Generic Engine Type         : 85 AKI Engine Cylinders    : 0 //not implemented because of
   * duplicate with vehicle drivetrain Drive Train         : 2WD: Two-Wheel Drives
   *
   * @return ManufacturedEngine toString.
   */
  public String toString() {
    return "Engine Manufacturer : "
        + engineManufacturer
        + "\nEngine Manufactured : "
        + engineManufaturedDate
        + "\nEngine Make : "
        + engineMake
        + "\nEngine Model : "
        + engineModel
        + "\nEngine Type : "
        + engineType
        + "\nEngine Cylinders : "
        + engineCylinders;
  }
}

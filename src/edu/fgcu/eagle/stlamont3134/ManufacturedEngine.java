package edu.fgcu.eagle.stlamont3134;

import java.time.Instant;
import java.util.Date;

/**
 * Created a concrete class named ManufacturedEngine that implements the interface Engine with the.
 * following:
 *
 * @author Sean Lamont COP 3003 Car Project Fall 2019
 */
public class ManufacturedEngine implements Engine {

  /**
   * Created the following private instance variables:. String engineManufacturer; Date
   * engineManufacturedDate; String engineMake; String engineModel; int engineCylinders; String
   * engineType;
   */
  private String engineManufacturer;

  // Date engineManufacturedDate;
  private Date engineManufacturedDate;

  // String engineMake;
  private String engineMake;

  // String engineModel
  private String engineModel;

  // int engineCylinders;
  private int engineCylinders;

  // String engineType;
  private String engineType;

  private String defaultValue = "Generic";

  /**
   * A public defaultValue constructor with no formal parameters and initialize all instance
   * variables with generic literal values.
   *
   * @throws IllegalEngineArgumentException thrown if a parameter is found to be invalid.
   */
  public ManufacturedEngine() throws IllegalEngineArgumentException {
    setEngineManufacturer(defaultValue);
    setEngineManufacturedDate(Date.from(Instant.now()));
    setEngineMake(defaultValue);
    setEngineModel(defaultValue);
    setEngineCylinders(4);
    setEngineType(defaultValue);
  }

  /**
   * A public overloaded constructor with values for all of the variables defined above.
   *
   * @param engineManufacturer String.
   * @param engineManufacturedDate Date.
   * @param engineMake String.
   * @param engineModel String.
   * @param engineCylinders int.
   * @param engineType String.
   * @throws IllegalEngineArgumentException thrown if a parameter is found to be invalid.
   */
  public ManufacturedEngine(
      String engineManufacturer,
      Date engineManufacturedDate,
      String engineMake,
      String engineModel,
      int engineCylinders,
      String engineType) throws IllegalEngineArgumentException {
    setEngineManufacturer(engineManufacturer);
    setEngineManufacturedDate(engineManufacturedDate);
    setEngineMake(engineMake);
    setEngineModel(engineModel);
    setEngineCylinders(engineCylinders);
    setEngineType(engineType);
  }

  /**
   * Write a static main method that tests two scenarios. One that prints a generic set of strings,
   * like: Engine Manufacturer : Generic Engine Manufactured : Thu Feb 02 00:55:44 MST 2012 Engine
   * Make         : Generic Engine Model        : Generic Engine Type         : 85 AKI Engine
   * Cylinders    : 0 //not implemented because of redundency with vehicle drivetrain Drive Train :
   * 2WD: Two-Wheel Drive One that accepts call parameters and returns the following: Engine
   * Manufacturer : Honda Engine Manufactured : Tue Jan 03 07:13:19 MST 2012 Engine Make         :
   * H-Series Engine Model : H23A1 Engine Type         : 88 AKI Engine Cylinders    : 4 Drive Train
   * : 2WD: Two-Wheel Drive
   *
   * @param args the main method to test Manufactured Engine.
   */
  public static void main(String[] args) {

    try {
      ManufacturedEngine test1 = new ManufacturedEngine();
      System.out.println(test1.toString() + "\n");

      ManufacturedEngine test2 =
          new ManufacturedEngine(
              "Honda",
              Date.from(Instant.now()),
              "H-Series",
              "H23A1",
              4,
              "88 AKI");
      System.out.println(test2.toString() + "\n");
    } catch (IllegalEngineArgumentException e) {
      System.out.println(e);
    }
  }

  /**
   * A public method implementations for all of the public methods found in the Engine interface.
   * setEngineCylinders(int engineCylinders);
   *
   * @param engineCylinders int the number of cylinders in the engine.
   * @throws IllegalEngineArgumentException thrown if a parameter is found to be invalid.
   */
  public void setEngineCylinders(int engineCylinders) throws IllegalEngineArgumentException {
    if (engineCylinders > 0) {
      this.engineCylinders = engineCylinders;
    } else {
      throw new IllegalEngineArgumentException(
          "Illegal Number of Cylinders " + engineCylinders + " Must be a number greater than 0.");
    }
  }

  /**
   * setEngineManufacturedDate(Date date);.
   *
   * @param date Date the date the engine was manufactured.
   * @throws IllegalEngineArgumentException thrown if a parameter is found to be invalid.
   */
  public void setEngineManufacturedDate(Date date) throws IllegalEngineArgumentException {
    if (!(date == null)) {
      this.engineManufacturedDate = new Date(date.getTime());
    } else {
      throw new IllegalEngineArgumentException(
          "Illegal Engine Manufacture Date");
    }
  }

  /**
   * setEngineManufacturer(String manufacturer);.
   *
   * @param manufacturer String the manufacturer name.
   * @throws IllegalEngineArgumentException thrown if a parameter is found to be invalid.
   */
  public void setEngineManufacturer(String manufacturer) throws IllegalEngineArgumentException {
    if (manufacturer != null && manufacturer.length() > 0) {
      this.engineManufacturer = manufacturer;
    } else {
      throw new IllegalEngineArgumentException(
          "Invalid Engine Manufacturer " + manufacturer + " Must be at least one character.");
    }
  }

  /**
   * setEngineMake(String engineMake);.
   *
   * @param engineMake String engineMake the make of the engine.
   * @throws IllegalEngineArgumentException thrown if a parameter is found to be invalid.
   */
  public void setEngineMake(String engineMake) throws IllegalEngineArgumentException {
    if (engineMake != null && engineMake.length() > 0) {
      this.engineMake = engineMake;
    } else {
      throw new IllegalEngineArgumentException(
          "Invalid Engine Make " + engineMake + " Must be at least one character.");
    }
  }

  /**
   * setEngineModel(String engineModel);.
   *
   * @param engineModel String the name of the engine model.
   * @throws IllegalEngineArgumentException thrown if a parameter is found to be invalid.
   */
  public void setEngineModel(String engineModel) throws IllegalEngineArgumentException {
    if (engineModel != null && engineModel.length() > 0) {
      this.engineModel = engineModel;
    } else {
      throw new IllegalEngineArgumentException(
          "Invalid Engine Model " + engineModel + " Must be at least one character.");
    }
  }

  /**
   * setEngineType(String fuel);.
   *
   * @param fuel String fuel type, ie diesel, gas, propane etc.
   * @throws IllegalEngineArgumentException thrown if a parameter is found to be invalid.
   */
  public void setEngineType(String fuel) throws IllegalEngineArgumentException {
    if (fuel != null && fuel.length() > 0) {
      this.engineType = fuel;
    } else {
      throw new IllegalEngineArgumentException(
          "Invalid Engine Fuel Type " + fuel + " Must be at least one character.");
    }
  }


  /**
   * A public toString method that returns the following:. Engine Manufacturer : Generic Engine
   * Manufactured : Thu Feb 02 00:55:44 MST 2012 Engine Make         : Generic Engine Model        :
   * Generic Engine Type         : 85 AKI Engine Cylinders    : 0 //not implemented because of
   * duplicate with vehicle drivetrain Drive Train : 2WD: Two-Wheel Drives
   *
   * @return ManufacturedEngine toString.
   */
  public String toString() {
    return "Engine Manufacturer : "
        + engineManufacturer
        + "\nEngine Manufactured : "
        + engineManufacturedDate
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

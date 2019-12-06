package edu.fgcu.eagle.stlamont3134;

import java.time.Instant;
import java.util.Date;

/**
 * Created a concrete class named lamont.ManufacturedEngine that implements the interface
 * lamont.Engine with the. following:
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

  private Date engineManufaturedDate;

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
   * @param engineManufacturedDate Date.
   * @param engineMake String.
   * @param engineModel String.
   * @param engineCylinders int.
   * @param engineType String.
   */
  public ManufacturedEngine(
      String engineManufacturer,
      Date engineManufacturedDate,
      String engineMake,
      String engineModel,
      int engineCylinders,
      String engineType) {
    this.engineManufacturer = engineManufacturer;
    setEngineManufacturedDate(engineManufacturedDate);
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
  }

  /**
   * Write a static main method that tests two scenarios. One that prints a generic set of strings,
   * like: lamont.Engine Manufacturer : Generic lamont.Engine Manufactured : Thu Feb 02 00:55:44 MST
   * 2012 lamont.Engine Make         : Generic lamont.Engine Model        : Generic lamont.Engine
   * Type         : 85 AKI lamont.Engine Cylinders    : 0 //not implemented because of redundency
   * with vehicle drivetrain Drive Train : 2WD: Two-Wheel Drive One that accepts call parameters and
   * returns the following: lamont.Engine Manufacturer : Honda lamont.Engine Manufactured : Tue Jan
   * 03 07:13:19 MST 2012 lamont.Engine Make         : H-Series lamont.Engine Model : H23A1
   * lamont.Engine Type         : 88 AKI lamont.Engine Cylinders    : 4 Drive Train : 2WD: Two-Wheel
   * Drive
   *
   * @param args the main method to test Manufactured lamont.Engine.
   */
  public static void main(String[] args) {

    ManufacturedEngine test1 = new ManufacturedEngine();
    System.out.println(test1.toString() + "\n\n\n");

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


  /**
   * A public method implementations for all of the public methods found in the lamont.Engine
   * interface. setEngineCylinders(int engineCylinders);
   *
   * @param engineCylinders int the number of cylinders in the engine.
   */
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  /**
   * setEngineManufacturedDate(Date date);.
   *
   * @param date Date the date the engine was manufactured.
   */
  public void setEngineManufacturedDate(Date date) {
    this.engineManufaturedDate = new Date(date.getTime());
  }

  /**
   * setEngineManufacturer(String manufacturer);.
   *
   * @param manufacturer String the manufacturer name.
   */
  public void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }

  /**
   * setEngineMake(String engineMake);.
   *
   * @param engineMake String engineMake the make of the engine.
   */
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  /**
   * setEngineModel(String engineModel);.
   *
   * @param engineModel String the name of the engine model.
   */
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  /**
   * setEngineType(String fuel);.
   *
   * @param fuel String fuel type, ie diesel, gas, propane etc.
   */
  public void setEngineType(String fuel) {
    this.engineType = fuel;
  }


  /**
   * A public toString method that returns the following:. lamont.Engine Manufacturer : Generic
   * lamont.Engine Manufactured : Thu Feb 02 00:55:44 MST 2012 lamont.Engine Make         : Generic
   * lamont.Engine Model        : Generic lamont.Engine Type         : 85 AKI lamont.Engine
   * Cylinders    : 0 //not implemented because of duplicate with vehicle drivetrain Drive Train :
   * 2WD: Two-Wheel Drives
   *
   * @return lamont.ManufacturedEngine toString.
   */
  public String toString() {
    return "lamont.Engine Manufacturer : "
        + engineManufacturer
        + "\nlamont.Engine Manufactured : "
        + engineManufaturedDate
        + "\nlamont.Engine Make : "
        + engineMake
        + "\nlamont.Engine Model : "
        + engineModel
        + "\nlamont.Engine Type : "
        + engineType
        + "\nlamont.Engine Cylinders : "
        + engineCylinders;
  }
}

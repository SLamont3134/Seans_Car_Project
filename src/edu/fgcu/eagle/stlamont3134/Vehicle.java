package edu.fgcu.eagle.stlamont3134;

import java.time.Instant;
import java.util.Date;

/**
 * Created a concrete class named lamont.Vehicle that implements the lamont.Engine and
 * lamont.Chassis interfaces.
 *
 * @author Sean Lamont COP 3003 Car Project Fall 2019
 */
public class Vehicle implements Engine, Chassis {

  /**
   * Public method implementations for the lamont.Chassis interface. A public constant string named
   * chassis with a value of lamont.Chassis. Created the following private instance variables: Date
   * vehicleManufacturedDate; String     vehicleManufacturer; String     vehicleMake; String
   * vehicleModel; lamont.Chassis    vehicleFrame; String     vehicleType; String     driveTrain;
   * lamont.Engine vehicleEngine
   */
  protected static final String chassis = "lamont.Chassis";
  // Created the following private instance variables:
  // Date       vehicleManufacturedDate;
  private Date vehicleManufacturedDate;
  // String     vehicleManufacturer;
  private String vehicleManufacturer;
  // String     vehicleMake;
  private String vehicleMake;
  // String     vehicleModel;
  private String vehicleModel;
  // lamont.Chassis    vehicleFrame;
  private Chassis vehicleFrame;
  // String     vehicleType;
  private String vehicleType;
  // String     driveTrain;
  private String driveTrain;
  // lamont.Engine     vehicleEngine
  private Engine vehicleEngine;
  private String defaultValue = "Generic";
  private String defaultDriveTrain = "2WD: Two-Wheel Drive";


  /**
   * A public default constructor with no formal parameters and initialize all instance variables
   * with generic literal values The default constructor.
   */
  public Vehicle() {
    this.vehicleManufacturedDate = Date.from(Instant.now());
    this.vehicleManufacturer = defaultValue;
    this.vehicleMake = defaultValue;
    this.vehicleModel = defaultValue;
    this.vehicleFrame = new VehicleFrame();
    this.vehicleType = defaultValue;
    this.driveTrain = defaultDriveTrain;
    this.vehicleEngine = new ManufacturedEngine();
  }

  /**
   * A public overloaded constructor with values for all of the variables defined above.
   *
   * @param vehicleManufacturedDate Date.
   * @param vehicleManufacturer String.
   * @param vehicleMake String.
   * @param vehicleModel String.
   * @param vehicleFrame lamont.Chassis.
   * @param vehicleType String.
   * @param driveTrain String.
   * @param engineManufacturer String.
   * @param engineManufacturedDate Date.
   * @param engineMake String.
   * @param engineModel String.
   * @param engineCylinders int.
   * @param engineType String.
   */
  public Vehicle(
      Date vehicleManufacturedDate,
      String vehicleManufacturer,
      String vehicleMake,
      String vehicleModel,
      Chassis vehicleFrame,
      String vehicleType,
      String driveTrain,
      String engineManufacturer,
      Date engineManufacturedDate,
      String engineMake,
      String engineModel,
      int engineCylinders,
      String engineType) {

    setVehicleManufacturedDate(vehicleManufacturedDate);
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = new ManufacturedEngine(engineManufacturer, engineManufacturedDate,
        engineMake, engineModel, engineCylinders, engineType);
  }


  /**
   * Write a static main method that tests two scenarios. One that prints a generic set of strings,
   * like: Manufacturer Name: Honda Manufactured Date: Tue Jan 03 07:13:19 MST 2015 lamont.Vehicle
   * Make: Honda lamont.Vehicle Model: Prelude lamont.Vehicle Type: null lamont.Engine Manufacturer:
   * Honda lamont.Engine Manufactured: Thu Feb 02 01:38:31 MST 2015 lamont.Engine Make: H-Series
   * lamont.Engine Model: H23A1 lamont.Engine Type: 88 AKI lamont.Engine Cylinders: 4 Drive Train:
   * 2WD:Two-Wheel Drive One that accepts call parameters and returns the following: Manufacturer
   * Name: Honda Manufactured Date: Tue Jan 03 07:13:19 MST 2012 lamont.Vehicle Make: Honda
   * lamont.Vehicle Model: Prelude lamont.Vehicle Type: null lamont.Engine Manufacturer: Honda
   * lamont.Engine Manufactured: Thu Feb 02 01:38:31 MST 2012 lamont.Engine Make: H-Series
   * lamont.Engine Model: H23A1 lamont.Engine Type: 88 AKI lamont.Engine Cylinders: 4 Drive Train:
   * 2WD: Two-Wheel Drive
   *
   * @param args main method to test lamont.Vehicle.
   */
  public static void main(String[] args) {
    Vehicle test1 = new Vehicle();
    System.out.println(test1.toString() + "\n\n\n");

    Vehicle test2 =
        new Vehicle(
            Date.from(Instant.now()),
            "Honda",
            "Honda",
            "Prelude",
            new VehicleFrame(),
            null,
            "2WD: Two-Wheel Drive",
            "Honda",
            Date.from(Instant.now()),
            "H-Series",
            "H23A1",
            4,
            "88 AKI");

    System.out.println(test2.toString() + "\n\n\n");
    test2.setVehicleFrame(new VehicleChassis("String bean"));
    System.out.println(test2.getChassisType());
  }

  /**
   * Public method implementations for all of the public methods found in the lamont.Engine
   * interface. setEngineCylinders(int engineCylinders);
   *
   * @param engineCylinders int number of engine cylinders.
   */
  public void setEngineCylinders(int engineCylinders) {
    this.vehicleEngine.setEngineCylinders(engineCylinders);
  }

  //

  /**
   * setEngineManufacturedDate(Date date);.
   *
   * @param date Date the date the engine was manufactured.
   */
  public void setEngineManufacturedDate(Date date) {
    this.vehicleEngine.setEngineManufacturedDate(date);
  }

  /**
   * setEngineManufacturer(String manufacturer);.
   *
   * @param manufacturer String engine manufacturer name.
   */
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleEngine.setEngineManufacturer(manufacturer);
  }

  /**
   * setEngineMake(String engineMake);.
   *
   * @param engineMake String the make of the engine.
   */
  public void setEngineMake(String engineMake) {
    this.vehicleEngine.setEngineMake(engineMake);
  }

  /**
   * setEngineModel(String engineModel);.
   *
   * @param engineModel String the model of the engine.
   */
  public void setEngineModel(String engineModel) {
    this.vehicleEngine.setEngineModel(engineModel);
  }

  /**
   * Public method implementations that set all instance variables. setDriveTrain(String
   * driveTrain);
   *
   * @param driveTrain String the name of the type of drive train.
   */
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  /**
   * setEngineType(String fuel);.
   *
   * @param fuel String the type of fuel used by the engine. ie diesel, gas, propane, electric.
   */
  public void setEngineType(String fuel) {
    this.vehicleEngine.setEngineType(fuel);
  }

  /**
   * Sets the lamont.Vehicle's Manufactured Date to the date passed into the function.
   *
   * @param vehicleManufacturedDate Date to be set to manufactured date.
   */
  public void setVehicleManufacturedDate(Date vehicleManufacturedDate) {
    this.vehicleManufacturedDate = new Date(vehicleManufacturedDate.getTime());
  }

  /**
   * Sets the vehicle manufacturer  to the passed in String value.
   *
   * @param vehicleManufacturer String value to be set to manufacturer.
   */
  public void setVehicleManufacturer(String vehicleManufacturer) {
    this.vehicleManufacturer = vehicleManufacturer;
  }

  /**
   * Sets vehicle make to the String value passed in.
   *
   * @param vehicleMake String the value that vehicle make is set to.
   */
  public void setVehicleMake(String vehicleMake) {
    this.vehicleMake = vehicleMake;
  }

  /**
   * Sets the vehicle model to the String value that is passed into it.
   *
   * @param vehicleModel String value that is assigned to vehicle model.
   */
  public void setVehicleModel(String vehicleModel) {
    this.vehicleModel = vehicleModel;
  }

  /**
   * Sets vehicle frame to the lamont.Chassis object that is passed into the module.
   *
   * @param vehicleFrame lamont.Chassis value that is set to vehicleFrame value.
   */
  public void setVehicleFrame(Chassis vehicleFrame) {
    this.vehicleFrame = vehicleFrame;
  }

  /**
   * Sets the vehicle type to the String value that is passed into the module.
   *
   * @param vehicleType String the value that is set to vehicleType.
   */
  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  /**
   * Sets the vehicle engine to the lamont.Engine object that is passed into the module.
   *
   * @param vehicleEngine lamont.Engine, Sets the object's value to this value.
   */
  public void setVehicleEngine(Engine vehicleEngine) {
    this.vehicleEngine = vehicleEngine;
  }

  /**
   * The definition of a public getChassisType method that returns an instance of lamont.Chassis.
   *
   * @return lamont.Chassis, an instance of the vehicle chassis type.
   */
  public Chassis getChassisType() {
    return this.vehicleFrame;
  }

  /**
   * The definition of a public setChassisType that accepts a string named vehicleChassis and
   * returns a void.
   *
   * @param vehicleChassis Sets the String vehicleChassis.
   */
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
  }


  /**
   * toString method. A public toString method that returns the following: Manufacturer Name   :
   * Generic Manufactured Date   : Thu Feb 02 01:38:31 MST 2015 lamont.Vehicle Make        : Generic
   * lamont.Vehicle Model       : Generic lamont.Vehicle Type        : None lamont.Engine
   * Manufacturer : Generic lamont.Engine Manufactured : Thu Feb 02 01:38:31 MST 2015 lamont.Engine
   * Make         : Generic lamont.Engine Model        : Generic lamont.Engine Type         : 88 AKI
   * lamont.Engine Cylinders    : 0 Drive Train         : 2WD: Two-Wheel Drive
   *
   * @return lamont.Vehicle toString.
   */
  public String toString() {
    return ("Manufacturer Name: "
        + vehicleManufacturer
        + "\nManufactured Date: "
        + vehicleManufacturedDate
        + "\nlamont.Vehicle Make: "
        + vehicleMake
        + "\nlamont.Vehicle Model: "
        + vehicleModel
        + "\nlamont.Vehicle Type: "
        + vehicleType
        + "\n"
        + vehicleEngine.toString()
        + "\nDrive Train: "
        + driveTrain);
  }
}
/*
Sean Lamont
COP 3003
OOP Car Project
Fall 2019
 */

import java.time.Instant;
import java.util.Date;

// Create a concrete class named Vehicle that implements the Engine and Chassis interfaces
public class Vehicle implements Engine, Chassis {

  // Public method implementations for the Chassis interface
  // • A public constant string named chassis with a value of “Chassis”.
  protected static final String chassis = "Chassis";
  // Create the following private instance variables:
  // Date       vehicleManufacturedDate;
  protected Date vehicleManufacturedDate;
  // String     vehicleManufacturer;
  protected String vehicleManufacturer;
  // String     vehicleMake;
  protected String vehicleMake;
  // String     vehicleModel;
  protected String vehicleModel;
  // Chassis    vehicleFrame;
  protected Chassis vehicleFrame;
  // String     vehicleType;
  protected String vehicleType;
  // String     driveTrain;
  protected String driveTrain;
  // Engine     vehicleEngine
  protected Engine vehicleEngine;
  private String defaultValue = "Generic";
  private String defaultDriveTrain = "2WD: Two-Wheel Drive";

  // A public default constructor with no formal parameters and initialize all instance variables
  // with generic literal values
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

  // A public overloaded constructor with values for all of the variables defined above
  public Vehicle(
      Date vehicleManufacturedDate,
      String vehicleManufacturer,
      String vehicleMake,
      String vehicleModel,
      Chassis vehicleFrame,
      String vehicleType,
      String driveTrain,
      ManufacturedEngine vehicleEngine) {

    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;
  }

  // Write a static main method that tests two scenarios:
  public static void main(String[] args) {
    /*
    One that prints a generic set of strings, like:
    Manufacturer Name   : Honda
    Manufactured Date   : Tue Jan 03 07:13:19 MST 2015
    Vehicle Make        : Honda
    Vehicle Model       : Prelude
    Vehicle Type        : null
    Engine Manufacturer : Honda
    Engine Manufactured : Thu Feb 02 01:38:31 MST 2015
    Engine Make         : H-Series
    Engine Model        : H23A1
    Engine Type         : 88 AKI
    Engine Cylinders    : 4
    Drive Train         : 2WD: Two-Wheel Drive
     */
    Vehicle test1 = new Vehicle();
    System.out.println(test1.toString() + "\n\n\n");

    /*
    One that accepts call parameters and returns the following:
    Manufacturer Name   : Honda
    Manufactured Date   : Tue Jan 03 07:13:19 MST 2012
    Vehicle Make        : Honda
    Vehicle Model       : Prelude
    Vehicle Type        : null
    Engine Manufacturer : Honda
    Engine Manufactured : Thu Feb 02 01:38:31 MST 2012
    Engine Make         : H-Series
    Engine Model        : H23A1
    Engine Type         : 88 AKI
    Engine Cylinders    : 4
    Drive Train         : 2WD: Two-Wheel Drive
     */
    ManufacturedEngine testEngine =
        new ManufacturedEngine(
            "Honda",
            Date.from(Instant.now()),
            "H-Series",
            "H23A1",
            4,
            "88 AKI",
            "2WD: Two-Wheel Drive");

    Vehicle test2 =
        new Vehicle(
            Date.from(Instant.now()),
            "Honda",
            "Honda",
            "Prelude",
            new VehicleFrame(),
            null,
            "2WD: Two-Wheel Drive",
            testEngine);

    System.out.println(test2.toString() + "\n\n\n");
    test2.setVehicleFrame(new VehicleChassis("String bean"));
    System.out.println(test2.getChassisType());
  }

  // Public method implementations for all of the public methods found in the Engine interface.
  // setEngineCylinders(int engineCylinders);
  public void setEngineCylinders(int engineCylinders) {
    this.vehicleEngine.setEngineCylinders(engineCylinders);
  }

  // setEngineManufacturedDate(Date date);
  public void setEngineManufacturedDate(Date date) {
    this.vehicleEngine.setEngineManufacturedDate(date);
  }

  // setEngineManufacturer(String manufacturer);
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleEngine.setEngineManufacturer(manufacturer);
  }

  // setEngineMake(String engineMake);
  public void setEngineMake(String engineMake) {
    this.vehicleEngine.setEngineMake(engineMake);
  }

  // setEngineModel(String engineModel);
  public void setEngineModel(String engineModel) {
    this.vehicleEngine.setEngineModel(engineModel);
  }

  // Public method implementations that set all instance variables

  // setDriveTrain(String driveTrain);
  public void setDriveTrain(String driveTrain) {
    this.vehicleEngine.setDriveTrain(driveTrain);
  }

  // setEngineType(String fuel);
  public void setEngineType(String fuel) {
    this.vehicleEngine.setEngineType(fuel);
  }

  public void setVehicleManufacturedDate(Date vehicleManufacturedDate) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
  }

  public void setVehicleManufacturer(String vehicleManufacturer) {
    this.vehicleManufacturer = vehicleManufacturer;
  }

  public void setVehicleMake(String vehicleMake) {
    this.vehicleMake = vehicleMake;
  }

  public void setVehicleModel(String vehicleModel) {
    this.vehicleModel = vehicleModel;
  }

  public void setVehicleFrame(Chassis vehicleFrame) {
    this.vehicleFrame = vehicleFrame;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public void setVehicleEngine(Engine vehicleEngine) {
    this.vehicleEngine = vehicleEngine;
  }

  // • The definition of a public getChassisType method that returns an instance of Chassis.
  public Chassis getChassisType() {
    return this.vehicleFrame;
  }

  // • The definition of a public setChassisType that accepts a string named vehicleChassis and
  // returns a void.
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
  }

  /*
  A public toString method that returns the following:
  Manufacturer Name   : Generic
  Manufactured Date   : Thu Feb 02 01:38:31 MST 2015
  Vehicle Make        : Generic
  Vehicle Model       : Generic
  Vehicle Type        : None
  Engine Manufacturer : Generic
  Engine Manufactured : Thu Feb 02 01:38:31 MST 2015
  Engine Make         : Generic
  Engine Model        : Generic
  Engine Type         : 88 AKI
  Engine Cylinders    : 0
  Drive Train         : 2WD: Two-Wheel Drive
   */
  public String toString() {
    return ("Manufacturer Name: "
        + vehicleManufacturer
        + "\nManufactured Date: "
        + vehicleManufacturedDate
        + "\nVehicle Make: "
        + vehicleMake
        + "\nVehicle Model: "
        + vehicleModel
        + "\nVehicle Type: "
        + vehicleType
        + "\n"
        + vehicleEngine.toString());
  }
}

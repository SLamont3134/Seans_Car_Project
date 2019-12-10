package edu.fgcu.eagle.stlamont3134;

import java.time.Instant;
import java.util.Date;

/**
 * Created a concrete class named Vehicle that implements the Engine and Chassis interfaces.
 *
 * @author Sean Lamont COP 3003 Car Project Fall 2019
 */
public class Vehicle implements Engine, Chassis {

  /**
   * Public method implementations for the Chassis interface. A public constant string named chassis
   * with a value of Chassis. Created the following private instance variables: Date
   * vehicleManufacturedDate; String     vehicleManufacturer; String     vehicleMake; String
   * vehicleModel; Chassis    vehicleFrame; String     vehicleType; String     driveTrain; Engine
   * vehicleEngine
   */
  protected static final String chassis = "Chassis";
  // Created the following private instance variables:
  // Date vehicleManufacturedDate;
  private Date vehicleManufacturedDate;
  // String vehicleManufacturer;
  private String vehicleManufacturer;
  // String vehicleMake;
  private String vehicleMake;
  // String vehicleModel;
  private String vehicleModel;
  // Chassis vehicleFrame;
  private Chassis vehicleFrame;
  // String vehicleType;
  private String vehicleType;
  // String driveTrain;
  private String driveTrain;
  // Engine vehicleEngine
  private Engine vehicleEngine;
  private String defaultValue = "Generic";
  private String defaultDriveTrain = "2WD: Two-Wheel Drive";


  /**
   * A public default constructor with no formal parameters and initialize all instance variables
   * with generic literal values The default constructor.
   *
   * @throws IllegalVehicleArgumentException thrown if a parameter is found to be invalid.
   * @throws IllegalEngineArgumentException thrown if a parameter is found to be invalid.
   * @throws IllegalChassisArgumentException thrown if a parameter is found to be invalid.
   */
  public Vehicle()
      throws IllegalEngineArgumentException, IllegalVehicleArgumentException,
      IllegalChassisArgumentException {
    setVehicleManufacturedDate(Date.from(Instant.now()));
    setVehicleManufacturer(defaultValue);
    setVehicleMake(defaultValue);
    setVehicleModel(defaultValue);
    setVehicleFrame(new VehicleFrame());
    setVehicleType(defaultValue);
    setDriveTrain(defaultDriveTrain);
    setVehicleEngine(new ManufacturedEngine());
  }

  /**
   * A public overloaded constructor with values for all of the variables defined above.
   *
   * @param vehicleManufacturedDate Date.
   * @param vehicleManufacturer String.
   * @param vehicleMake String.
   * @param vehicleModel String.
   * @param vehicleFrame Chassis.
   * @param vehicleType String.
   * @param driveTrain String.
   * @param engineManufacturer String.
   * @param engineManufacturedDate Date.
   * @param engineMake String.
   * @param engineModel String.
   * @param engineCylinders int.
   * @param engineType String.
   * @throws IllegalVehicleArgumentException thrown if a parameter is found to be invalid.
   * @throws IllegalEngineArgumentException thrown if a parameter is found to be invalid.
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
      String engineType) throws IllegalEngineArgumentException, IllegalVehicleArgumentException {

    setVehicleManufacturedDate(vehicleManufacturedDate);
    setVehicleManufacturer(vehicleManufacturer);
    setVehicleMake(vehicleMake);
    setVehicleModel(vehicleModel);
    setVehicleFrame(vehicleFrame);
    setVehicleType(vehicleType);
    setDriveTrain(driveTrain);
    setVehicleEngine(new ManufacturedEngine(engineManufacturer, engineManufacturedDate,
        engineMake, engineModel, engineCylinders, engineType));
  }


  /**
   * Write a static main method that tests two scenarios. One that prints a generic set of strings,
   * like: Manufacturer Name: Honda Manufactured Date: Tue Jan 03 07:13:19 MST 2015 Vehicle Make:
   * Honda Vehicle Model: Prelude Vehicle Type: null Engine Manufacturer: Honda Engine Manufactured:
   * Thu Feb 02 01:38:31 MST 2015 Engine Make: H-Series Engine Model: H23A1 Engine Type: 88 AKI
   * Engine Cylinders: 4 Drive Train: 2WD:Two-Wheel Drive One that accepts call parameters and
   * returns the following: Manufacturer Name: Honda Manufactured Date: Tue Jan 03 07:13:19 MST 2012
   * Vehicle Make: Honda Vehicle Model: Prelude Vehicle Type: null Engine Manufacturer: Honda Engine
   * Manufactured: Thu Feb 02 01:38:31 MST 2012 Engine Make: H-Series Engine Model: H23A1 Engine
   * Type: 88 AKI Engine Cylinders: 4 Drive Train: 2WD: Two-Wheel Drive
   *
   * @param args main method to test Vehicle.
   */
  public static void main(String[] args) {
    try {
      Vehicle test1 = new Vehicle();
      System.out.println(test1.toString() + "\n");

      Vehicle test2 =
          new Vehicle(
              Date.from(Instant.now()),
              "Honda",
              "Honda",
              "Prelude",
              new VehicleFrame(),
              "Passenger",
              "2WD: Two-Wheel Drive",
              "Honda",
              Date.from(Instant.now()),
              "H-Series",
              "H23A1",
              4,
              "88 AKI");

      System.out.println(test2.toString() + "\n");
      test2.setVehicleFrame(new VehicleChassis("String bean"));
      System.out.println(test2.getChassisType());
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  /**
   * Public method implementations for all of the public methods found in the Engine interface.
   * setEngineCylinders(int engineCylinders);
   *
   * @param engineCylinders int number of engine cylinders.
   * @throws IllegalEngineArgumentException thrown if a parameter is found to be invalid.
   */
  public void setEngineCylinders(int engineCylinders) throws IllegalEngineArgumentException {
    this.vehicleEngine.setEngineCylinders(engineCylinders);
  }

  //

  /**
   * setEngineManufacturedDate(Date date);.
   *
   * @param date Date the date the engine was manufactured.
   * @throws IllegalEngineArgumentException thrown if a parameter is found to be invalid.
   */
  public void setEngineManufacturedDate(Date date) throws IllegalEngineArgumentException {
    this.vehicleEngine.setEngineManufacturedDate(date);
  }


  /**
   * setEngineManufacturer(String manufacturer);.
   *
   * @param manufacturer String engine manufacturer name.
   * @throws IllegalEngineArgumentException thrown if a parameter is found to be invalid.
   */
  public void setEngineManufacturer(String manufacturer) throws IllegalEngineArgumentException {
    this.vehicleEngine.setEngineManufacturer(manufacturer);
  }

  /**
   * setEngineMake(String engineMake);.
   *
   * @param engineMake String the make of the engine.
   * @throws IllegalEngineArgumentException thrown if a parameter is found to be invalid.
   */
  public void setEngineMake(String engineMake) throws IllegalEngineArgumentException {
    this.vehicleEngine.setEngineMake(engineMake);
  }

  /**
   * setEngineModel(String engineModel);.
   *
   * @param engineModel String the model of the engine.
   * @throws IllegalEngineArgumentException thrown if a parameter is found to be invalid.
   */
  public void setEngineModel(String engineModel) throws IllegalEngineArgumentException {
    this.vehicleEngine.setEngineModel(engineModel);
  }

  /**
   * Public method implementations that set all instance variables. setDriveTrain(String
   * driveTrain);
   *
   * @param driveTrain String the name of the type of drive train.
   * @throws IllegalVehicleArgumentException thrown if a parameter is found to be invalid.
   */
  public void setDriveTrain(String driveTrain) throws IllegalVehicleArgumentException {
    if (driveTrain != null && driveTrain.length() > 0) {
      this.driveTrain = driveTrain;
    } else {
      throw new IllegalVehicleArgumentException(
          "Invalid Drive Train " + driveTrain + " Must be at least one character.");
    }
  }

  /**
   * setEngineType(String fuel);.
   *
   * @param fuel String the type of fuel used by the engine. ie diesel, gas, propane, electric.
   * @throws IllegalEngineArgumentException thrown if a parameter is found to be invalid.
   */
  public void setEngineType(String fuel) throws IllegalEngineArgumentException {
    this.vehicleEngine.setEngineType(fuel);
  }

  /**
   * Sets the Vehicle's Manufactured Date to the date passed into the function.
   *
   * @param vehicleManufacturedDate Date to be set to manufactured date.
   * @throws IllegalVehicleArgumentException thrown if a parameter is found to be invalid.
   */
  public void setVehicleManufacturedDate(Date vehicleManufacturedDate)
      throws IllegalVehicleArgumentException {
    if (!(vehicleManufacturedDate == null)) {
      this.vehicleManufacturedDate = new Date(vehicleManufacturedDate.getTime());
    } else {
      throw new IllegalVehicleArgumentException(
          "Illegal Vehicle Manufacture Date");
    }
  }

  /**
   * Sets the vehicle manufacturer  to the passed in String value.
   *
   * @param vehicleManufacturer String value to be set to manufacturer.
   * @throws IllegalVehicleArgumentException thrown if a parameter is found to be invalid.
   */
  public void setVehicleManufacturer(String vehicleManufacturer)
      throws IllegalVehicleArgumentException {
    if (vehicleManufacturer != null && vehicleManufacturer.length() > 0) {
      this.vehicleManufacturer = vehicleManufacturer;
    } else {
      throw new IllegalVehicleArgumentException(
          "Invalid Vehicle Manufacturer " + vehicleManufacturer
              + " Must be at least one character.");
    }
  }

  /**
   * Sets vehicle make to the String value passed in.
   *
   * @param vehicleMake String the value that vehicle make is set to.
   * @throws IllegalVehicleArgumentException thrown if a parameter is found to be invalid.
   */
  public void setVehicleMake(String vehicleMake) throws IllegalVehicleArgumentException {
    if (vehicleMake != null && vehicleMake.length() > 0) {
      this.vehicleMake = vehicleMake;
    } else {
      throw new IllegalVehicleArgumentException(
          "Invalid Vehicle Make " + vehicleMake
              + " Must be at least one character.");
    }
  }

  /**
   * Sets the vehicle model to the String value that is passed into it.
   *
   * @param vehicleModel String value that is assigned to vehicle model.
   * @throws IllegalVehicleArgumentException thrown if a parameter is found to be invalid.
   */
  public void setVehicleModel(String vehicleModel) throws IllegalVehicleArgumentException {
    if (vehicleModel != null && vehicleModel.length() > 0) {
      this.vehicleModel = vehicleModel;
    } else {
      throw new IllegalVehicleArgumentException(
          "Invalid Vehicle Model " + vehicleModel
              + " Must be at least one character.");
    }
  }

  /**
   * Sets vehicle frame to the Chassis object that is passed into the module.
   *
   * @param vehicleFrame Chassis value that is set to vehicleFrame value.
   * @throws IllegalVehicleArgumentException thrown if a parameter is found to be invalid.
   */
  public void setVehicleFrame(Chassis vehicleFrame) throws IllegalVehicleArgumentException {
    if (!(vehicleFrame == null)) {
      this.vehicleFrame = vehicleFrame;
    } else {
      throw new IllegalVehicleArgumentException(
          "Invalid Vehicle Frame It Must be of type Chassis.");
    }
  }

  /**
   * Sets the vehicle type to the String value that is passed into the module.
   *
   * @param vehicleType String the value that is set to vehicleType.
   * @throws IllegalVehicleArgumentException thrown if a parameter is found to be invalid.
   */
  public void setVehicleType(String vehicleType) throws IllegalVehicleArgumentException {
    if (vehicleType != null && vehicleType.length() > 0) {
      this.vehicleType = vehicleType;
    } else {
      throw new IllegalVehicleArgumentException(
          "Invalid Vehicle Type " + vehicleType
              + " Must be at least one character.");
    }
  }

  /**
   * Sets the vehicle engine to the Engine object that is passed into the module.
   *
   * @param vehicleEngine Engine, Sets the object's value to this value.
   * @throws IllegalVehicleArgumentException thrown if a parameter is found to be invalid.
   */
  public void setVehicleEngine(Engine vehicleEngine) throws IllegalVehicleArgumentException {
    if (vehicleEngine instanceof ManufacturedEngine) {
      this.vehicleEngine = vehicleEngine;
    } else {
      throw new IllegalVehicleArgumentException(
          "Invalid Vehicle Engine " + vehicleEngine
              + " Must be of type Manufactured Engine.");
    }
  }

  /**
   * The definition of a public getChassisType method that returns an instance of Chassis.
   *
   * @return Chassis, an instance of the vehicle chassis type.
   */
  public Chassis getChassisType() {
    return this.vehicleFrame;
  }

  /**
   * The definition of a public setChassisType that accepts a string named vehicleChassis and
   * returns a void.
   *
   * @param vehicleChassis Sets the String vehicleChassis.
   * @throws IllegalChassisArgumentException thrown if a parameter is found to be invalid.
   */
  public void setChassisType(String vehicleChassis) throws IllegalChassisArgumentException {
    if (vehicleType != null && vehicleType.length() > 0) {
      this.vehicleFrame.setChassisType(vehicleChassis);
    } else {
      throw new IllegalChassisArgumentException(
          "Invalid Vehicle Chassis " + vehicleChassis
              + " Must be at least one character.");
    }
  }


  /**
   * toString method. A public toString method that returns the following: Manufacturer Name   :
   * Generic Manufactured Date   : Thu Feb 02 01:38:31 MST 2015 Vehicle Make        : Generic
   * Vehicle Model       : Generic Vehicle Type        : None Engine Manufacturer : Generic Engine
   * Manufactured : Thu Feb 02 01:38:31 MST 2015 Engine Make         : Generic Engine Model        :
   * Generic Engine Type         : 88 AKI Engine Cylinders    : 0 Drive Train         : 2WD:
   * Two-Wheel Drive
   *
   * @return Vehicle toString.
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
        + vehicleEngine.toString()
        + "\nDrive Train: "
        + driveTrain);
  }
}

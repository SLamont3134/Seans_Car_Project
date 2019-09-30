/*
Sean Lamont
COP 3003
OOP Car Project
Fall 2019
 */

import java.lang.reflect.Array;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

// Create a concrete class named Car that extends the Vehicle class with the following:
public class Car extends Vehicle {

  // Create the following private instance variables:
  // private Feature[] feature = new Feature[10];
  private Feature[] feature = new Feature[10];
  private Feature[] DEFAULT_FEATURE = {new ExteriorFeature(), new InteriorFeature()};

  // private int carAxle;
  private int carAxle;

  // A public default constructor with no formal parameters and initialize all instance
  // variables with generic literal values by using the super() call.
  public Car() {
    super();
    this.carAxle = 2;
    this.feature = DEFAULT_FEATURE;
  }
  // A public overloaded constructor with a super() method call and instantiation of values for all
  // of the variables defined above
  public Car(Date vehicleManufacturedDate,
      String vehicleManufacturer,
      String vehicleMake,
      String vehicleModel,
      Chassis vehicleFrame,
      String vehicleType,
      String driveTrain,
      ManufacturedEngine vehicleEngine,
      Feature[] feature,
      int carAxle) {
    super(vehicleManufacturedDate,
        vehicleManufacturer,
        vehicleMake,
        vehicleModel,
        vehicleFrame,
        vehicleType,
        driveTrain,
        vehicleEngine);
    this.feature = feature;
    this.carAxle = carAxle;
  }

  // Public methods to return formatted strings of the Internal and External features: String
  // getExteriorFeatures()
  public String getExteriorFeatures() {
    return feature.toString();
  }


  // String getInteriorFeatures()
    public String getInteriorFeatures(){
      return feature.toString();
    }

  /*
  A public toString method that returns the following:
  Manufacturer Name   : Honda
  Manufactured Date   : Tue Jan 03 07:13:19 MST 2012
  Vehicle Make        : Honda
  Vehicle Model       : Prelude
  Vehicle Type        : null
  Engine Manufacturer : Honda
  Engine Manufactured : Thu Feb 02 02:00:28 MST 2012
  Engine Make         : H-Series
  Engine Model        : H23A1
  Engine Type         : 88 AKI
  Engine Cylinders    : 4
  Drive Train         : 2WD: Two-Wheel Drive
  Features            : Interior [AM/FM Radio]
                      : Exterior [Wood Panels]
                      : Interior [Air Conditioning]
                      : Exterior [Moonroof]
  Car Axle            : 2
   */

  public String toString() {
    /*
    String tempString = Arrays.toString(feature);
    String newString = tempString.substring(1,105);
    */

    /*
    for (int i = 0; i < tempString.length(); i++) {

      // get char at position i
      char ch = tempString.charAt(i);
      // print char
      System.out.println("Char at position " + i + " is " + ch);
      }
    */

      return super.toString() + Arrays.toString(feature) + "\nCar Axle: " + carAxle;
      }


    /*
    Write a static main method scenarios for default (no parameter) constructor and a full constructor, like:
    public Car( String     vehicleManufacturer , Date       vehicleManufacturedDate , String     vehicleMake ,
     String     vehicleModel , String     vehicleType , Chassis    vehicleFrame , Engine     vehicleEngine ,
     Feature[]  feature , int        carAxle)
     */
    public static void main(String[] args) {
      //default (no parameter) constructor
      Car test1 = new Car();
      System.out.println(test1.toString()+"\n\n\n");

    // full constructor, like:
    //    public Car( String     vehicleManufacturer , Date       vehicleManufacturedDate , String
    //   vehicleMake ,
    //     String     vehicleModel , String     vehicleType , Chassis    vehicleFrame , Engine
    // vehicleEngine ,
    //     Feature[]  feature , int        carAxle)
      ManufacturedEngine testEngine =
          new ManufacturedEngine(
              "Honda",
              Date.from(Instant.now()),
              "H-Series",
              "H23A1",
              4,
              "88 AKI",
              "2WD: Two-Wheel Drive");

      InteriorFeature testFeature1 = new InteriorFeature("AM/FM Radio");
      InteriorFeature testFeature2 = new InteriorFeature("Wood Panels");
      ExteriorFeature testFeature3 = new ExteriorFeature("Air Conditioning");
      ExteriorFeature testFeature4 = new ExteriorFeature("Moonroof");
      Feature[] feature = {testFeature1, testFeature2,testFeature3, testFeature4};

      Car test2 = new Car(Date.from(Instant.now()),
          "Honda",
          "Honda",
          "Prelude",
          new VehicleFrame(),
          null,
          "2WD: Two-Wheel Drive",
          testEngine,feature,2);

      System.out.println(test2.toString());

      }





  }


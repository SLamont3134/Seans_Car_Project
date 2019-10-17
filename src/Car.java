/**
 * @author Sean Lamont
 * @subj COP 3003
 * @breif OOP Car Project
 * @date Fall 2019
 **/

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

// Create a concrete class named Car that extends the Vehicle class with the following:
public class Car extends Vehicle {

  // Create the following private instance variables:
  // private Feature[] feature = new Feature[10];
  private ArrayList<Feature> feature = new ArrayList<Feature>();

  // private int carAxle;
  private int carAxle;

  // A public default constructor with no formal parameters and initialize all instance
  // variables with generic literal values by using the super() call.
  public Car() {
    super();
    this.carAxle = 2;
    this.feature = new ArrayList<>();
    feature.add(new ExteriorFeature());
    feature.add(new InteriorFeature());
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
      String engineManufacturer,
      Date engineManufacturedDate,
      String engineMake,
      String engineModel,
      int engineCylinders,
      String engineType,
      ArrayList<Feature> feature,
      int carAxle) {
    super(vehicleManufacturedDate,
        vehicleManufacturer,
        vehicleMake,
        vehicleModel,
        vehicleFrame,
        vehicleType,
        driveTrain,
        engineManufacturer,
        engineManufacturedDate,
        engineMake,
        engineModel,
        engineCylinders,
        engineType);
    setFeature(feature);
    this.carAxle = carAxle;
  }

  // Public methods to return formatted strings of the Internal and External features: String
  // getExteriorFeatures()
  public String getExteriorFeatures() {
    String featureString = "";
    for (Feature features : feature) {
      if (features instanceof ExteriorFeature) {
        featureString = featureString.concat(features.toString());
      }
    }
    return featureString;
  }

  // String getInteriorFeatures()
  public String getInteriorFeatures() {
    String featureString = "";
    for (Feature features : feature) {
      if (features instanceof InteriorFeature) {
        featureString = featureString.concat(features.toString());
      }
    }
    return featureString;
  }

  public void addFeature(Feature newFeature) {
    if (newFeature instanceof InteriorFeature) {
      this.feature.add(newFeature);
    }
    if (newFeature instanceof ExteriorFeature) {
      this.feature.add(newFeature);
    } else {
      return;
    }
  }


  public void setFeature(ArrayList<Feature> feature) {
    this.feature = feature;
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
    String featureString = "";
    for (Feature features : feature) {
      if (features instanceof InteriorFeature) {
        featureString = featureString.concat(features.toString());
      }
      if (features instanceof ExteriorFeature) {
        featureString = featureString.concat(features.toString());
      }
    }

    return super.toString() + featureString + "\nCar Axle: " + carAxle;
  }


  /*
  Write a static main method scenarios for default (no parameter) constructor and a
  full constructor, like:  public Car( String     vehicleManufacturer , Date
  vehicleManufacturedDate , String     vehicleMake ,
   String     vehicleModel , String     vehicleType , Chassis
   vehicleFrame , Engine     vehicleEngine ,
   Feature[]  feature , int        carAxle)
   */
  public static void main(String[] args) {
    //default (no parameter) constructor
    Car test1 = new Car();
    System.out.println(test1.toString() + "\n\n\n");

    // full constructor, like:
    //    public Car( String     vehicleManufacturer , Date       vehicleManufacturedDate , String
    //   vehicleMake ,
    //     String     vehicleModel , String     vehicleType , Chassis    vehicleFrame , Engine
    // vehicleEngine ,
    //     Feature[]  feature , int        carAxle)
    /*
    ManufacturedEngine testEngine =
        new ManufacturedEngine(
            "Honda",
            Date.from(Instant.now()),
            "H-Series",
            "H23A1",
            4,
            "88 AKI");
     */
    InteriorFeature testFeature1 = new InteriorFeature("AM/FM Radio");
    InteriorFeature testFeature2 = new InteriorFeature("Wood Panels");
    ExteriorFeature testFeature3 = new ExteriorFeature("Air Conditioning");
    ExteriorFeature testFeature4 = new ExteriorFeature("Moonroof");
    InteriorFeature testFeature5 = new InteriorFeature("Wood Paneling");
    ArrayList<Feature> feature = new ArrayList<>();
    feature.add(testFeature1);
    feature.add(testFeature2);
    feature.add(testFeature3);
    feature.add(testFeature4);

    Car test2 = new Car(Date.from(Instant.now()),
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
        "88 AKI", feature, 2);
    test2.addFeature(testFeature5);
    System.out.println(test2);


  }


}


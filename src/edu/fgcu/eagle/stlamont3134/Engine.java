package edu.fgcu.eagle.stlamont3134;

import java.util.Date;

/**
 * Created an interface Engine with the following list of public method definitions. that return a
 * void: setEngineCylinders(int engineCylinders); setEngineManufacturedDate(Date date);
 * setEngineManufacturer(String manufacturer); setEngineMake(String engineMake);
 * setEngineModel(String engineModel); setDriveTrain(String driveTrain); setEngineType(String
 * fuel);
 *
 * @author Sean Lamont COP 3003 Car Project Fall 2019
 */

public interface Engine {

  // setEngineCylinders(int engineCylinders);
  public void setEngineCylinders(int engineCylinders) throws IllegalEngineArgumentException;

  // setEngineManufacturedDate(Date date);
  public void setEngineManufacturedDate(Date date) throws IllegalEngineArgumentException;

  // setEngineManufacturer(String manufacturer);
  public void setEngineManufacturer(String manufacturer) throws IllegalEngineArgumentException;

  // setEngineMake(String engineMake);
  public void setEngineMake(String engineMake) throws IllegalEngineArgumentException;

  // setEngineModel(String engineModel);
  public void setEngineModel(String engineModel) throws IllegalEngineArgumentException;

  // setEngineType(String fuel);
  public void setEngineType(String fuel) throws IllegalEngineArgumentException;
}

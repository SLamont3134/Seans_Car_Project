/*
Sean Lamont
COP 3003
OOP Car Project
Fall 2019
 */

import java.util.Date;
/*
Create an interface Engine with the following list of public method definitions that return a void:
setEngineCylinders(int engineCylinders);
setEngineManufacturedDate(Date date);
setEngineManufacturer(String manufacturer);
setEngineMake(String engineMake);
setEngineModel(String engineModel);
setDriveTrain(String driveTrain);
setEngineType(String fuel);
 */

public interface Engine {

  // setEngineCylinders(int engineCylinders);
  public void setEngineCylinders(int engineCylinders);

  // setEngineManufacturedDate(Date date);
  public void setEngineManufacturedDate(Date date);

  // setEngineManufacturer(String manufacturer);
  public void setEngineManufacturer(String manufacturer);

  // setEngineMake(String engineMake);
  public void setEngineMake(String engineMake);

  // setEngineModel(String engineModel);
  public void setEngineModel(String engineModel);

  // setDriveTrain(String driveTrain);
  //public void setDriveTrain(String driveTrain);

  // setEngineType(String fuel);
  public void setEngineType(String fuel);
}

package Vehicles;

import Vehicles.Enum.VehiclesSize;

public class Motorcycle implements Vehicles {
    private String plateNumber;

    public Motorcycle(String plateNumber, VehiclesSize size){
        this.plateNumber = plateNumber;
    }

    public VehiclesSize getSize(){
        return VehiclesSize.SMALL;
    } 
      
    public String getPlateNumber(){
        return plateNumber;
    }
}

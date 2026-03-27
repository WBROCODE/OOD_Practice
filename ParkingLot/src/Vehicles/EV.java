package Vehicles;

import Vehicles.Enum.VehiclesSize;

public class EV implements Vehicles {
    private String plateNumber;

    public EV(String plateNumber){
        this.plateNumber = plateNumber;
    }

    public VehiclesSize getSize(){
        return VehiclesSize.MEDIUM;
    }

    public String getPlateNumber(){
    
    return plateNumber;
    }
}

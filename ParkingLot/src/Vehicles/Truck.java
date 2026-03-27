package Vehicles;

import Vehicles.Enum.VehiclesSize;

public class Truck implements Vehicles {
    private String plateNumber;

    public Truck(String plateNumber, VehiclesSize size){
        this.plateNumber = plateNumber;
    }

    @Override
    public VehiclesSize getSize(){
        return VehiclesSize.LARGE;
    }

    @Override
    public String getPlateNumber(){
        return plateNumber;
    }
}

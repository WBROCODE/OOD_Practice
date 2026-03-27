package ParkingLots;

import Vehicles.Vehicles;
import Vehicles.Enum.VehiclesSize;

public class LargeParkingLots implements ParkingLots{
    int parkingNumber;
    Vehicles vehicles;

    public LargeParkingLots(int parkingNumber){
        this.parkingNumber = parkingNumber;
        this.vehicles = null;
    }

    @Override
    public boolean isAvailable(){
        return vehicles == null;
    }

    @Override
    public void occupyParkingSpace(Vehicles vehicles){
        if(isAvailable()){
            this.vehicles = vehicles;
        }else{
            System.out.println("This Parking has been occupied.");
        }
    }

    @Override
    public void release(){
        this.vehicles = null;
    }
    @Override
    public int getParkingNumber(){
        return this.parkingNumber;
    }
    @Override
    public Vehicles getVehicles(){
        return this.vehicles;
    }
    @Override
    public VehiclesSize getVehiclesSize(){
        return VehiclesSize.LARGE;
    }
}

package ParkingLots;

import Vehicles.Vehicles;
import Vehicles.Enum.VehiclesSize;

public class CompactParkingLots implements ParkingLots{
    private int parkingNumber;
    private Vehicles vehicles;

    public CompactParkingLots(int parkingNumber){
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
            System.out.println("Parking space is not available");
        }
    }

    @Override
    public void release(){
        this.vehicles = null;
    }

    @Override
    public int getParkingNumber(){
        return parkingNumber;
    }

    @Override
    public Vehicles getVehicles(){
        return vehicles;
    }

    @Override
    public VehiclesSize getVehiclesSize(){
        return vehicles.getSize();
    }
}

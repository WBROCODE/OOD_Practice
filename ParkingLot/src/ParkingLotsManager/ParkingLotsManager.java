package ParkingLotsManager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ParkingSpots.ParkingSpots;
import Vehicles.Vehicles;
import Vehicles.Enum.VehiclesSize;

public class ParkingLotsManager {
    Map<VehiclesSize, List<ParkingSpots>> availableParkingLots;
    Map<String, ParkingSpots> vehicleToSpots;
    Map<ParkingSpots, String> spotsToVehicle;

    public ParkingLotsManager(Map<VehiclesSize, List<ParkingSpots>> availableParkingLots){
        this.availableParkingLots = availableParkingLots;
        this.vehicleToSpots = new HashMap<>();
        this.spotsToVehicle = new HashMap<>();
    }

    public ParkingSpots findParkingLots(Vehicles vehicles){
        VehiclesSize vs = vehicles.getSize();

        List<ParkingSpots> vsParkingLots = availableParkingLots.get(vs);
        for(ParkingSpots p : vsParkingLots){
            if(p.isAvailable()){
                return p;
            }
        }
        return null;
    }

    public ParkingSpots park(Vehicles vehicles){
        ParkingSpots p = findParkingLots(vehicles);
        if(p != null){
            // update occupiedParkingLots
            vehicleToSpots.put(vehicles.getPlateNumber(), p);
            // update spots To Vehicle
            spotsToVehicle.put(p, vehicles.getPlateNumber());            
            p.occupyParkingSpace(vehicles);
            // remove Parking lots
            availableParkingLots.get(p.getVehiclesSize()).remove(p);
            return p;
        }
        return null;
    }

    public void unpark(Vehicles vehicles){
        String plateNumber = vehicles.getPlateNumber();
        ParkingSpots p = vehicleToSpots.get(plateNumber);
        vehicleToSpots.remove(plateNumber);
        if(p != null){
            p.release();
            availableParkingLots.get(p.getVehiclesSize()).add(p);
        }
    }

    public ParkingSpots findByVehicle(String plate){
        return vehicleToSpots.get(plate);
    }

    public String findBySpot(ParkingSpots spot){
        return spotsToVehicle.get(spot);
    }
}

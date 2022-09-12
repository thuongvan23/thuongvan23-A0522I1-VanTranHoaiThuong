package BT.Assigment2.Repository.impl;

import BT.Assigment2.Model.Truck;
import BT.Assigment2.Repository.ITruckRepository;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    private static List<Truck> truckList = new ArrayList<>();
    @Override
    public void addingTruck(Truck truck) {
        truckList.add(truck);
    }

    @Override
    public List<Truck> getAll() {
        return truckList;
    }
}

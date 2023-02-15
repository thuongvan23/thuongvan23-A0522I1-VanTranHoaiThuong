package BT.Assigment2.Repository;

import BT.Assigment2.Model.Truck;

import java.util.List;

public interface ITruckRepository {
    void addingTruck(Truck truck);
    List<Truck> getAll();
}

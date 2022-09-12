package BT.Assigment2.Repository.impl;

import BT.Assigment2.Model.Car;
import BT.Assigment2.Repository.ICarRepository;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    private static List<Car> carList = new ArrayList<>();

    @Override
    public void addingCar(Car car) {
        carList.add(car);
    }

    @Override
    public List<Car> getAll() {
        return carList;
    }
}

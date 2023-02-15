package BT.Assigment2.Repository;

import BT.Assigment2.Model.Car;

import java.util.List;

public interface ICarRepository {

    void addingCar(Car car);

    List<Car> getAll();

}

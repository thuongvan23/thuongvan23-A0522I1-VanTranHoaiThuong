package BT.Assigment2.Service.impl;

import BT.Assigment2.Controller.VehicleController;
import BT.Assigment2.Model.Brand;
import BT.Assigment2.Model.Car;
import BT.Assigment2.Repository.ICarRepository;
import BT.Assigment2.Repository.impl.CarRepository;
import BT.Assigment2.Service.ICarService;

import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    public static Scanner scanner = new Scanner(System.in);
    public static ICarRepository iCarRepository = new CarRepository();
    public static BrandService iBrandService = new BrandService();
    @Override
    public void addingCar() {
        Car car = this.infoCar();
        iCarRepository.addingCar(car);
    }

    @Override
    public void showingCar() {
        List<Car> carList = iCarRepository.getAll();
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    @Override
    public void removeCar() {
        System.out.println("Enter car's ID: ");
        int carID = scanner.nextInt();
        loop:
        while (true) {
            for (Car car : iCarRepository.getAll()) {
                if (car.getId() == carID) {
                    System.out.println("Are you sure (1.Yes or 2.No): ");
                    if (scanner.nextInt() == 1) {
                        iCarRepository.getAll().remove(car);
                        System.out.println("Remove success.");
                        break loop;
                    } else {
                        break;
                    }
                }
            }
            System.out.println("Car isn't exist.");
            break;
        }
    }

    @Override
    public void checkingCar() {
        System.out.println("Car ID: ");
        int id = scanner.nextInt();
        loop:
        while (true){
            for (Car car : iCarRepository.getAll()) {
                if (car.getId() == id) {
                    System.out.println("Are you sure (1.Yes or 2.No): ");
                    if (scanner.nextInt() == 1) {
                        iCarRepository.getAll().remove(car);
                        System.out.println("Remove success.");
                        break loop;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    private Car infoCar() {
        System.out.print("Enter iD:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter producedBrand");
        String brand = scanner.nextLine();
        iBrandService.selectBrand(brand);
        System.out.print("Enter productYear:");
        int produceYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter owner:");
        String owner = scanner.nextLine();
        System.out.print("Enter seats:");
        int seats = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter types:");
        String type = scanner.nextLine();
        Car car = new Car(id, brand, produceYear, owner, seats, type);
        return car;
    }
}

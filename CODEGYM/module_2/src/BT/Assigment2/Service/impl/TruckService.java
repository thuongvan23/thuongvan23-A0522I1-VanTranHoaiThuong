package BT.Assigment2.Service.impl;

import BT.Assigment2.Model.Car;
import BT.Assigment2.Model.Truck;
import BT.Assigment2.Repository.ICarRepository;
import BT.Assigment2.Repository.ITruckRepository;
import BT.Assigment2.Repository.impl.CarRepository;
import BT.Assigment2.Repository.impl.TruckRepository;
import BT.Assigment2.Service.ITruckService;

import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    public static Scanner scanner = new Scanner(System.in);
    public static ICarRepository iCarRepository = new CarRepository();
    public static ITruckRepository iTruckRepository = new TruckRepository();
    @Override
    public void addTruck() {
        Truck truck = this.infoTruck();
        iTruckRepository.addingTruck(truck);
    }
    @Override
    public void showingTruck(){
        List<Truck> truckList = iTruckRepository.getAll();
        for (Truck truck : truckList){
            System.out.println(truck);
        }
    }

    @Override
    public void removeTruck() {
        System.out.println("Enter truck's ID: ");
        int truckID = scanner.nextInt();
        loop:
        while (true) {
            for (Truck truck : iTruckRepository.getAll()) {
                if (truck.getId() == truckID) {
                    System.out.println("Are you sure (1.Yes or 2.No): ");
                    if (scanner.nextInt() == 1) {
                        iTruckRepository.getAll().remove(truck);
                        System.out.println("Remove success.");
                        break loop;
                    } else {
                        return;
                    }
                }
            }
            System.out.println("Truck isn't exist.");
            break;
        }
    }

    private Truck infoTruck(){
        System.out.print("Enter iD:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter producedBrand:");
        String produceBrand = scanner.nextLine();
        System.out.print("Enter productYear:");
        int produceYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter owner:");
        String owner = scanner.nextLine();
        System.out.print("Enter tonnage:");
        int tonnage = Integer.parseInt(scanner.nextLine());
        Truck truck = new Truck(id, produceBrand, produceYear, owner, tonnage);
        return truck;
    }
}

package BT.Assigment2.Controller;

import BT.Assigment2.Service.ICarService;
import BT.Assigment2.Service.IMotoBikeService;
import BT.Assigment2.Service.ITruckService;
import BT.Assigment2.Service.impl.CarService;
import BT.Assigment2.Service.impl.MotoBikeService;
import BT.Assigment2.Service.impl.TruckService;

import java.util.Scanner;

public class AddingController {
    public static Scanner scanner = new Scanner(System.in);
    public static final ICarService iCarService = new CarService();
    public static final ITruckService iTruckService = new TruckService();
    public static final IMotoBikeService iMotoBikeService = new MotoBikeService();
    public static void addingMenu () {
        while (true) {
            System.out.println("Add new vehicle.");
            System.out.println("1. Car");
            System.out.println("2. Truck");
            System.out.println("3. MotoBike");
            System.out.println("4. Back");
            System.out.print("Enter in here: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iCarService.addingCar();
                    System.out.println("Finished adding new car");
                    break;
                case 2:
                    iTruckService.addTruck();
                    System.out.println("Finished adding new truck.");
                    break;
                case 3:
                    iMotoBikeService.addingMotoBike();
                    System.out.println("Finished adding new moto bike.");
                    break;
                case 4:
                    return;
            }
        }
    }
}

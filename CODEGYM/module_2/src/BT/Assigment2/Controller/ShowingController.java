package BT.Assigment2.Controller;

import BT.Assigment2.Service.ICarService;
import BT.Assigment2.Service.IMotoBikeService;
import BT.Assigment2.Service.ITruckService;
import BT.Assigment2.Service.impl.CarService;
import BT.Assigment2.Service.impl.MotoBikeService;
import BT.Assigment2.Service.impl.TruckService;

import java.util.Scanner;

public class ShowingController {
    public static Scanner scanner = new Scanner(System.in);
    public static ICarService iCarService = new CarService();
    public static ITruckService iTruckService = new TruckService();
    public static IMotoBikeService iMotoBikeService = new MotoBikeService();

    public static void showingMenu() {
        while (true) {
            System.out.println("Show vehicle.");
            System.out.println("1. Car");
            System.out.println("2. Truck");
            System.out.println("3. MotoBike");
            System.out.println("4. Back");
            System.out.print("Enter in here: ");
            int showing = Integer.parseInt(scanner.nextLine());
            switch (showing) {
                case 1:
                    iCarService.showingCar();
                    break;
                case 2:
                    iTruckService.showingTruck();
                    break;
                case 3:
                    iMotoBikeService.showingMotoBike();
                    break;
                case 4:
                    return;
            }

        }
    }
}

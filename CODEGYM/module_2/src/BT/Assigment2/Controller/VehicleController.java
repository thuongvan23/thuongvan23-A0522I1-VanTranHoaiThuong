package BT.Assigment2.Controller;

import java.util.Scanner;

public class VehicleController {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("What you want to do?");
            System.out.println("1. Add new vehicle");
            System.out.println("2. Check vehicle");
            System.out.println("3. Remove vehicle");
            System.out.println("4. Find vehicle by ID");
            System.out.println("5. Exit");
            System.out.print("Enter in here: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    AddingController.addingMenu();
                    break;
                case 2:
                    ShowingController.showingMenu();
                    break;
                case 3:
                    RemoveController.RemoveMenu();
                    break;
//                case 4:
                case 5:
                    System.exit(0);
            }
        }
    }
}

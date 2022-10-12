package Controllers;

import services.FacilityService;
import services.Implement.FacilityServiceImp;

import java.util.Scanner;

public class AddingServiceMenu {
    public static Scanner scanner = new Scanner(System.in);
    private static FacilityService iFacilityService = new FacilityServiceImp();

    public static void addingServiceMenu() {
        try {
            while (true) {
                System.out.println("1. Add New Villa\n" +
                        "2. Add New House\n" +
                        "3. Add New Room\n" +
                        "4. Back to menu\n" +
                        "Choose: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        iFacilityService.AddingVilla();
                        System.out.println("Completed!!");
                        break;
                    case 2:
                        iFacilityService.addingHouse();
                        System.out.println("Completed!!");
                        break;
                    case 3:
                        iFacilityService.addingRoom();
                        System.out.println("Completed!!");
                        break;
                    case 4:
                        return;
                }

            }
        } catch (Exception e) {
            System.out.println("Have to enter number...");
            addingServiceMenu();
        }
    }
}

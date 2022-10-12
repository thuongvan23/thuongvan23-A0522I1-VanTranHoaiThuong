package Controllers;

import services.FacilityService;
import services.Implement.FacilityServiceImp;

import java.util.Scanner;

public class FacilityManagement {
    private static FacilityService iFacilityService = new FacilityServiceImp();
    private static Scanner scanner = new Scanner(System.in);
    public static void manageFacility() {
        while (true) {
            System.out.println("1. Add new facility\n" +
                    "2. Display list facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu\n"+
                    "Choose: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    AddingServiceMenu.addingServiceMenu();
//                    iFacilityService.add();
//                    System.out.println("Completed!!!");
                    break;
                case 2:
                    iFacilityService.display();
                    break;
                case 3:
                    iFacilityService.displayFacilityMaintenance();
                    break;
                case 4:
                    return;
            }
        }
    }
}

package Controllers;

import services.Implement.StaffsServiceImp;
import services.StaffsService;

import java.util.Scanner;

public class StaffManagement {
    public static Scanner scanner = new Scanner(System.in);
    private static StaffsService iStaffsService = new StaffsServiceImp();
    public static void manageStaff() {
        while (true) {
            System.out.println("1. Add new employee\n" +
                    "2. Display list employees\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu\n"+
                    "Choose: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStaffsService.add();
                    System.out.println("Completed!!!");
                    break;
                case 2:
                    iStaffsService.display();
                    break;
                case 3:
                    iStaffsService.editInfo();
                    break;
                case 4:
                    return;
            }
        }
    }
}

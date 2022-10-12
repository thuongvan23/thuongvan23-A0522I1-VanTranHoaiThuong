package Controllers;

import services.CustomerService;
import services.Implement.CustomerServiceImp;

import java.util.Scanner;

public class CustomerManagement {
    public static Scanner scanner = new Scanner(System.in);
    private static CustomerService iCustomerService = new CustomerServiceImp();
    public static void manageEmployee() {
        while (true) {
            System.out.println("1. Add new customer\n" +
                    "2. Display list customers\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu\n"+
                    "Choose: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iCustomerService.add();
                    System.out.println("Completed!!!");
                    break;
                case 2:
                    iCustomerService.display();
                    break;
                case 3:
                    iCustomerService.editInfo();
                    break;
                case 4:
                    return;
            }
        }
    }
}

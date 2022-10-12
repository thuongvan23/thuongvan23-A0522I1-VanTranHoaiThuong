package Controllers;

import services.BookingService;
import services.DataService;
import services.Implement.BookingServiceImp;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            DataService.CopyData();
            while (true) {
                System.out.print("1. Staff Management\n" +
                        "2. Customer Management\n" +
                        "3. Facility Management\n" +
                        "4. Booking Management\n" +
                        "5. Promotion Management\n" +
                        "6. Exit\n" +
                        "Choose: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        StaffManagement.manageStaff();
                        break;
                    case 2:
                        CustomerManagement.manageEmployee();
                        break;
                    case 3:
                        FacilityManagement.manageFacility();
                        break;
                    case 4:
                        BookingManagement.manageBooking();
                        break;
                    case 6:
                        System.exit(0);
                }
            }
        } catch (Exception e) {
            System.out.println("Enter your choice (number)...");
        }
    }
}

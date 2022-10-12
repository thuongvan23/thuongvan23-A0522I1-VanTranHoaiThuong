package Controllers;

import services.Implement.BookingServiceImp;

import java.util.Scanner;

public class BookingManagement {
    public static Scanner scanner = new Scanner(System.in);
    public static BookingServiceImp iBookingService = new BookingServiceImp();

    public static void manageBooking() {
        while (true) {
            System.out.println("1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu\n" +
                    "Choose: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iBookingService.add();
                    iBookingService.checkFacility();
                    System.out.println("Completed!!!");
                    break;
                case 2:
                    iBookingService.display();
                    break;
                case 3:

                    break;
                case 6:
                    return;
            }
        }
    }
}

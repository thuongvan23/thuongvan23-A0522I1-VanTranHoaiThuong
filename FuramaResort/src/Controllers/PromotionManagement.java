package Controllers;

import java.util.Scanner;

public class PromotionManagement {
    public static Scanner scanner = new Scanner(System.in);
    public static void managePromotion() {
        while (true) {
            System.out.println("1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu\n"+
                    "Choose: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    return;
            }
        }
    }
}

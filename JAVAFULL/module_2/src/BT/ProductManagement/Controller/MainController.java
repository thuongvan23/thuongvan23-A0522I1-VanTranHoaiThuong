package BT.ProductManagement.Controller;

import BT.ProductManagement.Model.Product;
import BT.ProductManagement.Service.IProductManager;
import BT.ProductManagement.Service.ProductManager;

import java.util.Scanner;

public class MainController {
    public static IProductManager iProductManager = new ProductManager();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add new product");
            System.out.println("2. Show product list");
            System.out.println("3. Edit product by id");
            System.out.println("4. Remove product by id");
            System.out.println("5. Find product by name");
            System.out.println("6. Sort  by oder increase of price");
            System.out.println("7. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    iProductManager.adding();
                    break;
                case 2:
                    iProductManager.show();
                    break;
                case 3:
                    iProductManager.edit();
                    break;
                case 4:
                    iProductManager.remove();
                    break;
                case 5:
                    iProductManager.find();
                    break;
                case 6:
                    iProductManager.sort();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}

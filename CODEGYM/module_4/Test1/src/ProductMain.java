import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductMain {
    private static final List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product("1", "a", "12/12/2022", 10, 3));
    }

    static Scanner scanner = new Scanner(System.in);

    public static void addNewProduct() {
//        Nhập từ bán phím
        System.out.println("Id: ");
        String id1 = scanner.nextLine();
        System.out.println("Name: ");
        String name1 = scanner.nextLine();
        System.out.println("Exp: ");
        String exp1 = scanner.nextLine();
        System.out.println("Input Quantity: ");
        int quantity1 = Integer.parseInt(scanner.nextLine());

        Product product1 = new Product(id1, name1, exp1, quantity1, 0);
        productList.add(product1);
    }

    public static void showListProduct() {
        for (Product product : productList) {
            System.out.print(product.toString());
        }
    }

    public static void updateProduct() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Id: ");
        String id1 = scanner1.nextLine();
        System.out.print("Name: ");
        String name1 = scanner1.nextLine();
        System.out.print("Selling quantity: ");
        int sellingQuantity1 = Integer.parseInt(scanner1.nextLine());
        boolean flag = false;

        for (Product product : productList) {
            if (product.getId().equals(id1)) {
                flag = true;
                if (sellingQuantity1 <= product.getInputQuantity() - product.getSellQuantity()) {
                    product.setSellQuantity(sellingQuantity1);
                    product.setName(name1);
                } else {
                    System.out.print("Doesn't enough quantity...");
                }
            }
//            if (!flag) tương đương với if (flag == false)
            if (!flag) {
                System.out.print("Product doesn't exist...");
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.print("1. ....\n" +
                    "2. ....\n" +
                    "3. ....\n" +
                    "4. ....\n" +
                    "5. ....\n" +
                    "6. ...\n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewProduct();
                    break;
                case 2:
                    showListProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}

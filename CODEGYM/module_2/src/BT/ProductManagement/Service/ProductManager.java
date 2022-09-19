package BT.ProductManagement.Service;

import BT.ProductManagement.Model.Product;
import BT.ProductManagement.Repository.IProductRepository;
import BT.ProductManagement.Repository.ProductRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements IProductManager {

    public static Scanner scanner = new Scanner(System.in);
    public static IProductRepository iProductRepository = new ProductRepository();

    @Override
    public void adding() {
        Product product = this.infoProduct();
        iProductRepository.adding(product);
    }

    @Override
    public void edit() {
        System.out.print("Enter product's ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        loop:
        while (true) {
            for (Product product : iProductRepository.getAll()) {
                if (id == product.getId()) {
                    iProductRepository.getAll().set(iProductRepository.getAll().indexOf(product), this.infoProduct());
                    System.out.println("Finished");
                } else {
                    System.out.println("Product doesn't exist.");
                }
                return;
            }
        }
    }

    @Override
    public void remove() {
        System.out.print("Enter product's ID(remove): ");
        int id = Integer.parseInt(scanner.nextLine());
        while (true) {
            for (Product product : iProductRepository.getAll()) {
                if (id == product.getId()) {
                    iProductRepository.getAll().remove(product);
                    System.out.println("Finished");
                } else {
                    System.out.println("Product doesn't exist.");
                }
                return;
            }
        }
    }

    @Override
    public void show() {
        List<Product> productList = iProductRepository.getAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void find() {
        System.out.print("Enter product's ID(find): ");
        int id = Integer.parseInt(scanner.nextLine());
        while (true) {
            for (Product product : iProductRepository.getAll()) {
                if (id == product.getId()) {
                    System.out.println("Product in list: " + product);
                } else {
                    System.out.println("Product doesn't exist");
                }
                return;
            }
        }
    }

    @Override
    public void sort() {
        System.out.print("1. Increasing. \n2. Decreasing\n Enter:");
        int num = Integer.parseInt(scanner.nextLine());
        if (num == 1) {
            iProductRepository.getAll().sort(Comparator.comparingInt(Product::getPrice));
        } else if (num == 2) {
            iProductRepository.getAll().sort(Comparator.comparingInt(Product::getPrice));
            Collections.reverse(iProductRepository.getAll());
        }
    }

    private Product infoProduct() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter price: ");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(name, id, price);
        return product;
    }
}

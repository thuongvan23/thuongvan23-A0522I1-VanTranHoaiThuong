package BT.Assigment2.Service.impl;

import BT.Assigment2.Model.Brand;
import BT.Assigment2.Repository.impl.BrandRepository;

import java.util.Scanner;

public class BrandService {
    public static BrandRepository iBrandRepository = new BrandRepository();
    public static Scanner scanner = new Scanner(System.in);
    public void selectBrand(String brand) {
        for (Brand brand1 : iBrandRepository.brandMenu()){
            if (equals(brand) == equals(brand1)){
                brand = String.valueOf(brand1);
            } else {
                System.out.println("Brain is not exist.");
            }
        }
    }

}

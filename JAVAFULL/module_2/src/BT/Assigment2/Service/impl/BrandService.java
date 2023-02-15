package BT.Assigment2.Service.impl;

import BT.Assigment2.Model.Brand;
import BT.Assigment2.Repository.impl.BrandRepository;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class BrandService {
    public static BrandRepository iBrandRepository = new BrandRepository();
    public static Scanner scanner = new Scanner(System.in);
    public Object selectBrand(Object brand) {
        for (Brand brand1 : iBrandRepository.getAll()){
            if (brand.equals(brand1)){
                return brand1;
            } else {
                return "Brain is not exist.";
            }
        }
        return brand;
    }
}

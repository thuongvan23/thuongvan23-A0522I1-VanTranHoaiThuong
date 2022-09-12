package BT.Assigment2.Repository.impl;

import BT.Assigment2.Model.Brand;

import java.util.ArrayList;
import java.util.List;

public class BrandRepository{
    public List<Brand> brandMenu() {
        Brand a = new Brand(1, "Honda", "Japan");
        Brand a1 = new Brand(2, "Toyota", "Japan");
        Brand a2 = new Brand(3, "Hyundai", "Korea");
        Brand a3 = new Brand(4, "Mazda", "Japan");
        Brand a4 = new Brand(5, "BMW", "Germany");
        Brand a5 = new Brand(6, "Audi", "Germany");
        Brand a6 = new Brand(7, "Peugeot", "France");
        List<Brand> brandList = new ArrayList<>();
        brandList.add(a);
        brandList.add(a1);
        brandList.add(a2);
        brandList.add(a3);
        brandList.add(a4);
        brandList.add(a5);
        brandList.add(a6);
        return brandList;
    }
}

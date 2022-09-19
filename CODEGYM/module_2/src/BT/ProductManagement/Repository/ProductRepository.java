package BT.ProductManagement.Repository;

import BT.ProductManagement.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private static List <Product> productList = new ArrayList<>();

    @Override
    public void adding(Product product) {
        productList.add(product);
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }
}

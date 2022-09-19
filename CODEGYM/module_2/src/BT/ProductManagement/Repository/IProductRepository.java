package BT.ProductManagement.Repository;

import BT.ProductManagement.Model.Product;

import java.util.List;

public interface IProductRepository {
    void adding (Product product);

    List <Product> getAll();
}

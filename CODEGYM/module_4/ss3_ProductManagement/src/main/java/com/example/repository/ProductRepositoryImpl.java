package com.example.repository;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository{

    private final Map<String, Product> productDTOMap = new HashMap<>();

    {
        productDTOMap.put("A", new Product(1, "A", 1.6f, "good1", "ABC1"));
        productDTOMap.put("B", new Product(2, "B", 1.7f, "good2", "ABC2"));
        productDTOMap.put("C", new Product(3, "C", 1.8f, "good3", "ABC3"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productDTOMap.values());
    }

    @Override
    public void createAndUpdate(Product productDTO) {
        productDTOMap.put(productDTO.getName(), productDTO);
    }

    @Override
    public void delete(String name) {
        productDTOMap.remove(name);
    }

    @Override
    public Product findByName(String name) {
        return productDTOMap.get(name);
    }

    @Override
    public String showDetail(Product productDTO) {
        return productDTO.getDescription();
    }
}

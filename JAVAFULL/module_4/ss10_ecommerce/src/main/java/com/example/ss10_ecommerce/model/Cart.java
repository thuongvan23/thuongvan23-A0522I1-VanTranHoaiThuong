package com.example.ss10_ecommerce.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Item,Integer> products = new HashMap<>();

    public Cart() {
    }

    public Cart(Map<Item,Integer> products) {
        this.products = products;
    }

    public Map<Item,Integer> getProducts() {
        return products;
    }

    private boolean checkItemInCart(Item product){
        for (Map.Entry<Item, Integer> entry : products.entrySet()) {
            if(entry.getKey().getItemName().equals(product.getItemName())){
                return true;
            }
        }
        return false;
    }

    private Map.Entry<Item, Integer> selectItemInCart(Item product){
        for (Map.Entry<Item, Integer> entry : products.entrySet()) {
            if(entry.getKey().getItemName().equals(product.getItemName())){
                return entry;
            }
        }
        return null;
    }

    public void addProduct(Item product){
        if (!checkItemInCart(product)){
            products.put(product,1);
        } else {
            Map.Entry<Item, Integer> itemEntry = selectItemInCart(product);
            Integer newQuantity = itemEntry.getValue() + 1;
            products.replace(itemEntry.getKey(),newQuantity);
        }
    }

    public Integer countProductQuantity(){
        Integer productQuantity = 0;
        for (Map.Entry<Item, Integer> entry : products.entrySet()) {
            productQuantity += entry.getValue();
        }
        return productQuantity;
    }

    public Integer countItemQuantity(){
        return products.size();
    }

    public Float countTotalPayment(){
        float payment = 0;
        for (Map.Entry<Item, Integer> entry : products.entrySet()) {
            payment += entry.getKey().getPrice() * (float) entry.getValue();
        }
        return payment;
    }
}

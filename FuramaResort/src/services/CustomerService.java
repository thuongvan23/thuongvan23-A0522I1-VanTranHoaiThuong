package services;

import Models.Customer;

import java.util.List;

public interface CustomerService extends Service{
    List<Customer> getAll();
}

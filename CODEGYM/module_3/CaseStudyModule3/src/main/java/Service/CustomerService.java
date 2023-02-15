package Service;

import Model.Customer;

import java.util.List;

public interface CustomerService {
    void createOrUpdate(Customer customer);
    void deleteById(String id);
    Customer findById(String id);
    List<Customer> findAll();
}

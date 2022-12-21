package Repository;


import Model.Customer;

import java.util.LinkedHashSet;
import java.util.List;

public interface CustomerRepository {
    void createOrUpdate(Customer customer);
    void deleteById(String id);
    Customer findById(String id);
    List<Customer> findAll();
}

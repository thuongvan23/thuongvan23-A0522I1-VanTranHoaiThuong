package Repository;

import Controllers.CustomerManagement;
import Models.Customer;

import java.util.List;

public interface ICustomerRepository {
    void adding(Customer customer);
    List<Customer> getAll();
}

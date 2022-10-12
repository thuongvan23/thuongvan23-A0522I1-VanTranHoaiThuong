package Repository;

import Models.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomerRepositoryImp implements ICustomerRepository{
    List<Customer> customerList = new LinkedList<>();
    @Override
    public void adding(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerList;
    }
}

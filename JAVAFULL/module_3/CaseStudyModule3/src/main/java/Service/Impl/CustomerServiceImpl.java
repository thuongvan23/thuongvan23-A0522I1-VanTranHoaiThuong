package Service.Impl;

import Model.Customer;
import Repository.CustomerRepository;
import Repository.Impl.CustomerRepositoryImpl;
import Service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public void createOrUpdate(Customer customer) {
        customerRepository.createOrUpdate(customer);
    }

    @Override
    public void deleteById(String id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer findById(String id) {
        return  customerRepository.findById(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}

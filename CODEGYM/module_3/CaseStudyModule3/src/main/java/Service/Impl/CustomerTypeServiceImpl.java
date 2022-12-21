package Service.Impl;

import Model.CustomerType;
import Repository.CustomerTypeRepository;
import Repository.Impl.CustomerTypeRepositoryImpl;
import Service.CustomerTypeService;

import java.util.List;

public class CustomerTypeServiceImpl implements CustomerTypeService {
    CustomerTypeRepository customerTypeRepository = new CustomerTypeRepositoryImpl();
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public CustomerType findById(String id) {
        return customerTypeRepository.findById(id);
    }
}

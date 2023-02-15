package Repository.Impl;

import Model.CustomerType;
import Repository.CustomerTypeRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerTypeRepositoryImpl implements CustomerTypeRepository {
    private static Map<String, CustomerType> customerTypeMap = new HashMap<>();
    static {
        customerTypeMap.put("1", new CustomerType("1", "Diamond"));
        customerTypeMap.put("2", new CustomerType("2", "Platinum"));
        customerTypeMap.put("3", new CustomerType("3", "Gold"));
        customerTypeMap.put("4", new CustomerType("4", "Silver"));
        customerTypeMap.put("5", new CustomerType("5", "Member"));
    }

    @Override
    public List<CustomerType> findAll() {
        return new ArrayList<>(customerTypeMap.values());
    }

    @Override
    public CustomerType findById(String id) {
        return customerTypeMap.get(id);
    }
}

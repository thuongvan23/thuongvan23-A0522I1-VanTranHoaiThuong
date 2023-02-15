package Service.Impl;

import Model.Employee;
import Repository.EmployeeRepository;
import Repository.Impl.EmployeeRepositoryImpl;
import Service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.createEmployee(employee);
    }

    @Override
    public void deleteById(String id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee findById(String id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}

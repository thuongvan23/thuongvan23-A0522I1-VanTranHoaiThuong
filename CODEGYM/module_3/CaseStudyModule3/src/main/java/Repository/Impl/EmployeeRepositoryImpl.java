package Repository.Impl;

import Model.Employee;
import Repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    Map<String, Employee> employeeMap = new HashMap<>();
    @Override
    public void createEmployee(Employee employee) {
        employeeMap.put(employee.getEmployeeId(), employee);
    }

    @Override
    public void deleteById(String id) {
        employeeMap.remove(id);
    }

    @Override
    public Employee findById(String id) {
        return employeeMap.get(id);
    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(employeeMap.values());
    }
}

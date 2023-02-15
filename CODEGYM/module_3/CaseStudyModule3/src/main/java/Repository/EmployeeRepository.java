package Repository;

import Model.Employee;

import java.util.List;

public interface EmployeeRepository {
    void createEmployee(Employee employee);
    void deleteById(String id);
    Employee findById(String id);
    List<Employee> findAll();
}

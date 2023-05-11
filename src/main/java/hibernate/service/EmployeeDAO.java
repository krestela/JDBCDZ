package hibernate.service;

import hibernate.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    Integer add(Employee employee);

    Employee getByID(int id);
    List<Employee> getAllEmployee();
    void updateEmployee (int id, Employee employee);
    void deleteEmployee(Employee employee);
}

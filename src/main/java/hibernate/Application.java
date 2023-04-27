package hibernate;

import hibernate.model.Employee;
import hibernate.service.EmployeeDAO;
import hibernate.service.EmployeeDaoImpl;

public class Application {
    public static void main(String[] args) {

        Employee employee = new Employee(11, "Roman", "Furi", "m", 44, 2);
        EmployeeDAO employeeDAO = new EmployeeDaoImpl();
        employeeDAO.getAllEmployee().forEach(System.out::println);
        Integer employeeId = employeeDAO.add(employee);
        System.out.println(employeeDAO.getAllEmployee());
        System.out.println();
        employeeDAO.updateEmployee(employeeId, employee);
        employeeDAO.deleteEmployee(employeeDAO.getByID(employeeId));
        System.out.println(employeeDAO.getByID(1));


    }
}


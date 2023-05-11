package hibernate;

import hibernate.model.City;
import hibernate.model.Employee;
import hibernate.service.CityDAO;
import hibernate.service.CityDaoImpl;
import hibernate.service.EmployeeDAO;
import hibernate.service.EmployeeDaoImpl;

public class Application {
    public static void main(String[] args) {

            City moscow = City.builder().cityName("Moscow").build();
            CityDAO cityDAO = new CityDaoImpl();
            cityDAO.add(moscow);
            System.out.println(cityDAO.getAllCity().contains(moscow));
            Employee employee = Employee.builder().id(3).firstName("Vasya").lastName("Petrov").gender("m")
                    .age(30).city(moscow).build();
            EmployeeDAO employeeDAO = new EmployeeDaoImpl();
            employeeDAO.add(employee);
            System.out.println(employeeDAO.getAllEmployee().contains(employee));


    }
}


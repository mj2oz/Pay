/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author m_j2oz
 */
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private static EmployeeManager instance;
    private List<Employee> employees;

    private EmployeeManager() {
        employees = new ArrayList<>();
        // Add default employees
        employees.add(new Employee("John Doe", "E001", 50000));
        employees.add(new Employee("Jane Smith", "E002", 55000));
        employees.add(new Employee("Alice Johnson", "E003", 60000));
    }

    public static synchronized EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
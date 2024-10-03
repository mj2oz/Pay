/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author m_j2oz
 */
import java.util.ArrayList;

public class EmployeeManager {
    private final ArrayList<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
        initializeEmployees(); // Call to initialize predefined employees
    }

    private void initializeEmployees() {
        // Add predefined employees (you can customize these)
        employees.add(new Employee("John Doe", "E001", 50000));
        employees.add(new Employee("Jane Smith", "E002", 60000));
        employees.add(new Employee("Alice Johnson", "E003", 55000));
    }
    
// Method to add a new employee
    public void addEmployee(Employee employee) {
        employees.add(employee); // Add the employee to the list
    }

    public ArrayList<Employee> getEmployees() {
        return employees; // Return the list of employees
    }
}

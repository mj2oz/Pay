/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author m_j2oz
 */
public class Employee {
    private String name;
    private String id; // Assuming ID is a String. 
    private double salary;

    // Constructor
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary; // Update the salary field
    }
    
    // Optionally, you can add a method to display employee details
    public String displayInfo() {
        return "Name: " + name + ", ID: " + id + ", Salary: $" + salary;
    }
}

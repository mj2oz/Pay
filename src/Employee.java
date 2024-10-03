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
    private double bonus;
    private double deductions;
    private double total_salary;

    // Constructor
    public Employee(String name, String id, double salary, double bonus, double deductions) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
        this.total_salary = salary + bonus - deductions;
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
    public void setSalary(double salary, double deductions, double bonus) {
        this.salary = salary; // Update the salary field
        this.deductions = deductions; // Update deductions
        this.bonus = bonus; // Update bonus
    }
    
    // Optionally, you can add a method to display employee details
    public String displayInfo() {
        return "Name: " + name + ", ID: " + id + ", Basic Salary: $" + salary + "Total Salary: $"+ total_salary;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author garima
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> listOfEmployees;

    public EmployeeDirectory() {
        listOfEmployees = new ArrayList();
    }

    public ArrayList<Employee> getListOfEmployees() {
        return listOfEmployees;
    }
    
    public Employee createEmployee(int employeeId, String name){
        Employee employee = new Employee(employeeId);
        employee.setName(name);
        listOfEmployees.add(employee);
        return employee;
    }
}
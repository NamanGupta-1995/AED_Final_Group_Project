/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author namangupta
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeDirectory;

    public EmployeeDirectory() {
        employeeDirectory = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public Employee createEmployee(int id,String name){
        Employee employee = new Employee(id);
        employee.setEmployeeName(name);
        employeeDirectory.add(employee);
        return employee;
    }
}
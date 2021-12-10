/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author namangupta
 */
public class Employee {
    
    private String employeeName;
    private int employeeId;
    public Employee(int count) {
        employeeId = count;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    
    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toString() {
        return employeeName;
    }
    
    
}

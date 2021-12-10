/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author GarimaC
 */
public class UsersDirectory {
    
    private ArrayList<Users> accountList;

    public UsersDirectory() {
        accountList = new ArrayList();
    }

    public ArrayList<Users> getAccountList() {
        return accountList;
    }
    
    public Users authenticateUser(String username, String password){
        for (Users ua : accountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
     public Users createUserAccount(String name, String password, Employee emp, Role userRole ){
        Users account = new Users();
        account.setUsername(name);
        account.setPassword(password);
        account.setEmployee(emp);
        account.setRole(userRole);
        if(accountList.contains(account)){
           JOptionPane.showMessageDialog(null, "Username Already Exists Please try anothe username");
        }else{
        accountList.add(account);
        }
        return account;
    }
    
    public Users createUserAccount(String username, String password,String contact,String add,String qualification, String gender,
            boolean availabile, int age, Employee emp, Role userRole,boolean bloodAvailability){
        Users account = new Users();
        account.setUsername(username);
        account.setPassword(password);
        account.setEmployee(emp);
        account.setRole(userRole);
        account.setContact(contact);
        account.setUserAddress(add);
        account.setAge(age);
        account.setGender(gender);
        account.setUserIsAvailable(availabile);
        account.setQualifications(qualification);
        account.setUserIsAvailableforOrganDonation(bloodAvailability);
        accountList.add(account);
        return account;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (Users ua : accountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }

    public void createUserAccount(String userName, String password, String contact, 
            String address, String qualification, String file_path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}       

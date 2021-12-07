/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author GarimaC
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> accountList;

    public UserAccountDirectory() {
        accountList = new ArrayList();
    }

    public ArrayList<UserAccount> getAccountList() {
        return accountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : accountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
     public UserAccount createUserAccount(String name, String password, Employee emp, Role userRole ){
        UserAccount account = new UserAccount();
        account.setUsername(name);
        account.setPassword(password);
        account.setEmployee(emp);
        account.setRole(userRole);
        //userAccount.setDate(date);
        if(accountList.contains(account)){
           // JOptionPane.showMessageDialog(null, "Username Already Exists Please try anothe username");
        }else{
        accountList.add(account);
        }
        return account;
    }
    
    public UserAccount createUserAccount(String username, String password,String contact,String add,String qualification, String gender,
            boolean availabile, int age, Employee emp, Role userRole,boolean bloodAvailability){
        UserAccount account = new UserAccount();
        account.setUsername(username);
        account.setPassword(password);
        account.setEmployee(emp);
        account.setRole(userRole);
        account.setContact(contact);
        account.setUserAddress(add);
        account.setAge(age);
        account.setGender(gender);
        account.setIsAvailable(availabile);
        account.setQualification(qualification);
        account.setIsAvailableForBloodDonation(bloodAvailability);
        //userAccount.setDate(date);
        accountList.add(account);
        return account;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : accountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }

    public void createUserAccount(String userName, String password, String phNum, String Address, String qalString, String file_path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}       

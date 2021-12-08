/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author garima
 */
public class PersonDirectory {
    List<Person> listOfPersons;
    
    PersonDirectory(){
       listOfPersons = new ArrayList<Person>();
    }

    public List<Person> getListOfPersons() {
        return listOfPersons;
    }

    public void setListOfPersons(List<Person> listOfPersons) {
        this.listOfPersons = listOfPersons;
    }
    
    
}

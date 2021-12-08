/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organ;

import java.util.ArrayList;

/**
 *
 * @author garima
 */
public class OrganDirectory {

    private ArrayList<Organ> listOfOrgans;

    public OrganDirectory() {
        
        listOfOrgans = new ArrayList<Organ>();
        Organ org1 = new Organ("Heart", "O positive");
        Organ org2 = new Organ("Liver", "O positive");
        Organ org3 = new Organ("Eyes", "O positive");
        Organ org4 = new Organ("Kidney", "O positive");
        Organ org5 = new Organ("Lungs", "O positive");
        Organ org6 = new Organ("Pancreas", "O positive");
        Organ org7 = new Organ("Blood", "O positive");
        
        listOfOrgans.add(org1);
        listOfOrgans.add(org2);
        listOfOrgans.add(org3);
        listOfOrgans.add(org4);
        listOfOrgans.add(org5);
        listOfOrgans.add(org6);
        listOfOrgans.add(org7);
    }

    public ArrayList<Organ> getListOfOrgans() {
        return listOfOrgans;
    }

    public void setListOfOrgans(ArrayList<Organ> listOfOrgans) {
        this.listOfOrgans = listOfOrgans;
    }
    public void addOrgan(Organ o){
        
        listOfOrgans.add(o);
     
    }
    
    public void removeOrgan(Organ o){
        listOfOrgans.remove(o);
        
    }

}

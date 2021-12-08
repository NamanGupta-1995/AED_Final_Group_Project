/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organ;

/**
 *
 * @author garima
 */

public class Organ {
    private String typeOfOrgan;
    private String bloodGroup;
    private boolean isAvailable;
    private String network;

    public Organ(String typeOfOrgan, String bloodGroup) {
        this.typeOfOrgan = typeOfOrgan;
        this.bloodGroup = bloodGroup;
        this.isAvailable =  true;
        
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getTypeOfOrgan() {
        return typeOfOrgan;
    }

    public void setTypeOfOrgan(String typeOfOrgan) {
        this.typeOfOrgan = typeOfOrgan;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    
      @Override
    public String toString(){
        return this.typeOfOrgan;
    }
    
    
    
    
}

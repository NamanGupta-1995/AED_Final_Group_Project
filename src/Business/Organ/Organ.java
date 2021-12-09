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
     private String organName;
    private String type_of_blood;
    private boolean available;
    private String Network;

    public Organ(String organName, String blood_type) {
        this.organName = organName;
        this.type_of_blood = blood_type;
        this.available =  true;
        
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getType_of_blood() {
        return type_of_blood;
    }

    public void setType_of_blood(String type_of_blood) {
        this.type_of_blood = type_of_blood;
    }
      @Override
    public String toString(){
        return this.type_of_blood;
    }
    
}

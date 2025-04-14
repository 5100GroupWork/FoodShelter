/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author 59386
 */
public class EnterPriseDirctory {
    ArrayList<BasicEnterprise> enterprises;
    
    // create enterprise
    public  BasicEnterprise createEnterprise(String name, String type){
//        Food("FoodEnterprise"),
//        Volunteer("VolunteerEnterprise"),
//        RescueNet("RescueNetEnterprise"),
//        FreshCheck("FreshCheckEnterprise");

        BasicEnterprise basicEnterprise =null;
        if(type.equals("Food")){
            basicEnterprise = new FoodEnterprise(name);
        }
        if(type.equals("Volunteer")){
            basicEnterprise = new VolunteerEnterprise(name);
        }
        if(type.equals("RescueNet")){
            basicEnterprise = new RescueNetEnterprise(name);
        }
        if(type.equals("FreshCheck")){
            basicEnterprise = new FreshCheckEnterprise(name);
        }
     return basicEnterprise;
    }

    public ArrayList<BasicEnterprise> getEnterprises() {
        return enterprises;
    }

    public void setEnterprises(ArrayList<BasicEnterprise> enterprises) {
        this.enterprises = enterprises;
    }

    
}

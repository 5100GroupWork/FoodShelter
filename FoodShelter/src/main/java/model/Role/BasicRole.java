/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.Account.UserAccount;
import model.Enterprise.BasicEnterprise;
import model.FoodShelterSystem.FoodShelterSystem;
import model.Organization.BasicOrganization;

/**
 *
 * @author 59386
 */
public abstract class BasicRole {
    
    public enum RoleType{
        SystemAdmin("SystemAdmin"),
        FoodIncEmpolyee("FoodIncEmpolyee"),
        Deliver("Deliver"),
        TaskManager("TaskManager"),
        Homeless("Homeless"),
        ShelterManager("ShelterManager"),
        ShelterHelper("ShelterHelper"),
        FreshChecker("FreshChecker"),
        WarehouseChecker("WarehouseChecker");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
        public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            BasicOrganization organization, 
            BasicEnterprise enterprise, 
            FoodShelterSystem business);
    
    
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}

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
public class WareHourseChecker extends BasicRole{
    String name;
    BasicOrganization org;
    public WareHourseChecker(String name,BasicOrganization org){
        this.name = name;
        this.org = org;
    }
    
//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, FoodShelterSystem business) {
//        return new WareHourseCheckerWorkAreaJPanel(userProcessContainer, enterprise);
//    }
    
}

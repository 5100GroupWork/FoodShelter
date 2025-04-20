/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.Account.UserAccount;
import model.Enterprise.BasicEnterprise;
import model.FoodShelterSystem.FoodShelterSystem;
import model.NetWork.NetWork;
import model.Organization.BasicOrganization;
import ui.RescueNetAdminWorkArea.RescueNetAdminStartPoint;

/**
 *
 * @author sylvia
 */
public class RescueNetAdmin extends BasicRole {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,
                                  BasicOrganization organization, BasicEnterprise enterprise, NetWork network,FoodShelterSystem system) {
        return new RescueNetAdminStartPoint(userProcessContainer, account, organization, enterprise, network);
    }

    @Override
    public String toString() {
        return "RescueNetAdmin";
    }
    
}

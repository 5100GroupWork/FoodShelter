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
import ui.ShelterHelperWorkArea.ShelterHelperWorkPanel;

/**
 *
 * @author 59386
 */
public class Volunteer extends BasicRole{
    
    
    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, NetWork netWork,FoodShelterSystem system) {
        //volunteer 是救助中心的volunteer
        return new ShelterHelperWorkPanel(workArea,account,organization,enterprise,netWork);
    }
    
}

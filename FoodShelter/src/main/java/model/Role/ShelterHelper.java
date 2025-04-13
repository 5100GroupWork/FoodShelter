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
import model.WorkQueue.WorkQueue;
import model.WorkQueue.WorkRequest;

/**
 *
 * @author 59386
 */
public class ShelterHelper extends BasicRole{
    String name;
    BasicOrganization org;
    public ShelterHelper(String name,BasicOrganization org){
        this.name = name;
        this.org = org;
    }
    
    // getAll CheckedFoodItem
    public WorkQueue getAllCheckItem(NetWork netWork){
        return netWork.getWarehouseList();
    }
    
    // create a delievery request
    public void CreateDeliveryRequest(WorkRequest workRequestFoodItem){
        
    }
    
    
//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, FoodShelterSystem business) {
//        return new ShelterHelperWorkAreaJPanel(userProcessContainer, enterprise);
//    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.Account.UserAccount;
import model.Enterprise.BasicEnterprise;
import model.FoodItem.FoodItem;
import model.FoodShelterSystem.FoodShelterSystem;
import model.NetWork.NetWork;
import model.Organization.BasicOrganization;
import model.WorkQueue.WorkQueue;
import model.WorkQueue.WorkRequestFoodItem;

/**
 *
 * @author 59386
 */
public class FreshChecker extends BasicRole{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BasicOrganization getOrg() {
        return org;
    }

    public void setOrg(BasicOrganization org) {
        this.org = org;
    }

    String name;
    BasicOrganization org;
    public FreshChecker(String name,BasicOrganization org){
        this.name = name;
        this.org = org;
    }
    // freshChecker check the foodItem
    public WorkQueue getAllfoodItem(NetWork netWork){
        return netWork.getCheckList();
    }
    
    // check the foodItem
    public void checkFoodItem(WorkRequestFoodItem workRequestFoodItem,String status){
        FoodItem foodItem = workRequestFoodItem.getFoodItem();
        foodItem.setFoodStatus(status);
    }
    
    
//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, FoodShelterSystem business) {
//        return new FreshCheckerWorkAreaJPanel(userProcessContainer, enterprise);
//    }
    
}

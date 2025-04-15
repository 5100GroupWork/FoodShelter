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
import ui.FreshCheckWorkArea.PostFoodCheckPanel;

/**
 *
 * @author 59386
 */
public class WareHourseChecker extends BasicRole{
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
    public WareHourseChecker(String name,BasicOrganization org){
        this.name = name;
        this.org = org;
    }
    // freshChecker check the foodItem
    public WorkQueue getAllfoodItem(NetWork netWork){
        return netWork.getWarehouseList();
    }
    
    // check the foodItem
    public void checkFoodItem(WorkRequestFoodItem workRequestFoodItem,String status){
        FoodItem foodItem = workRequestFoodItem.getFoodItem();
        foodItem.setFoodStatus(status);
    }
    
    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, NetWork netWork) {
        //todo 跳转到一个管理界面还没有做
        return new PostFoodCheckPanel(workArea, enterprise,organization,netWork);
    }
    
    
}

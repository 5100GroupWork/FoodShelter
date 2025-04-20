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
import model.Organization.RequestEntertainOrg;
import model.WorkQueue.WorkQueue;
import model.WorkQueue.WorkRequest;
import model.WorkQueue.WorkRequestDelivery;
import ui.RescueNetAdminWorkArea.ShelterHelperAdmin;
import ui.ShelterHelperWorkArea.ShelterHelperWorkPanel;

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
    /**
     * 
     * @param foodItem    从list中拿到
     * @param ShelterOrg  从属的org
     * @param time 
     */
    public void CreateDeliveryRequest(FoodItem foodItem,RequestEntertainOrg ShelterOrg,String time){
        // date sender 已经设置了
        // foodItem中有一个address  && org中也有一个address
        WorkRequestDelivery workRequestDelivery = ShelterOrg.newRequestDelivery();
        workRequestDelivery.setFoodItem(foodItem);
    }
    
    /**
     * 对homeless的请求的状态进行修改
     * @param homelessRequest
     * @param status 
     */
    public void ChangeHomelessRquest(WorkRequest homelessRequest, String status){
        homelessRequest.setStatus(status); // accepted || rejected 
    }
    
    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, NetWork netWork,FoodShelterSystem system) {
        //
        return new ShelterHelperWorkPanel(workArea, account, organization, enterprise, netWork);
    }
    

}

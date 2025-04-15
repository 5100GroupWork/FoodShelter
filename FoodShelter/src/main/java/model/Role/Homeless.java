/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import java.util.ArrayList;
import javax.swing.JPanel;
import model.Account.UserAccount;
import model.Enterprise.BasicEnterprise;
import model.Enterprise.RescueNetEnterprise;
import model.FoodShelterSystem.FoodShelterSystem;
import model.Organization.BasicOrganization;
import model.Organization.RequestCollectOrg;
import model.WorkQueue.WorkQueue;
import model.WorkQueue.WorkRequestNeeds;

/**
 *
 * @author 59386
 */
public class Homeless extends BasicRole{
    WorkQueue homelessWorkQueue;
    
    public Homeless(){
        this.homelessWorkQueue = new WorkQueue();
    }
    
    // create a request to belonged org
    public WorkRequestNeeds createRequest(String message,RescueNetEnterprise rescueNetEnterprise,RequestCollectOrg org){
        WorkRequestNeeds workRequestNeeds = new WorkRequestNeeds();
        this.homelessWorkQueue.getWorkRequestList().add(workRequestNeeds);
        org.getWorkQueue().getWorkRequestList().add(workRequestNeeds);
        workRequestNeeds.setMessage(message);
        workRequestNeeds.setSender(rescueNetEnterprise.getRequestCollectOrg());
        workRequestNeeds.setReceiver(rescueNetEnterprise.getRequestEntertainOrg());
        return workRequestNeeds;
    }
    
    public WorkQueue getAllRequest(){
        return this.homelessWorkQueue;
    }
    
    
//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, FoodShelterSystem business) {
//        return new HomelessWorkAreaJPanel(userProcessContainer, enterprise);
//    }
    
}

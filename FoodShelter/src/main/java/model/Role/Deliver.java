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
import model.WorkQueue.WorkQueue;
import model.WorkQueue.WorkRequest;
import model.WorkQueue.WorkRequestDelivery;

/**
 *
 * @author 59386
 */
public class Deliver extends BasicRole{
    /**
     * 
     * @param userProcessContainer
     * @param account
     * @param organization
     * @param enterprise
     * @param business
     * @return 
     * 
     * 
     * 快递接单业务,workQueue
     */
    WorkQueue doingWorkQueue = new WorkQueue();
    WorkQueue finishedWorkQueue = new WorkQueue();
    int workExp = 0;
    
    public void newWorkQueue(WorkRequest request){
        this.doingWorkQueue.getWorkRequestList().add(request);      
    }
    
    public void WorkQueueFinished(WorkRequest request){
        this.finishedWorkQueue.getWorkRequestList().add(request);
        this.doingWorkQueue.removeWorkRequest(request);
    }
    
    public int getDeliverExp(){
       return this.finishedWorkQueue.getWorkRequestList().size()*5;
    }
    
    // status change
    public void changeDeliveryStatus(WorkRequestDelivery workRequestDelivery, String Status){
        workRequestDelivery.setStatus(Status);
    }
    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, FoodShelterSystem business) {
        return new DeliverWorkAreaJPanel(userProcessContainer, enterprise);
    }
    
}

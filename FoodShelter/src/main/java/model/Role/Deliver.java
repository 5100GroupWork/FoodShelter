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
import model.WorkQueue.WorkRequestDelivery;
import ui.DriverWorkArea.DriverWorkPanel;

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
    
    private static int count = 1;
    private int ID;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    String status;//"free / bussy"
    String contact;
    
    public Deliver() {
        this.ID = ++count;
        this.status = "Available";
    }
    
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }



    public int getID() {
        return ID;
    }
     
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
    
    public WorkQueue getWorkQueue(){
        return  this.doingWorkQueue;
    }
    
    public boolean isBusy() {
        return !this.doingWorkQueue.getWorkRequestList().isEmpty();
    }

    public void updateStatus() {
        this.status = this.isBusy() ? "busy" : "Available";
    }
    
    
    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, NetWork netWork,FoodShelterSystem system) {
        return new DriverWorkPanel(workArea, enterprise,organization,netWork,account);
    }
    
}

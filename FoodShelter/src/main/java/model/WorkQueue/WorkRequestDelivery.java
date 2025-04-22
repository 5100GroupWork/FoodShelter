/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import model.Account.UserAccount;
import model.Role.Deliver;

/**
 *
 * @author 59386
 */
public class WorkRequestDelivery extends WorkRequestFoodItem{
    
    private String fromLocation;
    private String toLocation;
    
    String TaskStatus;// UnPick/ picked/ deliverying / accepted  
    
    
    public WorkRequestDelivery() {
        super();
        this.TaskStatus = "Waiting to be picked up";
    }
    public String getTaskStatus() {
        return TaskStatus;
    }

    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }



    public UserAccount getDeliver() {
        return deliver;
    }

    public void setDeliver(UserAccount deliver) {
        this.deliver = deliver;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }
    
    UserAccount deliver;
    
    @Override
    public String toString(){
        return this.getTaskStatus();
    }
    
}

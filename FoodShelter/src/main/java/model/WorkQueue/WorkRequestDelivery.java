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
    
    String TaskStatus;// UnPick/ picked/ deliverying / accepted  

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

    
    UserAccount deliver;
    
    @Override
    public String toString(){
        return this.getTaskStatus();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import model.Role.Deliver;

/**
 *
 * @author 59386
 */
public class WorkRequestDelivery extends WorkRequestFoodItem{

    public Deliver getDeliver() {
        return deliver;
    }

    public void setDeliver(Deliver deliver) {
        this.deliver = deliver;
    }
    
    Deliver deliver;
    // status : shipped / deliverying / accepted  
    
}

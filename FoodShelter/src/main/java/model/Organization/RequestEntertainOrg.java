/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Organization.BasicOrganization.Type;
import model.Role.BasicRole;
import model.Role.FoodIncEmployee;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author 59386
 */
public class RequestEntertainOrg extends BasicOrganization{
    WorkQueue DeliveryQueue;
    
    public RequestEntertainOrg(String name) {
        super(Type.RequestEntertain.getValue(),name);
        this.DeliveryQueue = new WorkQueue();
    }
    
    @Override
    public ArrayList<BasicRole> getSupportedRole() {
        ArrayList<BasicRole> roles = new ArrayList();
        roles.add(new FoodIncEmployee());
        return roles;
    }
}

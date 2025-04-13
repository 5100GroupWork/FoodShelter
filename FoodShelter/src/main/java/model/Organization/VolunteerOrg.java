/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.BasicRole;
import model.Role.Deliver;
import model.Role.FoodIncEmployee;
import model.Role.TaskManager;

/**
 *
 * @author 59386
 */
public class VolunteerOrg extends BasicOrganization{
    
    public VolunteerOrg(String name) {
        super(Type.Volunteer.getValue(),name);
    }
    
    @Override
    public ArrayList<BasicRole> getSupportedRole() {
        ArrayList<BasicRole> roles = new ArrayList();
        roles.add(new TaskManager());
        roles.add(new Deliver());
        return roles;
    }
    
}

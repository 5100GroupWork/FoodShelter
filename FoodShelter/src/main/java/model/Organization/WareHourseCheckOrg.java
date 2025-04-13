/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.BasicRole;
import model.Role.Deliver;
import model.Role.TaskManager;
import model.Role.WareHourseChecker;

/**
 *
 * @author 59386
 */
public class WareHourseCheckOrg extends BasicOrganization{
    
    public WareHourseCheckOrg(String name) {
        super(Type.Volunteer.getValue(),name);
    }
    
    @Override
    public ArrayList<BasicRole> getSupportedRole() {
        ArrayList<BasicRole> roles = new ArrayList();
        roles.add(new WareHourseChecker(null, null));
        return roles;
    }
    
}

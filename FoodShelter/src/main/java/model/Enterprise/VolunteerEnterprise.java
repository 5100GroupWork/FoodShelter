/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;
import model.Role.BasicRole;
import model.Role.FoodIncEmployee;

/**
 *
 * @author 59386
 */
public class VolunteerEnterprise extends BasicEnterprise{
    
    public VolunteerEnterprise(String name){
        super(name, BasicEnterpriseType.Volunteer);
    }
    
    @Override
    public ArrayList<BasicRole> getSupportedRole() {
        ArrayList<BasicRole> roles = new ArrayList();
        roles.add(new FoodIncEmployee());
        return roles;
    }
}

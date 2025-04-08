/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Organization.BasicOrganization.Type;
import model.Role.BasicRole;
import model.Role.FoodIncEmployee;
import model.Role.FreshChecker;

/**
 *
 * @author 59386
 */
public class NewFoodCheckOrg extends BasicOrganization{
    
    public NewFoodCheckOrg() {
        super(Type.NewFoodChecker.getValue());
    }
    
    @Override
    public ArrayList<BasicRole> getSupportedRole() {
        ArrayList<BasicRole> roles = new ArrayList();
        roles.add(new FreshChecker());
        return roles;
    }
    
}

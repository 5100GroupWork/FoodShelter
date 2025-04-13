/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.BasicRole;
import model.Role.FreshChecker;

/**
 *
 * @author 59386
 */
public class NewFoodCheckOrg extends BasicOrganization{
    
    public NewFoodCheckOrg(String name) {
        super(Type.NewFoodChecker.getValue(),name);
    }
    
    // add newFoodChecker
    // 这部分内容应该放入FoodCheckerManager中
//    public FreshChecker addFreshChecker(){
//        
//    }
//    
    @Override
    public ArrayList<BasicRole> getSupportedRole() {
        ArrayList<BasicRole> roles = new ArrayList();
        roles.add(new FreshChecker(null,null));
        return roles;
    }
    
}


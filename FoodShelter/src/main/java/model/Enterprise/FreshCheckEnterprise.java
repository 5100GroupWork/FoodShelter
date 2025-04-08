/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;
import model.FoodItem.FoodItem;
import model.Organization.NewFoodCheckOrg;
import model.Organization.WareHourseCheckOrg;
import model.Role.BasicRole;
import model.Role.FoodIncEmployee;

/**
 *
 * @author 59386
 * 
 * there is only one foodCheckerEnterprise in system
 */
public class FreshCheckEnterprise extends BasicEnterprise{

    
    NewFoodCheckOrg newFoodCheckOrg;
    WareHourseCheckOrg wareHourseCheckOrg;
    
    public NewFoodCheckOrg getNewFoodCheckOrg() {
        return newFoodCheckOrg;
    }

    public void setNewFoodCheckOrg(NewFoodCheckOrg newFoodCheckOrg) {
        this.newFoodCheckOrg = newFoodCheckOrg;
    }

    public WareHourseCheckOrg getWareHourseCheckOrg() {
        return wareHourseCheckOrg;
    }

    public void setWareHourseCheckOrg(WareHourseCheckOrg wareHourseCheckOrg) {
        this.wareHourseCheckOrg = wareHourseCheckOrg;
    }
    
    public FreshCheckEnterprise(String name) {
        super("FreshChecker", BasicEnterpriseType.FreshCheck);
    }
    
    @Override
    public ArrayList<BasicRole> getSupportedRole() {
        ArrayList<BasicRole> roles = new ArrayList();
        roles.add(new FoodIncEmployee());
        return roles;
    }
    
}

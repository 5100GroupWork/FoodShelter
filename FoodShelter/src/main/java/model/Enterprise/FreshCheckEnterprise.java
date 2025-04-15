/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;
import model.Account.UserAccount;
import model.FoodItem.FoodItem;
import model.Organization.NewFoodCheckOrg;
import model.Organization.WareHouseCheckOrg;
import model.Role.BasicRole;
import model.Role.FoodIncEmployee;

/**
 *
 * @author 59386
 * 
 * there is only one foodCheckerEnterprise in system
 */
public class FreshCheckEnterprise extends BasicEnterprise{

    public ArrayList<NewFoodCheckOrg> getNewFoodCheckOrgs() {
        return newFoodCheckOrgs;
    }

    public void setNewFoodCheckOrgs(ArrayList<NewFoodCheckOrg> newFoodCheckOrgs) {
        this.newFoodCheckOrgs = newFoodCheckOrgs;
    }

    public ArrayList<WareHouseCheckOrg> getWareHourseCheckOrg() {
        return wareHourseCheckOrgs;
    }

    public void setWareHourseCheckOrg(ArrayList<WareHouseCheckOrg> wareHourseCheckOrg) {
        this.wareHourseCheckOrgs = wareHourseCheckOrg;
    }
    
    /////////////////////////////////////////////////////////
    // add
    public NewFoodCheckOrg addNewFoodCheckOrg(String name){
        NewFoodCheckOrg newFoodCheckOrg = new NewFoodCheckOrg(name);
        this.newFoodCheckOrgs.add(newFoodCheckOrg);
        return  newFoodCheckOrg;
    }
    
    public WareHouseCheckOrg addWareHourseCheckOrg(String name){
        WareHouseCheckOrg wareHourseCheckOrg = new WareHouseCheckOrg(name);
        this.wareHourseCheckOrgs.add(wareHourseCheckOrg);
        return wareHourseCheckOrg;
    }
    
    // remove 
    public boolean removeNewFoodCheckOrg(NewFoodCheckOrg org) {
        return this.newFoodCheckOrgs.remove(org);
    }

    public boolean removeWareHourseCheckOrg(WareHouseCheckOrg org) {
        return this.wareHourseCheckOrgs.remove(org);
    }
    
    ArrayList<NewFoodCheckOrg> newFoodCheckOrgs;
    ArrayList<WareHouseCheckOrg> wareHourseCheckOrgs;

    public ArrayList<WareHouseCheckOrg> getWareHourseCheckOrgs() {
        return wareHourseCheckOrgs;
    }

    public void setWareHourseCheckOrgs(ArrayList<WareHouseCheckOrg> wareHourseCheckOrgs) {
        this.wareHourseCheckOrgs = wareHourseCheckOrgs;
    }

    public ArrayList<UserAccount> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<UserAccount> employees) {
        this.employees = employees;
    }
    ArrayList<UserAccount> employees;
   
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

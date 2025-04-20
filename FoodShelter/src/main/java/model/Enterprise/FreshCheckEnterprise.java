/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;
import model.Account.UserAccount;
import model.Organization.NewFoodCheckOrg;
import model.Organization.PushedFoodCheckOrg;
import model.Role.BasicRole;
import model.Role.FoodIncEmployee;

/**
 *
 * @author 59386
 * 
 * there is only one foodCheckerEnterprise in system
 */
public class FreshCheckEnterprise extends BasicEnterprise{

    private ArrayList<NewFoodCheckOrg> newFoodCheckOrgs = new ArrayList<>();
    private ArrayList<UserAccount> employees = new ArrayList<>();
    private ArrayList<PushedFoodCheckOrg> pushedFoodCheckOrgs = new ArrayList<>();
    
    public FreshCheckEnterprise(String name) {
        super("FreshChecker", BasicEnterpriseType.FreshCheck);
        this.newFoodCheckOrgs = new ArrayList<>();
        this.pushedFoodCheckOrgs = new ArrayList<>();
        this.employees = new ArrayList<>();
    }
    
    public ArrayList<NewFoodCheckOrg> getNewFoodCheckOrgs() {
        if (newFoodCheckOrgs == null) {
            newFoodCheckOrgs = new ArrayList<>();
        }
        return newFoodCheckOrgs;
    }

    public void setNewFoodCheckOrgs(ArrayList<NewFoodCheckOrg> newFoodCheckOrgs) {
        this.newFoodCheckOrgs = newFoodCheckOrgs;
    }

    
    public ArrayList<PushedFoodCheckOrg> getPushedFoodCheckOrgs() {
    if (pushedFoodCheckOrgs == null) {
        pushedFoodCheckOrgs = new ArrayList<>();
    }
    return pushedFoodCheckOrgs;
    
   
}
    
    public PushedFoodCheckOrg addPushedFoodCheckOrg(String name) {
    PushedFoodCheckOrg pushedFoodCheckOrg = new PushedFoodCheckOrg(name);
    this.pushedFoodCheckOrgs.add(pushedFoodCheckOrg);
    this.getOrganizationDirectory().getOrganizationList().add(pushedFoodCheckOrg); // 同时添加到组织目录
    return pushedFoodCheckOrg;
}

    public boolean removePushedFoodCheckOrg(PushedFoodCheckOrg org) {
        return this.pushedFoodCheckOrgs.remove(org);
    }
    /////////////////////////////////////////////////////////
    // add
    public NewFoodCheckOrg addNewFoodCheckOrg(String name){
        NewFoodCheckOrg newFoodCheckOrg = new NewFoodCheckOrg(name);
        this.newFoodCheckOrgs.add(newFoodCheckOrg);
        return  newFoodCheckOrg;
    }
   
    
    // remove 
    public boolean removeNewFoodCheckOrg(NewFoodCheckOrg org) {
        return this.newFoodCheckOrgs.remove(org);
    }

    public ArrayList<UserAccount> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<UserAccount> employees) {
        this.employees = employees;
    }

    
    @Override
    public ArrayList<BasicRole> getSupportedRole() {
        ArrayList<BasicRole> roles = new ArrayList();
        roles.add(new FoodIncEmployee());
        return roles;
    }
    
}

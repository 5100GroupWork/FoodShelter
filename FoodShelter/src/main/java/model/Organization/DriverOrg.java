/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Account.UserAccount;
import model.Role.BasicRole;
import model.Role.FoodIncEmployee;

/**
 *
 * @author 59386
 */
public class DriverOrg extends BasicOrganization{
    ArrayList<UserAccount> employees;
    
    
    public DriverOrg(String name){
        super(Type.DriverOrg.getValue(),name);
        this.employees = new ArrayList<>();
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

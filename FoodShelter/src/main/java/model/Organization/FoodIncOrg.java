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
 * 添加employee的时候要同时新建UserAccount先才行
 */
public class FoodIncOrg extends BasicOrganization{
    ArrayList<UserAccount> employees;
    String address;
    
    
    
    public ArrayList<UserAccount> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<UserAccount> employees) {
        this.employees = employees;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public FoodIncOrg(String name) {
        super(Type.FoodInc.getValue(),name);
        employees = new ArrayList<>();
    }
    
    @Override
    public ArrayList<BasicRole> getSupportedRole() {
        ArrayList<BasicRole> roles = new ArrayList();
        roles.add(new FoodIncEmployee());
        return roles;
    }
    
}

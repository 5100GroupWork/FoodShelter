/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.BasicRole;
import model.Role.FoodIncEmployee;

/**
 *
 * @author 59386
 * 添加employee的时候要同时新建UserAccount先才行
 */
public class FoodIncOrg extends BasicOrganization{
    ArrayList<FoodIncEmployee> employees;
    String address;
    
    
    
    public ArrayList<FoodIncEmployee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<FoodIncEmployee> employees) {
        this.employees = employees;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public FoodIncOrg() {
        super(Type.FoodInc.getValue());
    }
    
    @Override
    public ArrayList<BasicRole> getSupportedRole() {
        ArrayList<BasicRole> roles = new ArrayList();
        roles.add(new FoodIncEmployee());
        return roles;
    }
    
}

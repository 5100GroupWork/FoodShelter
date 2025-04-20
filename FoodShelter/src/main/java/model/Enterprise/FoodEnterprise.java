/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;
import model.Account.UserAccount;
import model.NetWork.NetWork;
import model.Organization.FoodIncOrg;
import model.Organization.NewFoodCheckOrg;
import model.Role.BasicRole;
import model.Role.FoodEnterpriseManager;
import model.Role.FoodIncEmployee;

/**
 *
 * @author 59386
 */
public class FoodEnterprise extends BasicEnterprise{
    private ArrayList<FoodIncOrg> foodIncOrgs;
    ArrayList<UserAccount> employees;
    
    
    // init
    // 导入需要的名称，比如xxx食品公司
    public FoodEnterprise(String name){
        super(name, BasicEnterpriseType.Food);
        employees = new ArrayList<>();
        foodIncOrgs = new ArrayList<>();

    }
    // add
    public FoodIncOrg addFoodIncOrg(String name){
        FoodIncOrg foodIncOrg = new FoodIncOrg(name);
        this.foodIncOrgs.add(foodIncOrg);
        this.getOrganizationDirectory().getOrganizationList().add(foodIncOrg);
        return  foodIncOrg;
    }
    
    //remove 
    public void removeOrg(FoodIncOrg foodIncOrg){
        this.foodIncOrgs.remove(foodIncOrg);
        return;
    }
    
    // add FoodEnterprise employee
    public UserAccount addEmployee(NetWork netWork, String name, String pwd){
        UserAccount user = netWork.getUserAccountDirctory().createUserAccount(name, pwd, new FoodEnterpriseManager());
        this.employees.add(user);
        return user;
    }
    

    public ArrayList<UserAccount> getEmployees() {
        return employees;
    }
    public void setEmployees(ArrayList<UserAccount> employees) {
        this.employees = employees;
    }
    public ArrayList<FoodIncOrg> getFoodIncOrgs() {
        return foodIncOrgs;
    }

    public void setFoodIncOrgs(ArrayList<FoodIncOrg> foodIncOrgs) {
        this.foodIncOrgs = foodIncOrgs;
    }
    
    @Override
    public ArrayList<BasicRole> getSupportedRole() {
        ArrayList<BasicRole> roles = new ArrayList();
        roles.add(new FoodIncEmployee());
        return roles;
    }
    
    
}

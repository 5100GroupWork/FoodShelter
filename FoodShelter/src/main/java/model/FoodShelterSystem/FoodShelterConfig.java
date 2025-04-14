/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.FoodShelterSystem;

import java.util.ArrayList;
import model.Account.UserAccount;
import model.Enterprise.BasicEnterprise;
import model.Enterprise.FoodEnterprise;
import model.NetWork.NetWork;
import model.Organization.FoodIncOrg;
import model.Role.FoodEnterpriseManager;
import model.Role.FoodIncEmployee;
import model.Role.SysAdmin;

/**
 *
 * @author 59386
 */
public class FoodShelterConfig {
    
    public static FoodShelterSystem configure(){
        
        FoodShelterSystem system = FoodShelterSystem.getInstance();
        
        // create a system admin
        NetWork  netWork = system.createAndAddNetwork();
        UserAccount systemAdmin = netWork.getUserAccountDirctory().createUserAccount("systemAdmin", "0000",new SysAdmin() );
        
        
        // create 4 enterprise
        // food enterprise
        FoodEnterprise foodEnterprise = (FoodEnterprise)netWork.getEnterpriseDirectory().createEnterprise("WhoolFoods", "Food");
        BasicEnterprise volunteerEnterprise = netWork.getEnterpriseDirectory().createEnterprise("volunteer", "Volunteer");
        BasicEnterprise freshChEnterprise = netWork.getEnterpriseDirectory().createEnterprise("FreshChecker", "FreshChecker");
        BasicEnterprise rescuEnterprise = netWork.getEnterpriseDirectory().createEnterprise("RescueNet", "RescueNet");
        
        // create enterprise employee
        UserAccount foodEnplyee = netWork.getUserAccountDirctory().createUserAccount("Mike", "0000",new FoodEnterpriseManager());
        foodEnterprise.getEmployees().add(foodEnplyee);
        
        FoodIncOrg foodIncOrg = foodEnterprise.addFoodIncOrg("WhoolFoods-blackbay");
        foodIncOrg.setAddress("blackbay-Boston-MA");
        UserAccount foodIncOrgEmployee = netWork.getUserAccountDirctory().createUserAccount("Jhon", "0000",new FoodIncEmployee());
        foodIncOrg.getEmployees().add(foodIncOrgEmployee);
        // creat Org
        return system;
    }
    
}

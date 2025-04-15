/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.FoodShelterSystem;

import java.util.ArrayList;
import model.Account.UserAccount;
import model.Enterprise.BasicEnterprise;
import model.Enterprise.FoodEnterprise;
import model.Enterprise.FreshCheckEnterprise;
import model.Enterprise.RescueNetEnterprise;
import model.Enterprise.VolunteerEnterprise;
import model.NetWork.NetWork;
import model.Organization.FoodIncOrg;
import model.Organization.NewFoodCheckOrg;
import model.Organization.WareHourseCheckOrg;
import model.Role.FoodCheckEnManager;
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
        FoodEnterprise foodEnterprise = (FoodEnterprise)netWork.getEnterpriseDirectory().createEnterprise("FoodEnterprise", "Food");
        VolunteerEnterprise volunteerEnterprise = (VolunteerEnterprise)netWork.getEnterpriseDirectory().createEnterprise("volunteer", "Volunteer");
        FreshCheckEnterprise freshCheckerEnterprise = (FreshCheckEnterprise)netWork.getEnterpriseDirectory().createEnterprise("FreshChecker", "FreshChecker");
        RescueNetEnterprise rescuEnterprise = (RescueNetEnterprise)netWork.getEnterpriseDirectory().createEnterprise("RescueNet", "RescueNet");
        
        // create enterprise details
        UserAccount foodEnplyee = netWork.getUserAccountDirctory().createUserAccount("Mike", "0000",new FoodEnterpriseManager());
        foodEnterprise.getEmployees().add(foodEnplyee);
        
        FoodIncOrg foodIncOrg = foodEnterprise.addFoodIncOrg("WhoolFoods-backbay");
        foodIncOrg.setAddress("blackbay-Boston-MA");
        UserAccount foodIncOrgEmployee = netWork.getUserAccountDirctory().createUserAccount("Jhon", "0000",new FoodIncEmployee());
        foodIncOrg.getEmployees().add(foodIncOrgEmployee);
        
        
        // create freshCheckerEnterprise details
        // add manager
        UserAccount checkManager = netWork.getUserAccountDirctory().createUserAccount("Alven", "0000",new FoodCheckEnManager(freshCheckerEnterprise));
        freshCheckerEnterprise.getEmployees().add(checkManager);
        
            // create 2 orgs
        NewFoodCheckOrg newFoodCheckOrg = freshCheckerEnterprise.addNewFoodCheckOrg("NewFoodCheckOrg");
        WareHourseCheckOrg wareHourseCheckOrg = freshCheckerEnterprise.addWareHourseCheckOrg("WareHouseCheckOrg");
            // create employees in orgs
        UserAccount employee_org1 = netWork.getUserAccountDirctory().createUserAccount("Alven", "0000",new FoodCheckEnManager(freshCheckerEnterprise));
        
        // creat Org
        return system;
    }
    
}

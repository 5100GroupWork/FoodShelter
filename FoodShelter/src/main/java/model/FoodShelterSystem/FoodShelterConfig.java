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
import model.Organization.DriverOrg;
import model.Organization.FoodIncOrg;
import model.Organization.NewFoodCheckOrg;
import model.Organization.RequestCollectOrg;
import model.Organization.RequestEntertainOrg;
import model.Organization.VolunteerOrg;
import model.Organization.WareHourseCheckOrg;
import model.Role.DeliverManager;
import model.Role.FoodCheckEnManager;
import model.Role.FoodEnterpriseManager;
import model.Role.FoodIncEmployee;
import model.Role.HomelessManager;
import model.Role.ShelterHelperManager;
import model.Role.SysAdmin;
import model.Role.VolunteerManager;

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
        FoodCheckEnManager foodCheckEnManager =new FoodCheckEnManager(freshCheckerEnterprise);
        checkManager.setRole(foodCheckEnManager);
        freshCheckerEnterprise.getEmployees().add(checkManager);
        
            // create 2 orgs
        NewFoodCheckOrg newFoodCheckOrg = freshCheckerEnterprise.addNewFoodCheckOrg("NewFoodCheckOrg");
        WareHourseCheckOrg wareHourseCheckOrg = freshCheckerEnterprise.addWareHourseCheckOrg("WareHouseCheckOrg");
            // create employees in orgs
        //UserAccount employee_org1 = netWork.getUserAccountDirctory().createUserAccount("Alven", "0000",new FoodCheckEnManager(freshCheckerEnterprise));
        foodCheckEnManager.addFreshChecker(newFoodCheckOrg, netWork, "Alven", "0000");
        foodCheckEnManager.addWarehouseChecker(wareHourseCheckOrg, netWork, "James", "0000");
        
        
        // create volunteer/driveryOrg org and preoples
        VolunteerOrg volunteerOrg  = volunteerEnterprise.createVolunteerOrg("VolunteerOrg1");
        DriverOrg driverOrg  = volunteerEnterprise.createDriverOrg("DriverOrg1");
        
        DeliverManager deliverManager = new DeliverManager(driverOrg);
        UserAccount uaDeliverManager = netWork.getUserAccountDirctory().createUserAccount("Ashley", "0000", deliverManager);
        deliverManager.createDriver(driverOrg, netWork, "Jessica", "0000");
        
        VolunteerManager volunteerManager = new VolunteerManager(volunteerOrg);
        UserAccount uavolunteerManager = netWork.getUserAccountDirctory().createUserAccount("Sarah", "0000", volunteerManager);
        volunteerManager.createVolunteer(volunteerOrg, netWork, "Taylor", "0000");
        
        
        //create rescueNetOrg(helper and homeless) and people
        RequestCollectOrg requestCollectOrg = rescuEnterprise.addRequestCollectOrg("HomelessOrg1");
        RequestEntertainOrg requestEntertainOrg = rescuEnterprise.addRequestEntertainOrg("ShelterHelperOrg1");
        
        ShelterHelperManager shelterHelperManager  = new ShelterHelperManager(requestEntertainOrg);
        UserAccount uaShelterManager = netWork.getUserAccountDirctory().createUserAccount("Morgan", "0000", shelterHelperManager);
        shelterHelperManager.addShelterHelper(requestEntertainOrg, "Jones", "0000", netWork);
        
        HomelessManager homelessManager = new HomelessManager(requestCollectOrg);
        homelessManager.addHomeLess(requestCollectOrg, "homeless1", "0000", netWork);
        
        return system;
    }
    
}

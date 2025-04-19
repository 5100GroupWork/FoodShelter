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
import model.Organization.WareHouseCheckOrg;
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
        
        if (netWork.getEnterpriseDirectory().getEnterprises() == null) {
        netWork.getEnterpriseDirectory().setEnterprises(new ArrayList<>());
        }
            
        UserAccount systemAdmin = netWork.getUserAccountDirctory().createUserAccount("systemAdmin", "0000",new SysAdmin() );
        
        
        // create 4 enterprise
        // food enterprise
        FoodEnterprise foodEnterprise = (FoodEnterprise)netWork.getEnterpriseDirectory().createEnterprise("FoodEnterprise", "Food");
        VolunteerEnterprise volunteerEnterprise = (VolunteerEnterprise)netWork.getEnterpriseDirectory().createEnterprise("volunteer", "Volunteer");
        
        FreshCheckEnterprise freshCheckerEnterprise = (FreshCheckEnterprise)netWork.getEnterpriseDirectory().createEnterprise("FreshChecker", "FreshChecker");
        if (freshCheckerEnterprise == null) {
            System.out.println("Creating FreshCheckEnterprise manually because it was null");
            freshCheckerEnterprise = new FreshCheckEnterprise("FreshChecker");
            netWork.getEnterpriseDirectory().getEnterprises().add(freshCheckerEnterprise);
        }
      
        RescueNetEnterprise rescuEnterprise = (RescueNetEnterprise)netWork.getEnterpriseDirectory().createEnterprise("RescueNet", "RescueNet");
        
        if (foodEnterprise.getEmployees() == null) {
            foodEnterprise.setEmployees(new ArrayList<>());
        }
        // Verify freshCheckerEnterprise is not null before using

        if(freshCheckerEnterprise != null){
                if (freshCheckerEnterprise.getEmployees() == null) {
                    freshCheckerEnterprise.setEmployees(new ArrayList<>());
                }

        // create enterprise details
        UserAccount foodEnplyee = netWork.getUserAccountDirctory().createUserAccount("Mike", "0000",new FoodEnterpriseManager());
        foodEnplyee.setOrganization(foodEnterprise);  //zhiyu添加
        foodEnterprise.getEmployees().add(foodEnplyee);
        
        FoodIncOrg foodIncOrg = foodEnterprise.addFoodIncOrg("WholeFoods-backbay");
        foodIncOrg.setAddress("Backbay-Boston-MA");
        UserAccount foodIncOrgEmployee = netWork.getUserAccountDirctory().createUserAccount("John", "0000",new FoodIncEmployee());
        foodIncOrgEmployee.setOrganization(foodIncOrg); //zhiyu添加
        foodIncOrg.getEmployees().add(foodIncOrgEmployee);
        
        
        // create freshCheckerEnterprise details
        // add manager
        UserAccount checkManager = netWork.getUserAccountDirctory().createUserAccount("Alven", "0000",new FoodCheckEnManager(freshCheckerEnterprise));
        checkManager.setOrganization(freshCheckerEnterprise);//zhiyu添加
        FoodCheckEnManager foodCheckEnManager =new FoodCheckEnManager(freshCheckerEnterprise);
        checkManager.setRole(foodCheckEnManager);

        freshCheckerEnterprise.getEmployees().add(checkManager);

            // Create 2 orgs - move this inside the null check
            try {
                NewFoodCheckOrg newFoodCheckOrg = freshCheckerEnterprise.addNewFoodCheckOrg("NewFoodCheckOrg");

                // Initialize if needed
                if (newFoodCheckOrg == null) {
                    // Create manually if add method failed
                    newFoodCheckOrg = new NewFoodCheckOrg("NewFoodCheckOrg");
                    // Add to enterprise if needed
                }

                WareHouseCheckOrg wareHourseCheckOrg = freshCheckerEnterprise.addWareHourseCheckOrg("WareHouseCheckOrg");

                // Initialize if needed
                if (wareHourseCheckOrg == null) {
                    // Create manually if add method failed
                    wareHourseCheckOrg = new WareHouseCheckOrg("WareHouseCheckOrg");
                    // Add to enterprise if needed
                }

                // Create employees in orgs
                foodCheckEnManager.addFreshChecker(newFoodCheckOrg, netWork, "Alven", "0000");
                foodCheckEnManager.addWarehouseChecker(wareHourseCheckOrg, netWork, "James", "0000");
            } catch (Exception e) {
                System.out.println("Error creating organizations: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.out.println("ERROR: freshCheckerEnterprise is still null after manual creation attempt!");
        }
               
        // create volunteer/driveryOrg org and preoples
        VolunteerOrg volunteerOrg  = volunteerEnterprise.createVolunteerOrg("VolunteerOrg1");
        DriverOrg driverOrg  = volunteerEnterprise.createDriverOrg("DriverOrg1");
        
//        DeliverManager deliverManager = new DeliverManager(driverOrg);
//        UserAccount uaDeliverManager = netWork.getUserAccountDirctory().createUserAccount("Ashley", "0000", deliverManager);
        
        
        
        VolunteerManager volunteerManager = new VolunteerManager(volunteerOrg);
        UserAccount uavolunteerManager = netWork.getUserAccountDirctory().createUserAccount("Sarah", "0000", volunteerManager);
        volunteerManager.createVolunteer(volunteerOrg, netWork, "Taylor", "0000");
        volunteerManager.createDriver(driverOrg, netWork, "Jessica", "0000");
        
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

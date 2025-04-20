/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.FoodShelterSystem;

import java.util.ArrayList;
import model.Account.UserAccount;
import model.Enterprise.FoodEnterprise;
import model.Enterprise.FreshCheckEnterprise;
import model.Enterprise.RescueNetEnterprise;
import model.Enterprise.VolunteerEnterprise;
import model.NetWork.NetWork;
import model.Organization.DriverOrg;
import model.Organization.FoodIncOrg;
import model.Organization.NewFoodCheckOrg;
import model.Organization.PushedFoodCheckOrg;
import model.Organization.RequestCollectOrg;
import model.Organization.RequestEntertainOrg;
import model.Organization.VolunteerOrg;
import model.Role.FoodIncEmployee;
import model.Role.FreshChecker;
import model.Role.HomelessManager;
import model.Role.PostFoodChecker;
import model.Role.ShelterHelperManager;
import model.Role.SysAdmin;
import model.Role.VolunteerManager;

/**
 *
 * @author 59386
 */
public class FoodShelterConfig {

        public static FoodShelterSystem configure(String name,FoodShelterSystem system) {

                if(system==null){
                    system = FoodShelterSystem.getInstance();
                }
                
                // create a system admin
                NetWork netWork = system.createAndAddNetwork();
                if(name == null){
                    netWork.setName("Boston Shelter");
                }
                if (netWork.getEnterpriseDirectory().getEnterprises() == null) {
                        netWork.getEnterpriseDirectory().setEnterprises(new ArrayList<>());
                }

                UserAccount systemAdmin = netWork.getUserAccountDirctory().createUserAccount("systemAdmin", "0000",
                                new SysAdmin());
                
                systemAdmin.setEmail("admin@foodshelter.org");
                systemAdmin.setPhone("555-000-0000");

                // create 4 enterprise
                // food enterprise
                FoodEnterprise foodEnterprise = (FoodEnterprise) netWork.getEnterpriseDirectory()
                                .createEnterprise("FoodEnterprise", "Food");
                VolunteerEnterprise volunteerEnterprise = (VolunteerEnterprise) netWork.getEnterpriseDirectory()
                                .createEnterprise("volunteer", "Volunteer");
                FreshCheckEnterprise freshCheckerEnterprise = (FreshCheckEnterprise) netWork.getEnterpriseDirectory()
                                .createEnterprise("FreshChecker", "FreshChecker");
                if (freshCheckerEnterprise == null) {
                        System.out.println("Creating FreshCheckEnterprise manually because it was null");
                        freshCheckerEnterprise = new FreshCheckEnterprise("FreshChecker");
                        netWork.getEnterpriseDirectory().getEnterprises().add(freshCheckerEnterprise);
                }
                RescueNetEnterprise rescuEnterprise = (RescueNetEnterprise) netWork.getEnterpriseDirectory()
                                .createEnterprise("RescueNet", "RescueNet");

                // create enterprise details
                // add FoodInc org into food-enterprise
                // 在这里改变之前的设计，user同时归属于enterprise/org/network （如果在下面的层级中存在的话）
                FoodIncOrg foodIncOrg = foodEnterprise.addFoodIncOrg("WholeFoods-backbay");
                foodIncOrg.setAddress("Backbay-Boston-MA");
                UserAccount foodEnplyee = netWork.getUserAccountDirctory().createUserAccount("Mike", "0000",
                                new FoodIncEmployee());
                foodEnplyee.setOrganization(foodIncOrg);
                foodEnplyee.setEnterprise(foodEnterprise);
                
                foodEnplyee.setEmail("mike@wholefoods.com");
                foodEnplyee.setPhone("555-123-4567");
                
                foodIncOrg.getEmployees().add(foodEnplyee);
                foodEnterprise.getEmployees().add(foodEnplyee);

                // create freshCheckerEnterprise details
                // 4/19修改，这里FoodChecker
                // 不再单端设置FoodCheckerEnterpriseManager，所有的newfoodchecker/pushedFoodChecker
                // 人数都是固定的
                // 创建 PushedFoodCheckOrg 和 WarehouseCheckOrg 用户
                NewFoodCheckOrg newFoodCheckOrg = new NewFoodCheckOrg("NewFoodCheckOrg");
                PushedFoodCheckOrg pushedFoodCheckOrg = new PushedFoodCheckOrg("PushedFoodCheckOrg");
                freshCheckerEnterprise.getNewFoodCheckOrgs().add(newFoodCheckOrg);
                freshCheckerEnterprise.getPushedFoodCheckOrgs().add(pushedFoodCheckOrg);

                // 里面加上两个checker
                UserAccount pfUser1 = netWork.getUserAccountDirctory().createUserAccount("Alven-1", "0000",
                                new PostFoodChecker());
                UserAccount pfUser2 = netWork.getUserAccountDirctory().createUserAccount("Alven-2", "0000",
                                new PostFoodChecker());
                
        
                pfUser1.setEmail("alven1@freshcheck.org");
                pfUser1.setPhone("555-234-5678");

                pfUser2.setEmail("alven2@freshcheck.org");
                pfUser2.setPhone("555-234-5679");
                pushedFoodCheckOrg.getUserAccountDirectory().getUserAccountList().add(pfUser1);
                pushedFoodCheckOrg.getUserAccountDirectory().getUserAccountList().add(pfUser2);
                pfUser1.setEnterprise(freshCheckerEnterprise);
                pfUser2.setEnterprise(freshCheckerEnterprise);
                pfUser1.setOrganization(pushedFoodCheckOrg);
                pfUser1.setOrganization(pushedFoodCheckOrg);

                UserAccount nfUser1 = netWork.getUserAccountDirctory().createUserAccount("Peter-1", "0000",
                                new FreshChecker());
                UserAccount nfUser2 = netWork.getUserAccountDirctory().createUserAccount("Peter-2", "0000",
                                new FreshChecker());
                
  
                nfUser1.setEmail("peter1@freshcheck.org");
                nfUser1.setPhone("555-345-6789");

                nfUser2.setEmail("peter2@freshcheck.org");
                nfUser2.setPhone("555-345-6780");
                
                newFoodCheckOrg.getUserAccountDirectory().getUserAccountList().add(nfUser1);
                newFoodCheckOrg.getUserAccountDirectory().getUserAccountList().add(nfUser2);
                nfUser1.setEnterprise(freshCheckerEnterprise);
                nfUser2.setEnterprise(freshCheckerEnterprise);
                nfUser1.setOrganization(newFoodCheckOrg);
                nfUser2.setOrganization(newFoodCheckOrg);

                // create volunteer/driveryOrg org and preoples

                VolunteerOrg volunteerOrg = volunteerEnterprise.createVolunteerOrg("VolunteerOrg1");
                DriverOrg driverOrg = volunteerEnterprise.createDriverOrg("DriverOrg1");

                VolunteerManager volunteerManager = new VolunteerManager(volunteerEnterprise);
                UserAccount uavolunteerManager = netWork.getUserAccountDirctory().createUserAccount("Sarah", "0000",
                                volunteerManager);
                
                uavolunteerManager.setEmail("sarah@volunteer.org");
                uavolunteerManager.setPhone("555-456-7890");
                
                uavolunteerManager.setOrganization(null);
                uavolunteerManager.setEnterprise(volunteerEnterprise);

                UserAccount volunteer = volunteerManager.createVolunteer(volunteerOrg, netWork, "Taylor", "0000");
                volunteer.setEmail("taylor@volunteer.org");
                volunteer.setPhone("555-567-8901");
                
                UserAccount driver = volunteerManager.createDriver(driverOrg, netWork, "Jessica", "0000");
                driver.setEmail("jessica@driver.org");
                driver.setPhone("555-678-9012");

                // create rescueNetOrg(helper and homeless) and people
                RequestCollectOrg requestCollectOrg = rescuEnterprise.addRequestCollectOrg("HomelessOrg1");
                RequestEntertainOrg requestEntertainOrg = rescuEnterprise.addRequestEntertainOrg("ShelterHelperOrg1");

                ShelterHelperManager shelterHelperManager = new ShelterHelperManager(requestEntertainOrg);
                
                UserAccount uaShelterManager = netWork.getUserAccountDirctory().createUserAccount("Morgan", "0000",
                                shelterHelperManager);
                uaShelterManager.setEmail("morgan@rescue.org");
                uaShelterManager.setPhone("555-789-0123");
                
                UserAccount helper = shelterHelperManager.addShelterHelper(requestEntertainOrg, "Jones", "0000", netWork);
                helper.setEmail("jones@rescue.org");
                helper.setPhone("555-890-1234");

                HomelessManager homelessManager = new HomelessManager(requestCollectOrg);
                UserAccount homeless = homelessManager.addHomeLess(requestCollectOrg, "homeless1", "0000", netWork);
                homeless.setEmail("homeless1@rescue.org");
                homeless.setPhone("555-901-2345");

                return system;
        }

}

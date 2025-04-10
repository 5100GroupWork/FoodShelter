/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.Account.UserAccount;
import model.Account.UserAccountDirctory;
import model.Enterprise.BasicEnterprise;
import model.FoodShelterSystem.FoodShelterSystem;
import model.NetWork.NetWork;
import model.Organization.BasicOrganization;
import model.Organization.NewFoodCheckOrg;
import model.Organization.RequestCollectOrg;

/**
 *
 * @author 59386
 */
public class FoodOrgManager extends BasicRole{
    String name;
    BasicOrganization org;
    public FoodOrgManager(String name,BasicOrganization org){
        this.name = name;
        this.org = org;
    }
    
    // add freshchecker and warehousechecker
    public UserAccount addFreshChecker(NewFoodCheckOrg org,NetWork netWork,String username, String password){
        FreshChecker fc = new FreshChecker(username,org);
        UserAccount freshChecker = netWork.getUserAccountDirctory().createUserAccount(username,password,fc);
        org.getUserAccountDirectory().getUserAccountList().add(freshChecker);   
        return  freshChecker;
    }
    
    public UserAccount addWarehouseChecker(NewFoodCheckOrg org,NetWork netWork,String username, String password){
        WareHourseChecker whc = new WareHourseChecker(username,org);
        UserAccount warehouseEmployee = netWork.getUserAccountDirctory().createUserAccount(username,password,whc);
        org.getUserAccountDirectory().getUserAccountList().add(warehouseEmployee);   
        return warehouseEmployee ;
    }
    
    
    
    
//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, FoodShelterSystem business) {
//        return new CollectorManager(userProcessContainer, enterprise);
//    }
}

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
import model.Organization.WareHouseCheckOrg;
import ui.FoodProviderWorkArea.DonationFormPanel;
import ui.FreshCheckWorkArea.NewFoodCheckPanel;

/**
 *
 * @author 59386
 */
public class FoodCheckEnManager extends BasicRole{
    BasicEnterprise en;
    
    public FoodCheckEnManager(BasicEnterprise org){
        this.en = org;
    }
    
    // add freshchecker and warehousechecker
    public UserAccount addFreshChecker(NewFoodCheckOrg org,NetWork netWork,String username, String password){
        FreshChecker fc = new FreshChecker(username,org);
        UserAccount freshChecker = netWork.getUserAccountDirctory().createUserAccount(username,password,fc);
        freshChecker.setRole(fc);
        org.getUserAccountDirectory().getUserAccountList().add(freshChecker);   
        return  freshChecker;
    }
    
    public UserAccount addWarehouseChecker(WareHouseCheckOrg org,NetWork netWork,String username, String password){
        WareHourseChecker whc = new WareHourseChecker(username,org);
        UserAccount warehouseEmployee = netWork.getUserAccountDirctory().createUserAccount(username,password,whc);
        warehouseEmployee.setRole(whc);
        org.getUserAccountDirectory().getUserAccountList().add(warehouseEmployee);   
        return warehouseEmployee ;
    }
    
    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, NetWork netWork) {
    return new NewFoodCheckPanel(workArea, account, organization, enterprise, netWork);
}
   
}

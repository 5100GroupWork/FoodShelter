/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.Account.UserAccount;
import model.Enterprise.BasicEnterprise;
import model.FoodShelterSystem.FoodShelterSystem;
import model.NetWork.NetWork;
import model.Organization.BasicOrganization;
import model.Organization.RequestCollectOrg;
import model.Organization.RequestEntertainOrg;
import ui.RescueNetAdminWorkArea.ShelterHelperAdmin;
import ui.ShelterHelperWorkArea.ShelterHelperWorkPanel;

/**
 *
 * @author 59386
 */
public class ShelterHelperManager extends BasicRole{
    //String name;
    BasicOrganization org;
    public ShelterHelperManager(BasicOrganization org){
        //this.name = name;
        this.org = org;
    }
    
    // add helter
    public UserAccount addShelterHelper(RequestEntertainOrg org,String username, String password,NetWork netWork){
        ShelterHelper sh = new ShelterHelper();
        UserAccount helper = netWork.getUserAccountDirctory().createUserAccount(username,password,sh);
        org.getUserAccountDirectory().getUserAccountList().add(helper);
        return helper;
    }  
    
    
    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, NetWork netWork,FoodShelterSystem system) {
        //r
        return new ShelterHelperAdmin(workArea,account,organization,enterprise,netWork);
    }
    
}

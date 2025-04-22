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
import model.Organization.RequestCollectOrg;
import ui.RescueNetAdminWorkArea.HomelessAdmin;
import ui.RescueNetAdminWorkArea.RescueNetAdminStartPoint;

/**
 *
 * @author 59386
 */
public class HomelessManager extends BasicRole{
//    String name;
    BasicOrganization org;
    public HomelessManager(BasicOrganization org){
        this.org = org;
    }
    
    // add homeless
    public UserAccount addHomeLess(RequestCollectOrg org,String username, String password,NetWork netWork){
        Homeless homeless = new Homeless();
        UserAccount homelessUser = netWork.getUserAccountDirctory().createUserAccount(username,password,homeless);
        //org.userAccountDirectory.getUserAccountList().add(homelessUser);
        org.getUserAccountDirectory().getUserAccountList().add(homelessUser);
        homelessUser.setOrganization(org);
        return homelessUser;
    }
    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, NetWork netWork,FoodShelterSystem system) {
        //
        return new RescueNetAdminStartPoint(workArea,account,organization,enterprise,netWork);
    }

    
}

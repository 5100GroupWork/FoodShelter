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

/**
 *
 * @author 59386
 */
public class CollectorManager extends BasicRole{
    String name;
    BasicOrganization org;
    public CollectorManager(String name,BasicOrganization org){
        this.name = name;
        this.org = org;
    }
    
    // add homeless
    public UserAccount addHomeLess(RequestCollectOrg org,String username, String password,NetWork netWork){
        Homeless homeless = new Homeless();
        UserAccount homelessUser = netWork.getUserAccountDirctory().createUserAccount(username,password,homeless);
        //org.userAccountDirectory.getUserAccountList().add(homelessUser);
        org.getUserAccountDirectory().getUserAccountList().add(homelessUser);
        return homelessUser;
    }

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, FoodShelterSystem business) {
//        return new CollectorManager(userProcessContainer, enterprise);
//    }
    
}

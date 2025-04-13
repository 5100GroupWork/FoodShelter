/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import model.Account.UserAccount;
import model.NetWork.NetWork;
import model.Organization.BasicOrganization;
import model.Organization.RequestCollectOrg;
import model.Organization.RequestEntertainOrg;

/**
 *
 * @author 59386
 */
public class ShelterHelperManager extends BasicRole{
    String name;
    BasicOrganization org;
    public ShelterHelperManager(String name,BasicOrganization org){
        this.name = name;
        this.org = org;
    }
    
    // add homeless
    public UserAccount addShelterHelper(RequestEntertainOrg org,String username, String password,NetWork netWork){
        ShelterHelper sh = new ShelterHelper();
        UserAccount homelessUser = netWork.getUserAccountDirctory().createUserAccount(username,password,sh);
        //org.userAccountDirectory.getUserAccountList().add(homelessUser);
        org.getUserAccountDirectory().getUserAccountList().add(homelessUser);
        return homelessUser;
    }
    
}

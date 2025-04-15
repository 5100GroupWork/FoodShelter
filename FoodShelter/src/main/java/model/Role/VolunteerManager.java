/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import model.Account.UserAccount;
import model.NetWork.NetWork;
import model.Organization.BasicOrganization;
import model.Organization.DriverOrg;
import model.Organization.VolunteerOrg;

/**
 *
 * @author 59386
 */
public class VolunteerManager extends BasicRole{
    BasicOrganization BO;
    
    public VolunteerManager(BasicOrganization org){
        this.BO = org;
    }
    
    public UserAccount createVolunteer(VolunteerOrg org,NetWork netWork,String username, String password){
        Volunteer v = new Volunteer();
        UserAccount userAccount = netWork.getUserAccountDirctory().createUserAccount(username, password, v);
        org.getUserAccountDirectory().getUserAccountList().add(userAccount);
        return userAccount;
    }
    
}

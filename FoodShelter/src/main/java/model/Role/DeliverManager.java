/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import model.Account.UserAccount;
import model.Enterprise.BasicEnterprise;
import model.NetWork.NetWork;
import model.Organization.BasicOrganization;
import model.Organization.DriverOrg;

/**
 *
 * @author 59386
 */
public class DeliverManager extends BasicRole{
    BasicOrganization BO;
    
    public DeliverManager(BasicOrganization org){
        this.BO = org;
    }
    
    public UserAccount createDriver(DriverOrg org,NetWork netWork,String username, String password){
        Deliver d = new Deliver();
        UserAccount userAccount = netWork.getUserAccountDirctory().createUserAccount(username, password, d);
        org.getUserAccountDirectory().getUserAccountList().add(userAccount);
        return userAccount;
    }
    
}

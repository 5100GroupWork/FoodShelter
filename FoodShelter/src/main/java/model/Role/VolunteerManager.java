/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.Account.UserAccount;
import model.Enterprise.BasicEnterprise;
import model.NetWork.NetWork;
import model.Organization.BasicOrganization;
import model.Organization.DriverOrg;
import model.Organization.VolunteerOrg;
import ui.DriverWorkArea.DriverWorkPanel;
import ui.VolunteerAdminWorkAreaPanel.VolunteerAdminStartPoint;

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
    
    public UserAccount createDriver(DriverOrg org,NetWork netWork,String username, String password){
        Deliver d = new Deliver();
        UserAccount userAccount = netWork.getUserAccountDirctory().createUserAccount(username, password, d);
        org.getUserAccountDirectory().getUserAccountList().add(userAccount);
        return userAccount;
    }
    
    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, NetWork netWork) {
        //todo 跳转到一个管理界面还没有做

        return new VolunteerAdminStartPoint(workArea, account, organization, enterprise, netWork);

    }
    
}

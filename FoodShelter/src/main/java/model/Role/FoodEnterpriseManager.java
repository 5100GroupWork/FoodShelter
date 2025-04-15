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
import ui.FoodProviderWorkArea.DonationFormPanel;

/**
 *
 * @author 59386
 */
public class FoodEnterpriseManager extends BasicRole{
    
    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, NetWork netWork) {
        
        return new DonationFormPanel(null,null,null,null,null);
    }
}

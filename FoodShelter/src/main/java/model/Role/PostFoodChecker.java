/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

/**
 *
 * @author sylvia
 */

import javax.swing.JPanel;
import model.Account.UserAccount;
import model.Enterprise.BasicEnterprise;
import model.FoodShelterSystem.FoodShelterSystem;
import model.NetWork.NetWork;
import model.Organization.BasicOrganization;
import model.Organization.PushedFoodCheckOrg;
import ui.FreshCheckWorkArea.PostFoodCheckPanel;

public class PostFoodChecker extends BasicRole {
    
    private PushedFoodCheckOrg pushedFoodCheckOrg;
    
    // 提供无参构造函数供 getSupportedRole() 使用
    public PostFoodChecker() {
    }
    
    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, NetWork netWork,FoodShelterSystem system) {
        return new PostFoodCheckPanel(workArea, enterprise, organization, netWork);
    }
}
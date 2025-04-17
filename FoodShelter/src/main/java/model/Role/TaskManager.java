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
import ui.ShelterHelperWorkArea.ShelterHelperWorkPanel;
import ui.TaskManagerWorkArea.TaskManagerWorkPanel;

/**
 *
 * @author 59386
 */
public class TaskManager extends BasicRole{
    
       
    private static int count = 1;
    private int ID;
    String contact;
    
    public TaskManager() {
        this.ID = ++count;
    }
    
    public String getContact() {
        return contact;
    }

    public int getID() {
        return ID;
    }
    
    
    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, BasicOrganization organization, BasicEnterprise enterprise, NetWork netWork) {
        //任务分配中心
        
        return new TaskManagerWorkPanel(workArea,account,organization,enterprise,netWork);
    }
    
}

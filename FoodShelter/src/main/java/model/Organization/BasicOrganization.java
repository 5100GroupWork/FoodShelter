/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Account.UserAccount;
import model.Account.UserAccountDirctory;
import model.Role.BasicRole;
import model.Role.WareHourseChecker;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author 59386
 */
public abstract class BasicOrganization {

    
    private String Typename;
    private String name;
    private WorkQueue workQueue;
    UserAccountDirctory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        FoodInc("FoodIncOrg"),
        Volunteer("VolunteerOrg"),
        RequestCollect("RequestCollectOrg"),
        RequestEntertain("RequestEntertainOrg"),
        NewFoodChecker("NewFoodCHeckOrg"),
        WareHourseCheck("WareHourseCheckOrg");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public BasicOrganization(String Typename,String name) {
        this.name = name;
        this.Typename = Typename;
        workQueue = new WorkQueue();
        userAccountDirectory = new UserAccountDirctory();
        organizationID = counter;
        ++counter;
    }

    public String getTypename() {
        return Typename;
    }

    public void setTypename(String Typename) {
        this.Typename = Typename;
    }
    
    public abstract ArrayList<BasicRole> getSupportedRole();
    
    public UserAccountDirctory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
//    public UserAccount addUser(){
//        UserAccount userAccount = new UserAccount();
//        this.userAccountDirectory.add()
//    }

    @Override
    public String toString() {
        return name;
    }
}

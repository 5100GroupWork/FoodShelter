/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Account.UserAccountDirctory;
import model.Role.BasicRole;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author 59386
 */
public abstract class BasicOrganization {
    private String name;
    private WorkQueue workQueue;
    private UserAccountDirctory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public BasicOrganization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        userAccountDirectory = new UserAccountDirctory();
        organizationID = counter;
        ++counter;
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

    @Override
    public String toString() {
        return name;
    }
}

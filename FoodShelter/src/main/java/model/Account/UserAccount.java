/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Account;

import model.Organization.BasicOrganization;
import model.Role.BasicRole;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author 59386
 */
public class UserAccount {
    String username;
    String password;
    BasicRole role;
    String email;
    String phone;
    WorkQueue workQueue;
    BasicOrganization organization;
    //////////////////////////////////////////////////
    
    
    
    // get set fun
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BasicRole getRole() {
        return role;
    }

    public void setRole(BasicRole role) {
        this.role = role;
    }
    
    public BasicOrganization getOrganization() {
        return organization;
    }

    public void setOrganization(BasicOrganization organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return username;
    }
    
    
}

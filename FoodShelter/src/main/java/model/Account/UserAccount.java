/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Account;

import model.Role.BasicRole;

/**
 *
 * @author 59386
 */
public class UserAccount {
    private String username;
    private String password;
    private BasicRole role;

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

    @Override
    public String toString() {
        return username;
    }
    
    
}

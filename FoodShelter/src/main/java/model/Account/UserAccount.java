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
    String username;
    String password;
    BasicRole role;
    String email;
    String phone;
    
    
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

    @Override
    public String toString() {
        return username;
    }
    
    
}

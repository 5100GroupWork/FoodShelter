/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Account;

import java.util.ArrayList;
import java.util.UUID;
import model.Role.BasicRole;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author 59386
 */
public class UserAccountDirctory {
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirctory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, BasicRole role){
        UserAccount userAccount = new UserAccount();
        // user unique id 
        String uuid = UUID.randomUUID().toString();
        userAccount.setUsername(username);
        userAccount.setAccountUuid(uuid);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        WorkQueue workQueue = new WorkQueue();
        userAccount.setWorkQueue(workQueue);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public BasicRole login(String name , String pwd){
        for(UserAccount user: this.userAccountList){
            if(name.equals(user.username) && pwd.equals(user.password)){
            return user.role;
            }
        }
        return null;
    }
}

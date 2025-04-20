/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.NetWork;

import model.Account.UserAccountDirctory;
import model.Enterprise.EnterPriseDirctory;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author 59386
 */
public class NetWork {
    private String name;
    UserAccountDirctory userAccountDirctory;
    private EnterPriseDirctory enterpriseDirectory;
    WorkQueue checkList;
    WorkQueue warehouseList;
    
    
    //////////////////////fun/////////////////////
    public WorkQueue getCheckList() {
        return checkList;
    }

    public void setCheckList(WorkQueue checkList) {
        this.checkList = checkList;
    }

    public WorkQueue getWarehouseList() {
        return warehouseList;
    }

    public void setWarehouseList(WorkQueue warehouseList) {
        this.warehouseList = warehouseList;
    }
    

    public UserAccountDirctory getUserAccountDirctory() {
        return userAccountDirctory;
    }

    public void setUserAccountDirctory(UserAccountDirctory userAccountDirctory) {
        this.userAccountDirctory = userAccountDirctory;
    }
    public NetWork(){
        enterpriseDirectory=new EnterPriseDirctory();
        checkList = new WorkQueue();
        warehouseList = new WorkQueue();
        userAccountDirctory = new UserAccountDirctory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterPriseDirctory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    
    @Override
    public String toString(){
        return name;
    }
}

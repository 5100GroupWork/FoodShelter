/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.NetWork;

import model.Enterprise.BasicEnterprise;
import model.Enterprise.EnterPriseDirctory;

/**
 *
 * @author 59386
 */
public class NetWork {
    private String name;
    private EnterPriseDirctory enterpriseDirectory;
    
    public NetWork(){
        enterpriseDirectory=new EnterPriseDirctory();
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

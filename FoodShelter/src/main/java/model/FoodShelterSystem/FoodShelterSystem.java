/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.FoodShelterSystem;

import java.util.ArrayList;
import model.NetWork.NetWork;
import model.Organization.BasicOrganization;
import model.Role.BasicRole;
import model.Role.SystemAdmin;

/**
 *
 * @author 59386
 */
public class FoodShelterSystem extends BasicOrganization{
    private static FoodShelterSystem business;
    private ArrayList<NetWork> networkList;
    public static FoodShelterSystem getInstance(){
        if(business==null){
            business=new FoodShelterSystem();
        }
        return business;
    }
    
    public NetWork createAndAddNetwork(){
        NetWork network=new NetWork();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<BasicRole> getSupportedRole() {
        ArrayList<BasicRole> roleList=new ArrayList<BasicRole>();
        roleList.add(new SystemAdmin());
        return roleList;
    }
    
    private FoodShelterSystem(){
        super(null,null);
        networkList=new ArrayList<NetWork>();
    }

    public ArrayList<NetWork> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<NetWork> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(NetWork network:networkList){
            
        }
        return true;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.NetWork;

import java.util.ArrayList;
import model.Enterprise.BasicEnterprise;
import model.Enterprise.EnterPriseDirctory;
import model.FoodItem.FoodItem;

/**
 *
 * @author 59386
 */
public class NetWork {
    private String name;

    
    private EnterPriseDirctory enterpriseDirectory;
    ArrayList<FoodItem> checkList;
    ArrayList<FoodItem> warehouseList;
    
    
    //////////////////////fun/////////////////////
    public  FoodItem addFoodItem(ArrayList<FoodItem> list){
        FoodItem foodItem = new FoodItem();
        list.add(foodItem);
        return foodItem;
    }
    
    
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
    public ArrayList<FoodItem> getCheckList() {
        return checkList;
    }

    public void setCheckList(ArrayList<FoodItem> checkList) {
        this.checkList = checkList;
    }

    public ArrayList<FoodItem> getWarehouseList() {
        return warehouseList;
    }

    public void setWarehouseList(ArrayList<FoodItem> warehouseList) {
        this.warehouseList = warehouseList;
    }
    
    @Override
    public String toString(){
        return name;
    }
}

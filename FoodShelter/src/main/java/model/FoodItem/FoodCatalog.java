/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.FoodItem;

import java.util.ArrayList;
import model.Organization.FoodIncOrg;

/**
 *
 * @author 59386
 */
public class FoodCatalog {
    String name;
    ArrayList<FoodItem> foodItems;
    int count =0;
    
    public FoodCatalog(String Name){
        foodItems = new ArrayList<>();
        this.name = Name;
    }
    
    // get Catalog
    public ArrayList<FoodItem> getFoodCatalog(){
        return this.foodItems;
    }
    
    // add Item 
    public FoodItem addFoodItem(FoodIncOrg foodIncOrg){
        count++;
        FoodItem foodItem  = new FoodItem(foodIncOrg);
        foodItem.setId(count);
        //foodItem.setCatalogName(name);
        foodItems.add(foodItem);
        return foodItem;
    }
    
    // remove 
    public void remove(FoodItem foodItem){
        this.foodItems.remove(foodItem);
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.FoodItem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import model.Organization.FoodIncOrg;

/**
 *
 * @author 59386
 * this is for food Inc employee to post food
 */
public class FoodItem {

    public static int counter = 0;
    int id;
    String FoodName;
//    String CatalogName;
    String decs;
    int number;
    FoodIncOrg foodIncOrg;
    String postDate;
    String expiredDate;
    String FoodStatus; // great or expired 
    String UsingStatus; // stored or send
    

    public FoodItem() {
        id = ++counter;
        
        LocalDateTime now = LocalDateTime.now(); // Local current time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        this.postDate = now.format(formatter);
        
        FoodStatus = "Good";
        UsingStatus = "Stored";       
    }
    
    
    
    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String FoodName) {
        this.FoodName = FoodName;
    }

//    public String getCatalogName() {
//        return CatalogName;
//    }
//
//    public void setCatalogName(String CatalogName) {
//        this.CatalogName = CatalogName;
//    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public FoodIncOrg getFoodIncOrg() {
        return foodIncOrg;
    }

    public void setFoodIncOrg(FoodIncOrg foodIncOrg) {
        this.foodIncOrg = foodIncOrg;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getFoodStatus() {
        return FoodStatus;
    }

    public void setFoodStatus(String FoodStatus) {
        this.FoodStatus = FoodStatus;
    }

    public String getUsingStatus() {
        return UsingStatus;
    }

    public void setUsingStatus(String UsingStatus) {
        this.UsingStatus = UsingStatus;
    }
    public String getCheckingStatus() {
        return CheckingStatus;
    }

    public void setCheckingStatus(String CheckingStatus) {
        this.CheckingStatus = CheckingStatus;
    }
    public String getDecs() {
        return decs;
    }

    public void setDecs(String decs) {
        this.decs = decs;
    }
    String CheckingStatus; // accept or reject

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}

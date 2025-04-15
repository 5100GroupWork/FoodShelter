/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import model.Account.UserAccount;
import model.FoodItem.FoodItem;

/**
 *
 * @author sylvia
 */
public class DeliveryTask extends WorkRequest {

    private FoodItem foodItem;
    private int quantity; // 可为 int 类型，根据你的 FoodItem 定义
    private String fromLocation;
    private String toLocation;
    private UserAccount assignedDriver;

    public DeliveryTask() {
        super();
        this.setStatus("Pending");
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public UserAccount getAssignedDriver() {
        return assignedDriver;
    }

    public void setAssignedDriver(UserAccount assignedDriver) {
        this.assignedDriver = assignedDriver;
    }

    @Override
    public String toString() {
        return foodItem != null ? foodItem.getFoodName() : "Delivery Task";
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import java.util.Date;
import model.Organization.BasicOrganization;

/**
 *
 * @author 59386
 */
public class WorkRequest {

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BasicOrganization getSender() {
        return sender;
    }

    public void setSender(BasicOrganization sender) {
        this.sender = sender;
    }

    public BasicOrganization getReceiver() {
        return receiver;
    }

    public void setReceiver(BasicOrganization receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    public String getFoodOrgName() {
        return foodOrgName;
    }

    public void setFoodOrgName(String foodOrgName) {
        this.foodOrgName = foodOrgName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    private String message;
    private BasicOrganization sender;
    private BasicOrganization receiver;
    private String status; // finish/ waiting /pedding
    private Date requestDate;
    private Date resolveDate;
     // zhiyu新增字段（用于homeless的食物请求）
    private String foodOrgName; // 对应 ComboBoxType 的值
    private int quantity;       // 对应 spinner 的值
}

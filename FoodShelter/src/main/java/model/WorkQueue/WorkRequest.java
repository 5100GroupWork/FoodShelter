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
    
    private String message;
    private BasicOrganization sender;
    private BasicOrganization receiver;
    private String status; // finish/ waiting /pedding
    private Date requestDate;
    private Date resolveDate;
}

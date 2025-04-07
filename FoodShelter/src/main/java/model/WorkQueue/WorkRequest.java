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
    
    private String message;
    private BasicOrganization sender;
    private BasicOrganization receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
}

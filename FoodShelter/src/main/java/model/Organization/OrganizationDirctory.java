/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Organization.BasicOrganization.Type;

/**
 *
 * @author 59386
 */
public class OrganizationDirctory {
    private ArrayList<BasicOrganization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<BasicOrganization> getOrganizationList() {
        return organizationList;
    }
    
//    public BasicOrganization createOrganization(Type type){
//        BasicOrganization organization = null;
//        if (type.getValue().equals(Type.Doctor.getValue())){
//            organization = new DoctorOrganization();
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.Lab.getValue())){
//            organization = new LabOrganization();
//            organizationList.add(organization);
//        }
//        return organization;
//    }
}

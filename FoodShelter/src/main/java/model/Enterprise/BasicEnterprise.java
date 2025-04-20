/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import model.Organization.BasicOrganization;
import model.Organization.OrganizationDirctory;

/**
 *
 * @author 59386
 */
public abstract class BasicEnterprise extends BasicOrganization{
    private BasicEnterpriseType enterpriseType;
    public enum BasicEnterpriseType{
        Food("FoodEnterprise"),
        Volunteer("VolunteerEnterprise"),
        RescueNet("RescueNetEnterprise"),
        FreshCheck("FreshCheckEnterprise");
        
        private String value;
        
        private BasicEnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }
    
    public BasicEnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(BasicEnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public BasicEnterprise(String name, BasicEnterpriseType type) {
        super(type.getValue(), name); 
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirctory();
    }
    
    public OrganizationDirctory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirctory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    private OrganizationDirctory organizationDirectory;

}

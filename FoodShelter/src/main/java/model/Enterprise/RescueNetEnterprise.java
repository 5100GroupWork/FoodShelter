/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;
import model.Enterprise.BasicEnterprise.BasicEnterpriseType;
import model.Organization.RequestCollectOrg;
import model.Organization.RequestEntertainOrg;
import model.Role.BasicRole;
import model.Role.FoodIncEmployee;

/**
 *
 * @author 59386
 */
public class RescueNetEnterprise extends BasicEnterprise{

    private RequestCollectOrg requestCollectOrg;
    private RequestEntertainOrg requestEntertainOrg;

    public RescueNetEnterprise(String name) {
//        this.requestCollectOrg = new RequestCollectOrg(collectName);
//        this.requestEntertainOrg = new RequestEntertainOrg(entertainName);
         super(name, BasicEnterpriseType.RescueNet);
    }

    public RequestCollectOrg getRequestCollectOrg() {
        return requestCollectOrg;
    }

    public void setRequestCollectOrg(RequestCollectOrg requestCollectOrg) {
        this.requestCollectOrg = requestCollectOrg;
    }

    public RequestEntertainOrg getRequestEntertainOrg() {
        return requestEntertainOrg;
    }

    public void setRequestEntertainOrg(RequestEntertainOrg requestEntertainOrg) {
        this.requestEntertainOrg = requestEntertainOrg;
    }

    public RequestCollectOrg addRequestCollectOrg(String name) {
        this.requestCollectOrg = new RequestCollectOrg(name);
        return this.requestCollectOrg;
    }

    public RequestEntertainOrg addRequestEntertainOrg(String name) {
        this.requestEntertainOrg = new RequestEntertainOrg(name);
        return this.requestEntertainOrg;
    }

    public void removeRequestCollectOrg() {
        this.requestCollectOrg = null;
    }

    public void removeRequestEntertainOrg() {
        this.requestEntertainOrg = null;
    }
    
    
        @Override
    public ArrayList<BasicRole> getSupportedRole() {
        ArrayList<BasicRole> roles = new ArrayList();
        roles.add(new FoodIncEmployee());
        return roles;
    }
}


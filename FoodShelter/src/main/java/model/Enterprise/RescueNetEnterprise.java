/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;
import model.Organization.RequestCollectOrg;
import model.Organization.RequestEntertainOrg;

/**
 *
 * @author 59386
 */
public class RescueNetEnterprise {

    private RequestCollectOrg requestCollectOrg;
    private RequestEntertainOrg requestEntertainOrg;

    public RescueNetEnterprise(String collectName, String entertainName) {
        this.requestCollectOrg = new RequestCollectOrg(collectName);
        this.requestEntertainOrg = new RequestEntertainOrg(entertainName);
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
}


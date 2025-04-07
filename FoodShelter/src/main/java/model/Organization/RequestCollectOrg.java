/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.BasicRole;
import model.Role.Homeless;

/**
 *
 * @author 59386
 */
public class RequestCollectOrg extends BasicOrganization{
    
    public RequestCollectOrg() {
        super(Type.RequestEntertain.getValue());
    }
    
    @Override
    public ArrayList<BasicRole> getSupportedRole() {
        ArrayList<BasicRole> roles = new ArrayList();
        roles.add(new Homeless());
        return roles;
    }
}
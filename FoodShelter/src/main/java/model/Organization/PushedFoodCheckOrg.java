/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;
import java.util.ArrayList;
import model.Role.BasicRole;
import model.Role.PostFoodChecker;

/**
 *
 * @author sylvia
 */
public class PushedFoodCheckOrg extends BasicOrganization {
    
    public PushedFoodCheckOrg(String name) {
        super(Type.PushedFoodCheck.getValue(), name);
    }
    
    @Override
    public ArrayList<BasicRole> getSupportedRole() {
        ArrayList<BasicRole> roles = new ArrayList();
        roles.add(new PostFoodChecker());
        return roles;
    }
}
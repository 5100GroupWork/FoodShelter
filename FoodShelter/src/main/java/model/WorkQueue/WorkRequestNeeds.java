/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import java.util.Date;
import model.Account.UserAccount;

/**
 *
 * @author 59386
 */
public class WorkRequestNeeds extends WorkRequest{
    private UserAccount homeless;
    private String needStatus=""; // accepted || rejected 
    
    // 不用传入，直接在ui的部分填入需要的东西
    public WorkRequestNeeds(){
        Date date = new Date();
        this.setRequestDate(date);
        this.setStatus("pending");
    }

    public UserAccount getHomeless() {
        return homeless;
    }

    public void setHomeless(UserAccount homeless) {
        this.homeless = homeless;
    }

    public String getNeedStatus() {
        return needStatus;
    }

    public void setNeedStatus(String needStatus) {
        this.needStatus = needStatus;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author 59386
 */
public class IsMatch {

    public Boolean isNameMatch(String name) {
        if (name == null)
            return false;
        // ^ 开始，$ 结束，英文 + 空格组成，空格最多3个
        String pattern = "^[a-zA-Z]+(\\s[a-zA-Z]+){0,3}$";
        return name.matches(pattern);
    }

    public Boolean isEmailMatch(String email) {
        String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if (email == null) {
            return false;
        }
        return email.matches(EMAIL_REGEX);
    }

    public Boolean isPhoneMatch(String phone) {
        if (phone == null)
            return false;
        String pattern = "^\\d{3}-\\d{3}-\\d{4}$";
        return phone.matches(pattern);
    }

}
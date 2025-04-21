/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Random;
import net.datafaker.Faker;

/**
 *
 * @author 59386
 */
public class FakerUtil {
    private static final Faker faker = new Faker();
    private static final Random random = new Random();

    // getName
    public String getName() {
        return faker.name().fullName();
    }

    // get email
    public String getEmail() {
        return faker.internet().emailAddress();
    }

    // get Address
    public String getAddress() {
        return faker.address().fullAddress();
    }

    // phone number format xxx-xxx-xxxx
    public String getPhoneNumber() {
        return faker.numerify("###-###-####");
    }

}

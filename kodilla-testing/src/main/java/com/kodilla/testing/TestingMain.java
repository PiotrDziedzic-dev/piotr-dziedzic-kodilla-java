package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        Calculator calculator = new Calculator();
        int sum = calculator.add(20,5);
        double quotient = calculator.subtract(30,6);


        if (result.equals("theForumUser")) {
            System.out.println("testOK");
        } else {
            System.out.println("Error!");
        }

        if (sum == 25) {
            System.out.println("test is OK");
        } else {
            System.out.println("Error!");
        }

        if (quotient == 5) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Error");
        }
    }
}

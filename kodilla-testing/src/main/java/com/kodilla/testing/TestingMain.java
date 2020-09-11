package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        Calculator calculator = new Calculator(6,3);
        int sum = calculator.add();
        double quotient = calculator.subtract();


        if (result.equals("theForumUser")) {
            System.out.println("testOK");
        } else {
            System.out.println("Error!");
        }

        if (sum == 9) {
            System.out.println("test is OK");
        } else {
            System.out.println("Error!");
        }

        if (quotient == 2) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Error");
        }
    }
}

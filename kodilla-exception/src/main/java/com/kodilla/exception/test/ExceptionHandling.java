package com.kodilla.exception.test;

public class ExceptionHandling {
    double a;
    double b;

    public ExceptionHandling(double a,double b) {
        this.a = a;
        this.b = b;
    }

    public String handlingWithException () {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            return secondChallenge.probablyIWillThrowException(a,b);
        } catch (Exception e) {
            System.out.println("Conditions aren't fulfilled");
            return "Exception";
        } finally {
            System.out.println("I will always be there");
        }
    }
}

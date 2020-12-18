package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FindingYourFlight findingYourFlight = new FindingYourFlight();

        try {
            findingYourFlight.findFlight(new Flight("Kraków","London"));
        } catch (RouteNotFoundException e) {
            System.out.println("We couldn't find your flight");
        } finally {
            System.out.println("I will be there anyway");
        }
    }
}
package com.kodilla.exception.test;

public class FirstChallenge {

    public static void main(String[] args) {

        Flight flight1 = new Flight("Tokyo","Beijing");
        Flight flight2 = new Flight("Warsaw","London");
        FindingYourFlight findingYourFlight = new FindingYourFlight();

        try {
            findingYourFlight.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Your airport isn't available");
        } finally {
            System.out.println("Checking process has finished");
        }

        try {
            findingYourFlight.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Your airport isn't available");
        } finally {
            System.out.println("Checking process has finished");
        }
    }
}
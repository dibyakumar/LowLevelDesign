package com.lld.behavioral.design.strategyDesign;

public class Main {
    public static void main(String[] args) {

        /**
         *
         * We have two strategy for driving
         * - sportsCarDrive
         * - offRoadCarDrive
         * We can choose the strategy in the time of creating the object .
         * our program will behave according to the strategy passed .
         *
         */

        System.out.println("Sports car drive");
        SportsCar sportsCar = new SportsCar(new SportsCarDrive());
        sportsCar.drive();

        System.out.println("Off road car drive");
        OffRoadCar offRoadCar = new OffRoadCar(new OffroadCarDrive());
        offRoadCar.drive();
    }
}

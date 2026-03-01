package day08_scanner_logical_operators;

/*
    create a class called Speeding, and write a program to determine if the car is speeding

            declare 3 variables:
            current speed, speed limit, speeding boolean

            print
            "Are you speeding? " true/false
 */

public class Speeding {

    public static void main(String[] args) {

        int currentSpeed = 26;
        int speedLimit = 25;
        // You can go a little higher -- > 5

        boolean isSpeeding = currentSpeed > speedLimit + 5;

        System.out.println("You are speeding: " + isSpeeding);

        System.out.println("Speeding limit in law in this area is: " + speedLimit);



    }

}
package practice;

import java.util.Scanner;

public class ATM_whileLoop {
    public static void main(String[] args) {


        int validPin = 5411898;
        int userEnteredPin;
        int attemptCount=0;

        Scanner key = new Scanner(System.in);
        System.out.println("please enter pin");

        userEnteredPin = key.nextInt();


        while (validPin !=userEnteredPin && attemptCount <2) {
            System.out.println("please try again");
            userEnteredPin = key.nextInt();
            attemptCount++;

        }
            if (validPin == userEnteredPin) {
                System.out.println("Success");
            } else {
                System.out.println("You are locked");
            }
        }







    }


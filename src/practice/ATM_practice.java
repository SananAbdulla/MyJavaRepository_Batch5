package practice;

import java.util.Scanner;

public class ATM_practice {
    public static void main(String[] args) {


        int validPin = 5411898;
        int userEnteredPin;
        int attemptCount = 1;

        Scanner key = new Scanner(System.in);

        do {
            System.out.println("Please enter Pin:");
            userEnteredPin = key.nextInt();
            attemptCount++;
        }
        while (validPin !=userEnteredPin && attemptCount <3);

        if (validPin == userEnteredPin) {
            System.out.println("Success");
        }
        else  {
            System.out.println("You are locked");
        }


    }
}

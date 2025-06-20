package practice;

import java.util.Scanner;

public class GuessNumberPractice {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int expectedNumber = 555;
        int guessedNumber;


        do {
            System.out.println("Please enter number");
            guessedNumber = key.nextInt();

            if (expectedNumber == guessedNumber) {
                System.out.println("Bravo ! You found the number");
                System.out.println("You are hero");
            } else {
                System.out.println("Try again!");
            }
        }

            while (expectedNumber !=guessedNumber);


        }
    }


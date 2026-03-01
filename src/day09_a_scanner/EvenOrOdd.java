package day09_a_scanner;

import java.util.Scanner;

/*
    Ask the user to enter an int number.
        Determine if the number is even or odd
        Print a boolean for both even and odd
 */
 public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int userNumber = keyboard.nextInt();

        boolean isEven = userNumber % 2 == 0; // true
        //boolean isEven = userNumber % 2 != 1; // true
        boolean isOdd = userNumber % 2 != 0;
        //boolean isOdd = !isEven;
        //boolean isOdd = userNumber % 2 == 1;

        System.out.println(userNumber + " is even: " + isEven);
        System.out.println(userNumber + " is odd: " + isOdd);


    }


}
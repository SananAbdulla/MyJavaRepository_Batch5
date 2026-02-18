package day11_if_statements;

import java.util.Scanner;

/*

   you will have a number

   if the number is divisible by 3 print -> Fizz
   if the number is divisible by 5 print -> Buzz
   if the number is divisible by both 3 and 5 -> FizzBuzz
   if the number is not divisible by any of those, print just the number

 */
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a number: ");
        int userNum = key.nextInt(); // 40


        if (userNum % 3 == 0) {
            System.out.println("Fizz");
        } else if (userNum % 5 == 0) {
            System.out.println("Buzz");
        } else if (userNum % 3 == 0 && userNum % 5 == 0) { // } else if (userNum % 15 == 0) {
            System.out.println("FizzBuzz");
        }

        System.out.println("-------------------");
        //Q: How can I fix this?
        //A: Option 1
        if (userNum % 3 == 0 && userNum % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (userNum % 5 == 0) {
            System.out.println("Buzz");
        } else if (userNum % 3 == 0 ) {
            System.out.println("Fizz");
        }

        System.out.println("-------------------");
        // A: Option 2
        if (userNum % 3 == 0 && userNum % 5 != 0) {
            System.out.println("Fizz");
        }

        if (userNum % 5 == 0 && userNum % 3 != 0) {
            System.out.println("Buzz");
        }

        if (userNum % 3 == 0 && userNum % 5 == 0) { // } else if (userNum % 15 == 0) {
            System.out.println("FizzBuzz");
        }

        System.out.println("-------------------");
        // A: Option 3 - combine
        if (userNum % 3 == 0 && userNum % 5 != 0) {
            System.out.println("Fizz");
        } else if (userNum % 5 == 0 && userNum % 3 != 0) {
            System.out.println("Buzz");
        } else if (userNum % 3 == 0 && userNum % 5 == 0) { // } else if (userNum % 15 == 0) {
            System.out.println("FizzBuzz");
        }

    }
}
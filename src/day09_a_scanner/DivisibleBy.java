package day09_a_scanner;

import java.util.Scanner;

/*
    Ask the user to enter a number. Check if that number is "evenly" divisible by 2, 3, and 5. Print the boolean values

    Ex:
        Enter a number
        65

    65 is evenly divisible by 2: false
    65 is evenly divisible by 3: false
    65 is evenly divisible by 5: true
 */
public class DivisibleBy {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Pleas, enter a number: ");
        int number = keyboard.nextInt();  // 23 | 20

        boolean isEvenlyDivisibleBy2 = number % 2 == 0; // 23 % 2 (1) == 0 | 20 -- > true               | 65 - > false | 30 - > true
        boolean isEvenlyDivisibleBy3 = number % 3 == 0; // 23 % 3 (2) == 0 | 20 -- > 2 == 0 -> false    | 65 - > false | 30 - > true
        boolean isEvenlyDivisibleBy5 = number % 5 == 0; // 23 % 5 (3) == 0 | 20 -- > 0 == 0 -> true     | 65 - > true  | 30 - > true


        boolean isEvenlyDivisibleBy2_3_5 = isEvenlyDivisibleBy2 && isEvenlyDivisibleBy3 && isEvenlyDivisibleBy5;

        System.out.println(number + " is evenly divisible by 2 and 3 and 5: " + isEvenlyDivisibleBy2_3_5);

        // if the number is divisible with either 2 or 3 or 5
        boolean isEvenlyDivisibleBy2or3or5 = isEvenlyDivisibleBy2 || isEvenlyDivisibleBy3 || isEvenlyDivisibleBy5;
        // 9 ---------------- >                      f            ||         t
        //                                                      true         ||           f
        System.out.println(number + " is evenly divisible by 2 or 3 or 5: " + isEvenlyDivisibleBy2or3or5);

    }
}
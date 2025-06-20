package practice;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers will u compare?");
        int countOfNumbers = scanner.nextInt();

        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        int cycle = 1;
        int userEnteredNumber = 0;

        while (cycle <= countOfNumbers) {
            System.out.println("Please enter number " + cycle);
            userEnteredNumber = scanner.nextInt();

            if (userEnteredNumber > biggest) {
                biggest = userEnteredNumber;

            }
            if (userEnteredNumber < smallest) {
                smallest = userEnteredNumber;
            }
            cycle++;

        }

        System.out.println("Biggest Number is: " + biggest);
        System.out.println("Smallest Number is: " + smallest);


    }

}
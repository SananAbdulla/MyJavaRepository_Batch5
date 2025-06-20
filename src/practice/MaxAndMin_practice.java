package practice;

import java.util.Scanner;

public class MaxAndMin_practice {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("How many numbers will you enter? ");
        int countOfUserNum = key.nextInt();

        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        int cycle = 1;
        int userEnteredNumber= 0;


        while (cycle <= countOfUserNum) {
            System.out.println("Please enter numbers " + cycle);
            userEnteredNumber = key.nextInt();

            if ( userEnteredNumber > biggest) {
                biggest = userEnteredNumber;
            }
            if (userEnteredNumber < smallest) {
                smallest = userEnteredNumber;
            }
            cycle++;
        }

        System.out.println("Biggest number is "+biggest);
        System.out.println("Smallest number is: "+ smallest);

    }
}
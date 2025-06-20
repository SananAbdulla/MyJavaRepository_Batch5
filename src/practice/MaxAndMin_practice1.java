package practice;

import java.util.Scanner;

public class MaxAndMin_practice1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        int countOfNumbers = scan.nextInt();

        int userEnteredNum = 0;
        int cycle = 1;

        int biggestNum = Integer.MIN_VALUE;
        int smallestNum = Integer.MAX_VALUE;


        while (cycle<= countOfNumbers) {
            System.out.println("Please enter number : " + cycle);
            userEnteredNum = scan.nextInt();

            if (userEnteredNum > biggestNum) {
                biggestNum = userEnteredNum;
            }
            if (userEnteredNum < smallestNum) {
                smallestNum = userEnteredNum;

            }
            cycle++;


        }
        System.out.println("Biggest Number is :" + biggestNum);
        System.out.println("Smallest Number is :" + smallestNum);

    }
}

package practice;

import java.util.Scanner;

public class PrimeNumbers_pract {
    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);
        System.out.println("Please enter number");
        int number = key.nextInt();
        int count = 0;

        for (int i = 1; i <=30 ; i++) {
            if (number % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            System.out.println("It is Prime Number");
        }
        else {
            System.out.println("It is not Prime number");
        }

    }
}
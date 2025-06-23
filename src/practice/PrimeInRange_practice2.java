package practice;

import java.util.Scanner;

public class PrimeInRange_practice2 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter number");
        int userNumber = key.nextInt();

        for (int i = 1; i <= userNumber ; i++) {
            int count = 0;
            int singleNumber = i;

            for (int j = 1; j <=singleNumber ; j++) {

                if (singleNumber % j == 0) {
                    count++;
                }

            }

            if (count == 2) {
                System.out.print(singleNumber + " ");
            }
        }


    }
}

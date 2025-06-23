package practice;

import java.util.Scanner;

public class PrimeInRange_practice3 {
    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);
        System.out.println("Please enter number");
        int userNumber = key.nextInt();

        for (int i = 0; i <= userNumber; i++) {

            int singleNumber = i;
            int count = 0;
            for (int j = 1; j <= singleNumber; j++) {

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

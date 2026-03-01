package practice;

import java.util.Scanner;

public class PrimeInRange_practice {

    public static void main(String[] args) {


        /*
    [IQ] Prime in range

    Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.

    Ex:
        Input:
            50
        Output:
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number");
        int userNumber = scan.nextInt();

        for (int i = 1; i <=userNumber ; i++) {

            int count = 0;
            //int singleNumber = i;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;

                }

            }
            if ( count ==2 ) {

                System.out.print(i + " ");
            }

        }

    }

}


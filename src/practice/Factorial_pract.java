package practice;

import java.util.Scanner;

public class Factorial_pract {
    public static void main(String[] args) {

/*
Example:

5! = 5 × 4 × 3 × 2 × 1 = 120
 */

        int nums = 6;
        int result = 1;

        while (nums >0) {
            result *=nums;
            nums--;
        }
        System.out.println(result);

        System.out.println("------");

        int num = 1;

        while (num <=100) {

            if (num % 5 == 0) {
                System.out.println(num);
            }
            num +=1;

        }

        System.out.println("----------");

        int number = 5;

        int Result =1;

        while (number > 0) {

            Result *=number;
            number--;


        }

        System.out.println(Result);


        System.out.println("-------");

        Scanner key = new Scanner(System.in);

        System.out.println("Please enter number");
        int UserEnteredNum = key.nextInt();
        int RESULT = 1;


        while (UserEnteredNum > 0) {
            RESULT *= UserEnteredNum;
            UserEnteredNum--;
        }
        System.out.println(RESULT);

    }
}

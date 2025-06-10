package day09_a_if_statements;

import java.util.Scanner;

public class EvenOrOdd_practice {
    public static void main (String args[]) {

        Scanner key = new Scanner(System.in);
        int num;
        System.out.println("Please enter number");
        num = key.nextInt();

// 1st option
//        boolean isEven = num % 2 == 0;
//        boolean isOdd = num % 2 == 1;
//
//        System.out.println("The number u entered is: " + isEven);
//        System.out.println("The number u entered is: " + isOdd);
//

   // 2nd option

   if (num %2==0)     {
       System.out.println("The number u entered is Even !");
   }
   else {
       System.out.println("The number u entered is Odd");
   }


    }
}

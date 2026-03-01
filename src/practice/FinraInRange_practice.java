package practice;

import java.util.Scanner;

public class FinraInRange_practice {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number");
        int userNumber = input.nextInt();

        for (int i = 1; i <=userNumber ; i++) {
            //int num = i;

            if (i % 3 ==  0 && i % 5 == 0) {
                System.out.println(i + " Finra");
            }
            else if (i % 3 == 0) {
                System.out.println(i+ " FIN");
            }
            else if (i % 5 == 0 ) {
                System.out.println(i+" RA");
            }



        }
    }
}

package practice;

import java.util.Scanner;

public class SelectMonth_pract {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Please, enter a number and I will give you month name.");

        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        int userInput;
        do {
            System.out.println("Enter");
              userInput = input.nextInt();

            if (userInput>= 1 && userInput <= 12) {
                System.out.println("You entered " + userInput + " and, it is " + months[userInput-1]);
            }


        }

        while (userInput < 1 || userInput > 12);


    }
}

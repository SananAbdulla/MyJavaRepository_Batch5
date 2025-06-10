package day09_b_if_statements;

import java.util.Scanner;

public class bankAccount_Practice {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        double balance;
        double withdraw;

        System.out.print("What is your balance: $");
        balance = key.nextDouble();
        System.out.println("Your balance is: " + balance);

        System.out.print("How much do you want to withdraw? $");
        withdraw = key.nextDouble();
        System.out.println("\tYou are requesting to withdraw $" + withdraw);

        balance -= withdraw;
        // or
        //balance = balance - withdraw;

        System.out.println("Your balance is :" + balance);

        // I still want to withdraw again. --- >  200

        /*
            if withdraw amount < balance
                - Not enough money
            else (equal or more)
                - updated the balance
         */

        System.out.print("How much do you want to withdraw? $");
        withdraw = key.nextDouble();

        if (withdraw> balance ) {
            System.out.println("\t\tYou dont have enough money in your balance");
        }
        else {
            balance -= withdraw;
            System.out.println("\t\tYour balance is :" + balance);

        }

    }
}

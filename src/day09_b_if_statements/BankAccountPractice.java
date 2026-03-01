package day09_b_if_statements;

import java.util.Scanner;

public class BankAccountPractice {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        double balance;
        double withdraw;

        System.out.println("What is your balance?");
        balance = scan.nextDouble();

        System.out.println("How much do you want to withdraw?");
        withdraw = scan.nextDouble();

        balance -= withdraw;

        System.out.println("Balance after withdrawal: - " + balance);


        System.out.println("How much do you want to withdraw again?");

        withdraw = scan.nextDouble();

        if (withdraw > balance) {
            System.out.println("Not enough money");

        } else {
            balance -= withdraw;
            System.out.println("Balance after withdrawal: - " + balance);
        }
    }
}

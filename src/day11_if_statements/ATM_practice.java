package day11_if_statements;

import java.util.Scanner;

public class ATM_practice {
    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);
        int expPin = 2222;
        double balance = 25000;

        System.out.print("WELCOME TO ATM\n\tPlease, insert your card.\n\tThen, please enter your pincode: ");
        int actualPin = key.nextInt();

        if (actualPin == expPin) {
            System.out.println("\n\tYou are logged in. ");
            System.out.println("\tSelect one of the options below: ");
            System.out.println("\t\t1) - Check Balance");
            System.out.println("\t\t2) - Deposit");
            System.out.println("\t\t3) - Withdraw");
            System.out.println("\t\t4) - Cancel");
            System.out.print("\t\tYour choice (1-4): ");
            int userChoice = key.nextInt();

            if (userChoice == 1) {
                System.out.println("\n\tYour balance is: " + balance);

            } else if (userChoice == 2) {
                double deposit = key.nextDouble();
                balance += deposit;
                System.out.println("Your balance after deposit is: " + balance);
            } else if (userChoice == 3) {
                System.out.println("\n\tPlease enter money amount you want to withdraw ");
                double withdraw = key.nextDouble();
                if (balance < withdraw) {
                    System.out.println("You dont have enough money in your balance, your balance is: " + balance);
                } else {
                    balance -= withdraw;
                    System.out.println("Your new balance after a withdraw is: " + balance);
                }

                }
            else if (userChoice == 4) {

            } else {
                System.out.println("\n\t\tInvalid option. Exiting system by logging you out.");

            }
        } else {
            System.out.println("\n\tInvalid pincode. Go home and try to remember your pincode");
        }
        }


    }



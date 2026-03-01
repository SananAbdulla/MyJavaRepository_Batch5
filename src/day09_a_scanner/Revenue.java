package day09_a_scanner;

import java.util.Scanner;

/*
    Write a program that asks the user to enter
        a price
        and quantity

        and then calculate the revenue. revenue = price × quantity.
 */
public class Revenue {
    public static void main(String[] args) {
        // Created Scanner Object
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter price for item $");
        double price = key.nextDouble(); // Taking value from user and assigning a variable called price.


        System.out.print("Please, enter quantity for the item: ");
        int quantity = key.nextInt();

        double revenue = price * quantity; // double * int  --- > double
        System.out.println("Revenue value: $" + revenue);

    }
}

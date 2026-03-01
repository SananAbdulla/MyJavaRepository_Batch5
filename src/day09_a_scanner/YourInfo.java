package day09_a_scanner;

import java.util.Scanner;

/*
    Ask them to enter their favorite book
    Ask the user to enter their age (byte),
    and ask them to enter their favorite number (long),

    Print all the values from the inputs

 */
public class YourInfo {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter your favorite book: ");
        String book = key.nextLine(); // Can take multiple words

        System.out.print("Please, enter you age: ");
        byte age = key.nextByte();

        System.out.print("Pleas, enter you favorite number: ");
        long favNum = key.nextLong();

        //System.out.println();
        System.out.println("\nInfo you entered: ");
        System.out.println("\t" + book);
        System.out.println("\t" + age );
        System.out.println("\t" + favNum);

    }
}

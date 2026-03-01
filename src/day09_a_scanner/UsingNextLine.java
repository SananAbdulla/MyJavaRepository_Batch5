package day09_a_scanner;

import java.util.Scanner;

public class UsingNextLine {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("What day is today: ");
        String day = key.nextLine();

        System.out.print("Enter yur first name: ");
        String firstName = key.next();

        System.out.print("Enter yur last name: ");
        String lastName = key.next();

        key.nextLine(); // This will handle the ENTER button

        System.out.print("Pleas, enter you address: ");
        String address = key.nextLine();  // Since next line is taking multiple things as an input including, space, character and EVEN pressing ENTER as an input

        // RULE with nextLine() -- > if there is ANY OTHER Scanner methods (other than nextLIne() method) before nextLine() method, we have to handle ENTER button
        // TO hand it: we use an extra nextLine(); - and do nto need to assign anything

        System.out.print("Please enter your job title: ");
        String jobTitle = key.nextLine(); // Quality Engineer

        System.out.print("Pleas, enter you team members names: ");
        String teamMembers = key.nextLine();

        System.out.print("How many team members you have in your team: ");
        int numberOfTeamMembers = key.nextInt();

        key.nextLine(); // handle ENTER
        System.out.print("What are the holidays you have: ");
        String holidays = key.nextLine();

    }
}
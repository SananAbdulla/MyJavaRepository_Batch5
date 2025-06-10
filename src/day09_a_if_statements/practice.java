package day09_a_if_statements;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Pls enter your first name");
        String firstName = key.nextLine();

        System.out.println("Pls enter your last name");
        String lastName = key.nextLine();

        System.out.println("Are you a employed (true/false");
        boolean isEmployed = key.nextBoolean();

        System.out.println("Are you a student (true/false");
        boolean isStudent = key.nextBoolean();

        String info = "\nInformation about: " + firstName + " " + lastName + "\n\t\tisEmployed: " + isEmployed + "\n\t\tIsStudent: " + isStudent;

        System.out.println(info);

    }
}

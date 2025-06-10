package practice;

import java.util.Scanner;

/*

    Ask the user to enter a username
    make sure the username is in lowercase

    Ask the user to enter a password
    check if the password is more than 8 characters long

    valid system password: "loopcamp"

    -> if the entered password matches the system password
        logged in

        otherwise print:

        invalid password

 */
public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String expectedUserName = "sananabdulla@gmail.com";
        String expectedPassword = "Sanko541";

        System.out.println("Please enter your user name");
        String EnteredUserName = scan.next().toLowerCase();

        System.out.println("Please enter passwrord");
        String EnteredPassword = scan.next();


        boolean isValid = EnteredUserName.equals(expectedUserName) && EnteredPassword.length()>=8 && EnteredPassword.equals(expectedPassword);

        if (isValid) {
            System.out.println("You are succesfully logged in");
            System.out.println("Great Job1");
        } else {
            if (EnteredPassword.length()<8) {
                System.out.println("Password is less than 8 character");
            }
            else if (!EnteredPassword.equals(expectedPassword)) {
                System.out.println("Enetered Password does not match");

            }
        }



    }
    }

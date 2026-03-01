package day11_if_statements;

import java.util.Scanner;

/*
inputs:
    declare and assign a 4 digit pin code
    declare and assign the last 4 digits of ssn: 1234

    declare and assign expected values for both
        example expected:
            pin: 1552
            ssn: 1234

outputs:

        when the pincode and ssn match the expected print:
            Authentication successful

        when the pincode or ssn are not correct print:
            Authentication failed

        when the pincode was not correct print:
            incorrect pin code

        when the ssn is not correct print:
            invalid ssn
 */
public class LoginApp {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int correctPinCode = 1234;
        int correctLass4SSN = 1111;

        System.out.print("Welcome ATM.\n\tPlease, enter you pin code: ");
        int userInputPinCode = key.nextInt();

        System.out.print("\tPlease, enter last 4 digits of your SSN: ");
        int userInputLast4SSN = key.nextInt();


        System.out.println();
        if (correctPinCode == userInputPinCode && correctLass4SSN == userInputLast4SSN  ){
            System.out.println("Authentication successful. You are logged in.");
        } else {
            System.out.println("Yuo gave me invalid input!");
            // valid pin + invalid ssn
            // invalid pin + invalid ssn
            // invalid pin + valid ssn

            if (correctPinCode != userInputPinCode && correctLass4SSN != userInputLast4SSN){
                System.out.println("Both pin and ssn are incorrect!");
            } else if (correctPinCode != userInputPinCode) {
                System.out.println("Your pin code is incorrect!");
            } else if (correctLass4SSN != userInputLast4SSN) {
                System.out.println("Your last 4 digits of ssn is incorrect!");
            }

        }

    }

}
package day11_if_statements;

import java.util.Scanner;

public class LoginApp_practice {
    public static void main(String[] args) {

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

        Scanner key = new Scanner(System.in);

        int ExpectedPin = 1552;
        int last4DigitSSN = 1234;

        int actualPin;
        int actualSSN;

        System.out.print("Welcome to ATM. \n\tPlease, enter your pincode: ");
        actualPin = key.nextInt();

        System.out.print("\tPlease, enter your last 4 digits for SSN: ");
        actualSSN = key.nextInt();


        if (actualPin == ExpectedPin && actualSSN == last4DigitSSN) {
            System.out.println("Authentication successful");
        }
        else {
            System.out.println("Authentication failed");
        }
        if (actualPin !=ExpectedPin) {
            System.out.println("incorrect pin code");
        }
        if (actualSSN != last4DigitSSN) {
            System.out.println("invalid ssn");
        }
        System.out.println("Try again");









    }
}

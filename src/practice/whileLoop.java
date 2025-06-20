package practice;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int secretNumber = 777;
        int userGuess = 0;

        while (userGuess !=secretNumber) {
            System.out.println("Please enter number");
            userGuess  = key.nextInt();

            if (userGuess < secretNumber) {
                System.out.println("It is too low");
            } else if (userGuess > secretNumber) {
                System.out.println("It is too high");
            } else {
                System.out.println("Guess Correctly");
            }
        }

        System.out.println("Weelcome !");

    }
}

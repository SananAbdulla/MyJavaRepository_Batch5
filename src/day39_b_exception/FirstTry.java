package day39_b_exception;

import java.util.Scanner;

public class FirstTry {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("First print out...");

        System.out.println("Give the index...");

        int index = scan.nextInt();

        String str = "loop";


        try {
            System.out.println(str.charAt(index));
        }
        catch (StringIndexOutOfBoundsException e) { // Exception is also works
            System.out.println("Exception is caught: " + e.getMessage());
            System.out.println("Program continues");
        }


    }
}

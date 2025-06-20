package practice;

import java.util.Scanner;

public class SpaceProgram_practice {
    public static void main(String[] args) {




/*
    Space program [String, Loops]

    Given a String return a version of with spaces between all of the letters.
    If there is already a space in the String put an underscore

        Ex: java	-> j a v a
            space 	-> s p a c e
            more words -> m o r e _ w o r d s

 */


        Scanner key = new Scanner(System.in);

        System.out.println("Please enter a sentence");

        String str = key.nextLine().trim().replaceAll(" ", "_");

        for (int i = 0; i < str.length() ; i++) {

            System.out.print(str.charAt(i));

            if (i == str.length()-1) {
                break;
            }
            System.out.print(" ");
        }





    }

}
package practice;

import java.util.Scanner;

public class CamelCase_practice {
    public static void main(String[] args) {
        /*
Camel Case

            Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

            Ex:

                Today is SUNDAY

                Output:

                todayIsSunday


         */

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String str = key.nextLine().trim().toLowerCase();

        String camelcase = ("" + str.charAt(0)).toUpperCase();

        for (int i = 1; i < str.length() ; i++) {

            if (str.charAt(i-1) == ' ') {
                camelcase += ("" + str.charAt(i)).toUpperCase();
            }
            else {
                camelcase += str.charAt(i);
            }

        }

        System.out.println("Original sentende: "+ str);
        System.out.println("Modified sentende: "+ camelcase.replace(" ", ""));


    }
}

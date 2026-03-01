package practice;

import java.util.Scanner;

public class CamelCase_practice_whileLoop {
    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String str = key.nextLine().trim().toLowerCase();

        String camelcase = ("" + str.charAt(0)).toUpperCase();

        int i = 1;

        while (i < str.length()) {

            if (str.charAt(i-1) == ' ') {

                camelcase += ("" + str.charAt(i)).toUpperCase();
            }
            else {
                camelcase += str.charAt(i);
            }
            i++;
        }

        System.out.println("Original sentende: "+ str);
        System.out.println("Modified sentende: "+ camelcase.replace(" ", "-"));
    }
}

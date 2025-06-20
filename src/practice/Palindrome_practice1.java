package practice;

import java.util.Scanner;

public class Palindrome_practice1 {
    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);
        System.out.println("Enter word");
        String word = key.nextLine();

        String reversed = "";

        for (int i = word.length()-1; i>=0 ; i--) {
            reversed += word.charAt(i);
        }
            if(word.equalsIgnoreCase(reversed)) {
                System.out.println("It is Palindrome");
            }
            else {
                System.out.println("Not Polindrome");
            }


        }
    }


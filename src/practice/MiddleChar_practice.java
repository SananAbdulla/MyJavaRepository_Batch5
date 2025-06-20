package practice;

import java.util.Scanner;

public class MiddleChar_practice {
    public static void main(String[] args) {

        /*
    [Middle char]
    Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.
    b) If the length of the string is odd there will be one middle character.
        Ex:
            Input: elephant -- > 8
            //     01234567
            Output: The middle characters: ph

 */

        Scanner key = new Scanner(System.in);
        System.out.println("Write any word");

        String word = key.nextLine();

        //      a l i b a b a
        //      1 2 3 4 5 6 7



        String mid = "";

        if (word.length()%2==0) {
            mid = word.substring(word.length()/2-1, word.length()/2+1);
        }
        else {
            mid = word.substring(word.length()/2, word.length()/2+1);

        }

        System.out.println(mid);
    }
}

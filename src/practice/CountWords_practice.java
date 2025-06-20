package practice;

import java.util.*;

public class CountWords_practice {
    public static void main(String[] args) {



        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = key.nextLine();
        int countOfWords = 0;

        for (int i = 0; i < sentence.length() ; i++) {
            if (sentence.charAt(i) == ' ') {
                countOfWords++;
            }

        }
        System.out.println(countOfWords +1);

    }
}

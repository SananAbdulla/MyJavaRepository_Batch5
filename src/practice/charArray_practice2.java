package practice;

import java.util.Arrays;

public class charArray_practice2 {
    public static void main(String[] args) {

        String word = "loopcamp";

        char [] wordLetterArr = new char [word.length()];

        for (int i = 0; i < word.length(); i++) {

            wordLetterArr [i] = word.charAt(i);

        }

        System.out.println(wordLetterArr);


        System.out.println("----------------");


        char [] wordLetterArr2 =  word.toCharArray();
        System.out.println(Arrays.toString(wordLetterArr2));
        System.out.println(wordLetterArr2);



        char [] wordLetterArr3 = "Azerbaijan".toCharArray();
        System.out.println(Arrays.toString(wordLetterArr3));




    }
}

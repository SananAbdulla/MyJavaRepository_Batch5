package practice;

import java.util.Scanner;

public class MoveFirst_practice {
    public static void main(String[] args) {

        Scanner key = new Scanner (System.in);
        System.out.println("Please enter sentence ");
        String sentence = key.nextLine();

        String part1 = sentence.substring(0, sentence.indexOf(" "));
        String part2 = sentence.substring(sentence.indexOf(" ")+1);
        String part2New = sentence.substring(sentence.indexOf(" ")).trim();


        System.out.println("Original Sentence: "+ sentence);
        System.out.println("After Move: " + part2+" "+part1);
        System.out.println("After Move: " + part2New+" "+part1);



    }
}

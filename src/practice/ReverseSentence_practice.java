package practice;

import java.util.Arrays;

public class ReverseSentence_practice {
    public static void main(String[] args) {


        String sentence = "today is monday";
        System.out.println(sentence);

        String [] sentenceArr = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArr));
        String  sentenceArrREVERSED = "";


        for (int i = sentenceArr.length-1; i>=0 ; i--) {

            sentenceArrREVERSED  += sentenceArr[i] + " ";
        }


        System.out.println(sentenceArrREVERSED + " ");




    }
}

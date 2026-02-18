package day25_methods;

import day26_methods.ArrayIndexOf;
import my_utilities.StringUtil;
import practice.FrequencyOfChars_customMethods_pract;

public class Reyhan {

    public static void main(String[] args) {


        System.out.println(FrequencyOfChars_customMethods_pract.reversed("Reyhan"));

        System.out.println(FrequencyOfChars_customMethods_pract.reversed("Sanan"));

        System.out.println(StringUtil.duplicateCharacters("Azerbaijan"));



        String str = "Azerbaijan";

        //char each= 'z';
        int count = 0;

//        for (int i = 0; i < str.length() ; i++) {
//
//            char letter = str.charAt(i);
//
//            if (letter == each ) {
//                count++;
//            }
//
//        }

        System.out.println(count);

        frequencyOfChar(str, 'a');


        int [] arr = {1, 2, 3, 4, 5};

        System.out.println("ArrayIndexOf.indexOf(arr, 3) = " + ArrayIndexOf.indexOf(arr, 3));


    }


    public static void frequencyOfChar (String str, char letter) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == letter) {
                count++;
            }
        }

        System.out.println(count);

    }
}

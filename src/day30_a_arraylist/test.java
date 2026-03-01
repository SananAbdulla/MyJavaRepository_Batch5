package day30_a_arraylist;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class test {

    public static void main(String[] args) {


        String str = "Baku";

        System.out.println(StringUtil.reverse(str));

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList("Baku", "Ganja", "Sumgait"));

        System.out.println(reverseAllListElements(arrList));

    }


    public static ArrayList<String> reverseAllListElements (ArrayList<String> originalList) {
       ArrayList<String> reversedList = new ArrayList<>();

       for ( String each : originalList) {

           reversedList.add(StringUtil.reverse(each));
       }


        return reversedList;

    }
}

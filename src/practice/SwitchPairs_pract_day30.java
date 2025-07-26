package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwitchPairs_pract_day30 {
    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList("Baku", "is", "Citi ", "In Caucasus"));


        System.out.println(swapElements(arrList));


    }


    public static ArrayList<String> swapElements (ArrayList<String> list) {


        ArrayList<String> swappedList = new ArrayList<>();

        for (int i = 0; i < list.size() ; i+=2) {

            Collections.swap(list, i, i+1);

        }
        swappedList.addAll(list);


        return swappedList;
    }


}

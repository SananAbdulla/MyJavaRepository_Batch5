package day31_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class practice {
    public static void main(String[] args) {


        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1,2,3,4,5, 2, 4));


        System.out.println("keepUnique(arrList) = " + keepUnique(arrList));


    }

    public static ArrayList<Integer> keepUnique(ArrayList<Integer> arrList) {

        ArrayList<Integer> uniqueArrList = new ArrayList<>();

        for (Integer each : arrList) {

          if(Collections.frequency(arrList, each ) == 1) {
              uniqueArrList.add(each);
          }
        }

        return uniqueArrList;

    }



}

package day30_a_arraylist;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class tes2 {
    public static void main(String[] args) {


        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(3,1,55,11,9,60));
        System.out.println(arrList);
        System.out.println();
        Collections.sort(arrList);
        System.out.println(arrList);
        System.out.println();
        Collections.reverse(arrList);
        System.out.println(arrList);
        System.out.println();
        int max =  Collections.max(arrList);
        System.out.println(max);

        Collections.swap(arrList, 0,arrList.size()-1);
        System.out.println(arrList);
        System.out.println();

        String str = "Azerbaijan";

        ArrayList<String> arrStr = new ArrayList<>(Arrays.asList(str.split("")));
        int count = Collections.frequency(arrStr, "z");
        System.out.println(count);
        System.out.println(Collections.frequency(arrStr, "n"));
        System.out.println();

        ArrayList<Integer> arrList2 = new ArrayList<>(Arrays.asList(3,1,55,11,9,60, 6, 10));

        arrList2.removeIf(each -> each % 3 == 0);

        System.out.println(arrList2);


        ArrayList<String> strArrayList= new ArrayList<>(Arrays.asList("Baku", "New York" , "Paris"));


        System.out.println(reverseAllElementsInArr(strArrayList));
    }


    public static ArrayList<String> reverseAllElementsInArr(ArrayList<String> originalList) {

        ArrayList<String> reversedArr = new ArrayList<>();

        for (String each : originalList) {


                reversedArr.add(StringUtil.reverse(each));

            }

        return reversedArr;
    }
}

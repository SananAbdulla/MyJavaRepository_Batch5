package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumbers_parct_day30 {
    public static void main(String[] args) {


        ArrayList<String> numsAsString = new ArrayList<>();

        numsAsString.addAll(Arrays.asList("123", "345", "567"));

       // System.out.println(numsAsString);

        System.out.println(sumOfAllElements(numsAsString));


    }

    public static ArrayList<Integer> sumOfAllElements (ArrayList<String> list) {

         ArrayList<Integer> result = new ArrayList<>();
        for (String each : list) {


            int sumOfAll = 0;

            for (String eachElement : each.split("")) {

                sumOfAll += Integer.parseInt(eachElement);
            }

            result.add(sumOfAll);
        }



        return result;
    }
}

package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicateNumbers_pract_day30 {

    /*
    Remove Duplicates
    Create a method that will take an ArrayList of numbers and remove any duplicates values.
    The method will return an ArrayList of unique elements.

    @param nums - The given ArrayList of numbers @return - ArrayList of numbers

        Ex:
        Input: {1, 3, 5, 1, 4, 5, 9};
        Output: {3, 4, 9};
 */

    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println("Original: " + nums);

        System.out.println("After removal of Duplicates: " + uniqueList(nums));

        System.out.println();
        System.out.println("After removal of Duplicates: " + uniqueList2(nums));


    }

    public static ArrayList<Integer> uniqueList(ArrayList<Integer> numsArrList) {

        ArrayList<Integer> result = new ArrayList<>(numsArrList);

        result.removeIf(each -> Collections.frequency(numsArrList, each) > 1);


        return result;
    }


    public static ArrayList<Integer> uniqueList2(ArrayList<Integer> numsArrList) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int each : numsArrList ) {

           if (Collections.frequency(numsArrList, each) == 1) {

               result.add(each);
           }
        }




        return result;
    }

}
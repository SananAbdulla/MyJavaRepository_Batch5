package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveBadPairs_pract_day30 {
    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(2, 4, 40, 44, 77, 88, 99, 10));

        System.out.println(nums);

        System.out.println(keepGoddPairs(nums));
    }


    public static ArrayList<Integer> keepGoddPairs (ArrayList<Integer> list) {

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < list.size(); i+=2) {

            if (list.get(i) >= list.get(i +1 )) {

                resultList.add(list.get(i));
                resultList.add(list.get(i +1 ));

            }

        }


        return resultList;
    }
}

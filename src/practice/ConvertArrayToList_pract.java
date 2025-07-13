package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList_pract {
    public static void main(String[] args) {



        int [] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer [] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        Arrays.asList(nums2);

        ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(nums2));

        System.out.println("-----");
        System.out.println(nums3);


        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15));
        System.out.println(arrList);


        ArrayList<String> strArr = new ArrayList<>(Arrays.asList("Belgian Malinois", "GSD", "Alabai"));
        System.out.println(strArr);
    }

    public static Integer [] primitiveArrtoObj(int [] arr) {

        Integer [] objArr = new Integer[arr.length];

        for (int i = 0; i < objArr.length ; i++) {
            objArr[i] = arr[i];

        }

        return objArr;
    }
}

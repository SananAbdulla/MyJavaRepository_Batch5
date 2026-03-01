package practice;

import java.util.Arrays;

public class ReverseArray_practice2 {
    public static void main(String[] args) {

/*
       We have to generate another array and assign it as reversed way

 */

        int [] arr = {44, 55, 66, 77, 88, 99, 100};
        //             0   1.  2.  3.  4.  5.  6


        System.out.println(arr.length);

        System.out.println("Original Array " + Arrays.toString(arr));
        int [] reversed = new int [arr.length];

        for (int i = arr.length-1; i>=0 ; i--) {

            reversed[reversed.length- 1 - i] = arr[i];

        }


        System.out.println(Arrays.toString(reversed));


        System.out.println("---------------");
        int [] reversed2 = new int[arr.length];

        for (int j = 0, i = arr.length-1; i>=0 ; i--, j++) {

            reversed2[j] = arr[i];

        }
        System.out.println(Arrays.toString(reversed2));
    }
}

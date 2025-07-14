package day29_arraylist;

import java.util.Arrays;
import java.util.Collections;

public class test {
    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 4, 5};

        int [] reversed = new int [nums.length];

        for (int i = nums.length-1; i>=0 ; i--) {

            reversed [reversed.length- 1 - i ] = nums[i];

        }


        System.out.println(Arrays.toString(reversed));

    }
}

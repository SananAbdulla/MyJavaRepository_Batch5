package practice;

import java.util.Arrays;

public class Array_intro1 {
    public static void main(String[] args) {

        // it is copying one Array to another one
        int [] nums = { 22, 44, 55, 66 };
        int [] newNums = new int [6];


        for (int i = 0; i < nums.length ; i++) {

            newNums [i] = nums[i];

        }

        System.out.println(Arrays.toString(newNums));

    }
}

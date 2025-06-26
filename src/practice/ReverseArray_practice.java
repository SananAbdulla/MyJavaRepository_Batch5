package practice;

import java.util.Arrays;

public class ReverseArray_practice {


    public static void main(String[] args) {

        /*


    Reverse Array
    Write a program that will reverse the order of any given array
    Ex: Input:
        [1, 2, 3, 4, 5]
    Output:
        [5, 4, 3, 2, 1]

     */


        int[] nums = {1, 2, 3, 4, 5};

        String result = "[";

        // Option 1. For i loop

        for (int i = nums.length-1; i >=0 ; i--) {
            //System.out.print(nums[i] + " ");
            result += nums [i] + ", ";

        }


        System.out.println(result.substring(0, result.lastIndexOf(","))+"]");


        // Option 2.

//        int [] reversed = new int [nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            reversed [reversed.length- 1 - i] = nums[i];
//
//        }
//        System.out.println(Arrays.toString(reversed));


    }

    }


package practice;

import java.util.Arrays;

public class MinAndMaxInArr {
    public static void main(String[] args) {



        int [] number = {22, 11, 33, 44, 55, 100};

        Arrays.sort(number);

        System.out.println("Min Arr is "+number[0]);
        System.out.println("Max Arr is "+number[number.length-1]);

        int [] number2 = {10, 22, 11, 33, 44, 55, 100};

        System.out.println("------");
        System.out.println(minArr(number2));

        System.out.println("------");
        System.out.println(maxArr(number2));


    }

    public static String minArr (int [] num) {

        int min = 0;
        Arrays.sort(num);

        min = num[0];


        return "The min is " + min;
    }

    public static String maxArr (int [] num) {

        int max = 0;
        Arrays.sort(num);

        max = num[num.length-1];


        return "The max is " + max;
    }


}

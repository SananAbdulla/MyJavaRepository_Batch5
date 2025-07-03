package practice;

import java.util.Arrays;

public class CopyOfExample_pract {
    public static void main(String[] args) {


        int [] number = {10,20,30,40};
        int [] numberTest = number;
        int [] CopyOfNumber = Arrays.copyOf(number, number.length);

        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(numberTest));
        System.out.println(Arrays.toString(CopyOfNumber));

        System.out.println("----------");

        number [0] = 100;
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(numberTest));
        System.out.println(Arrays.toString(CopyOfNumber));


    }
}

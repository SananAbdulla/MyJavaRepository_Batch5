package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//        int [] y =  {33, 555,222,54};
//
//        int [] z = new int [y.length];


        // add element

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter the size of Array");
        int sizeArr = key.nextInt();
        int []arr1 = new int [sizeArr];

        for (int i = 0; i < arr1.length ; i++) {
            System.out.println("Please enter value for index: " + i);
            arr1 [i] = key.nextInt();

        }
        System.out.println(Arrays.toString(arr1));


        System.out.println("How many new elements do  u want to add? ");

        int newElementSize = key.nextInt();

        int [] arr2 = Arrays.copyOf(arr1, arr1.length+newElementSize);

        for (int i = arr1.length; i <arr2.length ; i++) {
            System.out.println("Please enter value for index " + i + ":");
            arr2[i] = key.nextInt();

        }

        System.out.println(Arrays.toString(arr2));






    }
}

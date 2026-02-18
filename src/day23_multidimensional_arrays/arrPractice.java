package day23_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrPractice {
    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);
        System.out.println("what is your arr size");
        int size = key.nextInt();
        int [] arr = new int [size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please add elements into array");
            arr[i] = key.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        System.out.println("how many elements you want to add more");

        int additionalSize = key.nextInt();

        int [] arr2 = Arrays.copyOf(arr, arr.length + additionalSize);

        for (int i = arr.length; i < arr2.length; i++) {

            System.out.println("Please add elements into array");
            arr2[i] = key.nextInt();
        }

        System.out.println(Arrays.toString(arr2));
    }
}

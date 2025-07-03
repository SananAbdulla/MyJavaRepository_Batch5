package practice;

import java.util.Arrays;

public class BinarySearchExample_practice {
    public static void main(String[] args) {


        int[] arr = {4, 55, 4, 10, -1, 30, 100, 150};
        System.out.println(Arrays.toString(arr));


        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 55));


        int[] arr2 = {4, 55, 4, 10, -1, 30, 100, 150};
        int num = 34;

        for (int i = 0; i < arr2.length; i++) {

            if (arr2 [i] == num) {
                System.out.println("Your first match index for element is " + i);
                break;
            }
            else if ((i+1) == arr2.length) {
                System.out.println("There is not match");
            }


        }

    }

}
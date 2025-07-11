package practice;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement_pract2 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter the size of an Arr");
        int size = key.nextInt();
        int [] arr = new int [size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter elements of give arr " + i);
            arr[i] = key.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        System.out.println("How many new elements do u want to add?");

        int addedSize = key.nextInt();

        int [] newArr = Arrays.copyOf(arr, arr.length+addedSize);

        for (int i = arr.length; i < newArr.length ; i++) {

            System.out.println("Please enter new elements of arr " + i);
            newArr [i] = key.nextInt();

        }
        System.out.println("Original arr was :" +Arrays.toString(arr));
        System.out.println("A new arr after added elements is :" +Arrays.toString(newArr));






    }
}

package day27_wrapper_class_ArrayList;

import java.util.Arrays;

public class AddElementInArr {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

        int[] b = addElementInArr(a, 40);

        System.out.println(Arrays.toString(b));

        int[] c = addElementInArr(a, 10);
        System.out.println(Arrays.toString(c));

        int[] d = addElementInArr(a, 15);
        System.out.println(Arrays.toString(d));

        System.out.println("------------------");

        System.out.println(Arrays.toString(addElementInArr(a, 6, 7, 8, 9, 10)));
         System.out.println(Arrays.toString(a));


    }

    // i need to build a function (method ) which adds the element into an array
    public static int[] addElementInArr(int[] arr, int num) {

        int[] addedArr = Arrays.copyOf(arr, arr.length + 1);
        addedArr[addedArr.length - 1] = num;


        return addedArr;
    }

    // i need to build a custom method to add elements into an array
    public static int[] addElementInArr(int[] arr, int... arr2) {

        int[] addedArr = Arrays.copyOf(arr, arr.length + arr2.length);

        for (int i = 0; i < arr2.length; i++) {

            addedArr[arr.length + i] = arr2[i];

            }


        return addedArr;

    }

}




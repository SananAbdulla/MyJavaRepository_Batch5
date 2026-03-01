package practice;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement_pract {
    public static void main(String[] args) {


//        Scanner key = new Scanner(System.in);
//        System.out.println("Please enter the size of an Array");
//        int sizeArr = key.nextInt();
//
//        int[] userArr = new int[sizeArr];
//
//        int index = 0;
//
//
//        do {
//            System.out.println("Please ennter " + (index +1) + " number of an Array");
//            int userNum = key.nextInt();
//            userArr[index] = userNum;
//            index++;
//
//
//        }
//
//        while (index < userArr.length);
//
//
//        System.out.println("User entered array is: " + Arrays.toString(userArr));
//
//        System.out.println("-------");
//
//        for (int each: userArr) {
//
//            System.out.print(Arrays.toString(userArr));
//
//        }


        // option 2:


        Scanner key = new Scanner(System.in);
        System.out.println("Please enter the size of an Array");
        int size = key.nextInt();
        int [] arr1 = new int [size];

        for (int i = 0; i < arr1.length ; i++) {

            System.out.println("Please enter number for index of " + i);
            arr1[i] = key.nextInt();

        }

        System.out.println(Arrays.toString(arr1));

        System.out.println("Please enter how many additional elements u want to add? ");
        int additonalSize = key.nextInt();

        int [] newArray = Arrays.copyOf(arr1, arr1.length +additonalSize);

        for (int i = arr1.length; i < newArray.length ; i++) {

            System.out.println("Please enter additonal elements in index of: " + i);
            newArray [i] = key.nextInt();

        }

        System.out.println("Original arrays size is: " + arr1.length);
        System.out.println("Added value arrays size is: " + newArray.length);

        System.out.println(Arrays.toString(newArray));

    }
}

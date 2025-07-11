package practice;

import java.util.Arrays;

public class AddElementInArr_CustomMethod {
    public static void main(String[] args) {

        int [] number = {22, 11, 33, 40};

       // System.out.println(Arrays.toString(addElementIntoArray(number, 50, 60)));

         System.out.println(Arrays.toString(addElementIntoArray(number, 50, 60, 80)));



    }

    // One Option
//    public static int [] addElementIntoArray (int [] arr, int ... elements) {
//
//        int [] addedArr = Arrays.copyOf(arr, arr.length + elements.length);
//
//        for (int i = 0; i < elements.length ; i++) {
//
//            addedArr[arr.length + i] = elements[i];
//
//
//        }
//
//        return addedArr;
//
  //  }

    // Second Option

   public static int [] addElementIntoArray (int [] arr, int ... values) {

        int [] addedElementArr = Arrays.copyOf(arr, arr.length + values.length);

       for (int i = arr.length, j = 0;  i < addedElementArr.length ; i++, j++) {

           addedElementArr[i] = values[j];

       }




        return addedElementArr;
    }



    }

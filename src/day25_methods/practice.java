package day25_methods;

import java.util.Arrays;

public class practice {

    public static void main(String[] args) {


        int [] num = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(arrMIN(num));




    }


    public static int arrMIN(int [] arr) {
        Arrays.sort(arr);

        return arr[0];
    }
}

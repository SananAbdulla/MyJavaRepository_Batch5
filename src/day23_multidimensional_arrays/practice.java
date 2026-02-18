package day23_multidimensional_arrays;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {


        String [] str = {"a", "b", "c"};
        String [] str2 = {"d", "e", "f"};


        String [][] arr = {str, str2};


        for (String [] eachArr : arr) {

            for (String eachStr : eachArr) {

                System.out.println(eachStr);
            }
        }



    }
}

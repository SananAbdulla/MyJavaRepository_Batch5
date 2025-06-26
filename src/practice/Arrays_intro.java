package practice;

import java.util.Arrays;

public class Arrays_intro {
    public static void main(String[] args) {


        int [] number = new int [4];
        System.out.println("number.length = " + number.length);


        String[] str2 =  {"Chicago", "Fairfax", "NewYork", "Boston"};
        System.out.println(Arrays.toString(str2));

       String ArraysToString = Arrays.toString(str2);
        ArraysToString = ArraysToString.substring(1,ArraysToString.length()-1 );
        System.out.println(ArraysToString.replace(",", " *"));



        double [] num = new double[]{3,4,543,13,43};
        System.out.println(num.length);
        System.out.println(Arrays.toString(num));



    }
}

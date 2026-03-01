package practice;

import java.util.Arrays;

public class SplitExample_practice1 {
    public static void main(String[] args) {


        String str = "monday tuesday wednesday thursday friday saturday sunday";
        System.out.println(str);
        System.out.println(str.length());

        System.out.println("--------------");

        String [] strArray= str.split(" ");
        System.out.print(Arrays.toString(strArray));

        for ( String each : strArray) {
            System.out.println(each);
        }


    }

}

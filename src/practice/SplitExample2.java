package practice;

import java.util.Arrays;

public class SplitExample2 {
    public static void main(String[] args) {



        String str = "monday tuesday wednesDay thursDay friday saturday sunday";

        String [] strSplitArray = str.split(",");
        String [] strSplitArray2 = str.toLowerCase().split("day");



        System.out.println(Arrays.toString(strSplitArray));
        System.out.println(Arrays.toString(strSplitArray2));

    }
}

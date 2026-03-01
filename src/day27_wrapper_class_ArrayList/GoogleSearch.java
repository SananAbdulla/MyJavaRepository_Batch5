package day27_wrapper_class_ArrayList;

/*
   Google Search
    Toyota -----> About 1, 310,000,000 result (0.42 seconds)
    Honda -----> About 1,270,000,000 results (0.32 seconds)


 */


import java.util.Arrays;

public class GoogleSearch {
    public static void main(String[] args) {

// Task: go search something on the app, and check the result comes back lover than 0.5 second


        String searchResultInfo = "About 558,000,000 results (0.29 seconds)";
        searchResultInfo = searchResultInfo.replace(")", "").replace("(", "");
        System.out.println(searchResultInfo);
        String [] searchResultInfoArr= searchResultInfo.split(" ");
        String time = searchResultInfoArr[searchResultInfoArr.length-2];
        System.out.println(time);

       double time1 =  Double.parseDouble(time); // Converts String to double
       //Double time2 =  Double.valueOf(time); // Converts String to Double



        if ( time1 < 0.5) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

        // We did the same with ternary
        System.out.println(time1 < 5 ? "Pass" : "Fail");
    }
}
package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

import static day28_arraylist.HtmlGenerator.htmlGenerator;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(40);
        arrList.add(50);

        // this is how to get last element
        System.out.println(arrList.get(arrList.size() - 1));


        String str = "div^2";

        System.out.println("----------");
        ArrayList<Integer> numArrList = new ArrayList<>();

        numArrList.add(100);
        numArrList.add(Integer.parseInt("300"));
        numArrList.add(500);
        numArrList.add(Integer.valueOf("50"));


        System.out.println(numArrList);


        int [] num1 = {1, 3, 5};

        Arrays.asList(num1);

        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(primitiveToNonPrimitiveArr(num1)));

        System.out.println(nums2);




//
        /*

        Input:
            div^2
        Output:
            <div></div> <div></div>

         */

        System.out.println(htmlGener(str));
        System.out.println(htmlGener("li^5"));



    }

    public static String htmlGener (String str) {
        String result = "";

        String [] strArr = str.replace("^" , " ").split(" ");

        System.out.println(Arrays.toString(strArr));


        int numOfCycles = Integer.parseInt(strArr[1]);

        for (int i = 0; i < numOfCycles ; i++) {

            result += "<"+ strArr[0] + "></"+ strArr[0] + ">";


        }

        return result;
    }


    public static Integer [] primitiveToNonPrimitiveArr(int [] arr) {

        Integer [] objArr = new Integer[arr.length];

        for (int i = 0; i < objArr.length ; i++) {

            objArr [i] = arr[i];

        }



        return objArr;
    }
}

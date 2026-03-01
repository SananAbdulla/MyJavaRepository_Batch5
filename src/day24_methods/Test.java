package day24_methods;


import java.util.Arrays;

public class Test {





    public static void main(String[] args) {


        int [][] numbers = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };


        double totalSum = 0;
        int totalLength = 0;



        for (int [] each : numbers) {
            double sumEachArr = 0;


            for ( int eachElem : each) {
                sumEachArr += eachElem;
            }

            totalSum += sumEachArr;
            totalLength += each.length;

            System.out.println("Average of " + Arrays.toString(each) + " is: " + sumEachArr/each.length);

        }


        System.out.println("Average of : " + Arrays.deepToString(numbers) + " is: " + totalSum / totalLength);


    }
}

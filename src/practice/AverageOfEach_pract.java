package practice;


import java.util.Arrays;

public class AverageOfEach_pract {
    public static void main(String[] args) {


        /*

            Given a 2D array find the average of each inner array
            and extra: average of the whole array

            Ex:

                3, 4, 5, 6, 10
                5, 2, 6, 14
                10, 20, 30, 50


 */


        int [][] numbers = {{3, 4, 5, 6, 10},
                            {5, 2, 6, 14},
                            {10, 20, 30, 50}
                           };

        double TotalSumArr = 0;
        int totalLenghArr = 0;



        for (int [] each : numbers ) {

            double sumEachArr = 0;

            for ( int eachElement : each ) {

                sumEachArr += eachElement;
            }

            TotalSumArr += sumEachArr;
            totalLenghArr += each.length;


            System.out.println("Avarage of " + Arrays.toString(each) + " is " + sumEachArr/each.length);

        }
        System.out.println("Avarage of 2D Array" + Arrays.deepToString(numbers) + " is " + TotalSumArr/totalLenghArr);



    }
}

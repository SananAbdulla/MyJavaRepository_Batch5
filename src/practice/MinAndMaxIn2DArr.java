package practice;

import my_utilities.ArrayUtil;

public class MinAndMaxIn2DArr {

    public static void main(String[] args) {

        int[][] numbers = {
                {4, 2, 9, 20},
                {1, 5, 7},
                {8, 3, 6}
        };

        int min = numbers[0][0];
        int max = numbers[0][0];


        for (int i = 0; i < numbers.length ; i++) {

            for (int j = 0; j <numbers[i].length ; j++) {

                int current = numbers[i][j];

                if (current < min ) {
                    min = current;
                }
                if (current > max) {
                    max = current;
                }

            }

        }
        System.out.println("The MAX element of 2D Arr is: " + max);
        System.out.println("The MIN element of 2D Arr is: " + min);



        int[][] numbers2 = {
                {4, 2, 9, 20, 200},
                {3, 5, 7, 1000},
                {8, 0, 6, 500, 600}
        };

        System.out.println(ArrayUtil.MaxIn2DArr(numbers2));
        System.out.println(ArrayUtil.MinIn2DArr(numbers2));


    }
}

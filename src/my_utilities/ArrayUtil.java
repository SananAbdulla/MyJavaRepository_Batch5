package my_utilities;

import java.util.Arrays;

/**
 * This method returns the minimum value in the given int array
 */
public class ArrayUtil {
    public static int minNumInArr(int[] arr) {
        int min = 0;
        Arrays.sort(arr); // [2, 23, 23, 345, 765, 1356, 2344]

        min = arr[0];

        return min;
    }


    /**
     * This method returns the maximum value in the given int array
     */
    public static int maxNumInArr(int[] arr) {
        int max = 0;
        Arrays.sort(arr); // [2, 23, 23, 345, 765, 1356, 2344]

        max = arr[arr.length - 1];

        return max;
    }


    /**
     * This method returns boolean whether given int arr contains the given num
     *
     * @param arr given array
     * @param num given num
     * @return boolean whether contains or not
     */
    public static boolean contains(int[] arr, int num) {
        boolean result = false;

        for (int each : arr) {
            if (each == num) {
                result = true;
                break;
            }
        }

        return result;
    }

    /**
     * find MIN value in 2D Array
     * @param arr giver array
     * @return Min value in 2D Arr
     */
    public static int MinIn2DArr(int[][] arr) {

        int min = arr[0][0];


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                int current = arr[i][j];

                if (current < min) {
                    min = current;
                }


            }

        }
        return min;


    }

    /**
     * find MAX value in 2D Array
     * @param arr giver array
     * @return Max value in 2D Arr
     */
    public static int MaxIn2DArr(int[][] arr) {

        int max = arr[0][0];


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                int current = arr[i][j];

                if (current > max) {
                    max = current;
                }


            }

        }
        return max;
    }
}

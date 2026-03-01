package practice;

import java.util.Arrays;

public class multiDimenArr {
    public static void main(String[] args) {



        int [] a = {33, 55, 66};
        int [] b = {30, 50, 60};

        int [] [] z = {a,b};

        System.out.println(Arrays.deepToString(z));

        int [] [] y = { {22,44,55},
                        {55,43,21,6},
                        {10,23,42}
                       };
        System.out.println(Arrays.deepToString(y));
        System.out.println(Arrays.toString(y[0]));
        System.out.println(Arrays.toString(y[0]));
        System.out.println(y[0]);

        System.out.println("----------");

        for (int []  each : y) {

           // System.out.println(Arrays.toString(each));

            for (int eachelement: each) {
                System.out.println(eachelement);
            }

        }


    }
}

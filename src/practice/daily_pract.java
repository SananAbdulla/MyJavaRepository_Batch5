package practice;

import java.util.Arrays;

public class daily_pract {

    public static void main(String[] args) {


        String str = "Bakaub";
       Boolean isTrue =  str.startsWith("Bak");
        System.out.println(isTrue);
        System.out.println(str.startsWith("Ba"));
        System.out.println(str.contains("aku"));

        System.out.println(str.lastIndexOf("a", 4));


        System.out.println("------");

        int a = 1;

//        while (a < 10) {
//
//            System.out.println("Hello");
//            a++;
//        }


        do {
            System.out.println("Hi");
            a++;
        }

        while (a < 6 );



        int [] nums = new int [3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;

        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length);

        System.out.println(nums[nums.length - 1]);



        int [] number = {22, 11, 44, 22, 543, 11, 556};

        for (int i = 0; i < number.length; i++) {

            if ( i == number.length-1 ) {
                System.out.print(number[i]);
            }
            else {
                System.out.print(number[i] + " ");

            }
        }

    }

}
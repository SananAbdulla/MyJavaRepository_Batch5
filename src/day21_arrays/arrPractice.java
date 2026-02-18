package day21_arrays;

import java.util.Arrays;

public class arrPractice {
    public static void main(String[] args) {




        int [] arr = {1, 2, 3, 4, 5};

        int sum = 0;


//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//
//        System.out.println(sum);


        System.out.println();


        for ( int each : arr) {

            sum+= each;
        }

        System.out.println(sum);


        int [] nums = {7, 3, 1, 6, 4};
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        int max = nums[nums.length-1];
        int min = nums[0];

        System.out.println(max);
        System.out.println(min);


        String [] words = {"java", "selenium", "softskill", "mentors", "loop"};

        String longestWord = words[0];
        String shortestWord = words[0];


        for (String each : words) {

            if (each.length() > longestWord.length()) {
                longestWord = each;
            }
            if (each.length() < shortestWord.length()) {
                shortestWord = each;
            }
        }
        System.out.println(longestWord);
        System.out.println(shortestWord);

    }
}

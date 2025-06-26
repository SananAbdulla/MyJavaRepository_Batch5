package practice;

import java.util.Arrays;

public class ForEachExample_practice {

    public static void main(String[] args) {



        int [] nums = {3, 4, 5, 6, 8, 10};
        System.out.println(Arrays.toString(nums));


        for (int i = 0; i < nums.length; i++) {

            System.out.println(nums[i]);

        }
        System.out.println("---------");
        for(int each : nums) {
            System.out.print ( each + ", ");
        }

    }
}

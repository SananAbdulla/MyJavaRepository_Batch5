package practice;

import java.util.Arrays;

public class SortExample_practice {
    public static void main(String[] args) {



        int [] nums = {23, 34, 2, 65, -56, 3};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println("Smallest number:" + nums[0]);
        System.out.println("Largest number:" + nums[nums.length-1]);

    }
}

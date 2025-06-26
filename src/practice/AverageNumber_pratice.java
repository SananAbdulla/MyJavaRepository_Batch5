package practice;

public class AverageNumber_pratice {
    public static void main(String[] args) {

        int [] nums = {10, 15, 7, 3};
        double sum= 0;

        for (int i = 0; i < nums.length ; i++) {
            sum += nums[i];

        }
        System.out.println(sum/ nums.length);

        System.out.println("----------");

        sum = 0;
        for(double each : nums) {
            sum += each;

        }

        System.out.println(sum/ nums.length);


    }
}

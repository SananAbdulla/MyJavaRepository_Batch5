package practice;

public class MinMax_practice {
    public static void main(String[] args) {


        int [] nums = {500, 1120, -90, 90, 250, - 100, 1122};

        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;

        for (int each : nums) {

            if ( each  > Max) {
                Max = each;
            }
            if ( each < Min){
                Min = each;
            }

        }


        System.out.println("Max number is: " + Max);
        System.out.println("Min number is: " + Min);

        System.out.println("-------------");

        // Option 2./

        for (int i = 0; i < nums.length ; i++) {

            if (nums[i] > Max) {
                Max = nums[i];
            }
            if (nums[i] < Min) {
                 Min = nums[i];
            }

        }
        System.out.println("Max number is: " + Max);
        System.out.println("Min number is: " + Min);

    }
}

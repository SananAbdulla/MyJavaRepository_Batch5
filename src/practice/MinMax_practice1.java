package practice;

public class MinMax_practice1 {
    public static void main(String[] args) {



        int [] arr = {432,654,54,10, 700};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;



        for (int each : arr) {

            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);


        System.out.println("-------------");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);    }
}

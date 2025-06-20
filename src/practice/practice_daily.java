package practice;

public class practice_daily {
    public static void main(String[] args) {

        /*
             find 5 factorial
         */


        int number = 6;
        int result= 1;

        while (number >0) {
            result *=number;
            number--;

        }
        System.out.println(result);
    }
}

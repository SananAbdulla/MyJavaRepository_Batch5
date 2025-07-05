package practice;

import java.util.Scanner;

public class containsArrElement_Pract {
    public static void main(String[] args) {


//        int[] number = {22, 33, 44, 55, 66};

//        Scanner key = new Scanner(System.in);
     //  System.out.println("Enter number to see if that number in the Arr. true/false");
//
//        int userEnteredNum = key.nextInt();
//           boolean result;
//
//        for (int each : number) {
//
//            if (userEnteredNum == each) {
//                result = true;
//            } else
//                result = false;
//        }
//        System.out.println(result);


        System.out.println("--------------");
        Scanner key = new Scanner(System.in);

        int[] number = {22, 33, 44, 55, 66};

        int i = 0;
        boolean result = false;

        do {
            System.out.println("Enter a number again");
            int  userEnteredNum = key.nextInt();
            if (userEnteredNum == number[i]) {
                result = true;
                break;
            }
            i++;
        }

        while ( i < number.length );


        if (result == true ) {

            System.out.println("Number found in array");
        }
        else {
            System.out.println("Number NOT found in array");

        }
    }
}
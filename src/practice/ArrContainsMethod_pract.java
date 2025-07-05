package practice;

public class ArrContainsMethod_pract {
    public static void main(String[] args) {


        int [] numbers = {44, 33, 11, 55, 66, 88};

        //System.out.println(contains(numbers, 10));
        System.out.println(contains2(numbers, 88));


    }

    // Using FOR EACH loop
//    public static boolean contains (int [] arr, int num) {
//
//       boolean result = false;
//
//       for ( int eachNumber : arr ) {
//
//           if (eachNumber == num) {
//               result = true;
//               break;
//           }
//       }
//
//
//        return result;
//    }


    // USing For i loop


    public static boolean contains2(int [] arr, int num) {
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                result = true;
                break;

            }

        }


        return result;
    }

    }

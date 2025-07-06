package practice;

public class SumOfElements_Methods_pract {
    public static void main(String[] args) {


        // TODO remember var args

        int[] arr = {1, 3, 5, 23, 65, 76, 7};

        // System.out.println(sum(arr));

        // using var args
        //System.out.println(sum(4, 5, 10, 1));

        System.out.println(contains(1, 3, 5, 1, 3, 5, 23, 65, 76, 7));

    }

    public static int sum(int[] arr) {

        int total = 0;

        for (int each : arr) {

            total += each;
        }


        return total;
    }

//    public static int sum (int ... arr) {
//
//        int total = 0;
//
//        for( int each : arr) {
//
//            total += each;
//        }
//
//
//        return total;
//    }

    // TODO remember this custom method
    /**
     *  here i give a number to arr and all of numbers must be existed in the arr otherwise it will return false
     * @param a has to be in a arr
     * @param b has to be in a arr
     * @param c has to be in a arr
     * @param arr
     * @return has to be either true or false
     */
    public static boolean contains(int a, int b, int c, int... arr) {


//        for (int each : arr) {
//
//            if (each == a || each == b || each == c) {
//                return true;
//            }
//
//
//        }
//
//        return false;

        boolean foundA = false;
        boolean foundB = false;
        boolean foundC = false;

               for (int each : arr) {

                   if (each == a) {
                       foundA = true;
                   }
                   if (each == b) {
                       foundB = true;
                   }
                   if (each == c) {
                       foundC = true;
                   }

               }



        return foundA && foundB && foundC;

   }

}






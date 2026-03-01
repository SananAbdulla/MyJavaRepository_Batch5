package practice;

public class EvenOrOdd_practice {
    public static void main(String[] args) {
/*
    Even and odd from array
    Write a program that can count the even and odd number from an array of integers
    Ex:
        Input: [4,1,3,12,5]
        Output:
            Even: 2
            Even Numbers: 4 12
            Odd: 3
            Odd Numbers: 1 3 5
 */
        int [] nums = {4, 1, 3, 12, 5};
        int EvenCount = 0;
        int OddCount = 0;
        String EvenNumbers = "";
        String OddNumbers = "";


         // Option 1.

//        for (int i = 0; i < nums.length; i++) {
//
//           // System.out.print(nums[i] + ", ");
//
//            if (nums[i] % 2 == 0) {
//                EvenCount++;
//                EvenNumbers += nums[i] + ", ";
//            }
//            else {
//                OddCount++;
//                OddNumbers += nums[i] + ", ";
//            }
//
//
//
//        }
//
//
//        System.out.println("EvenNumbers count" + " " + EvenCount);
//        System.out.println("EvenNumbers are " +EvenNumbers );
//
//        System.out.println("OddNumbers count" + " " + OddCount);
//        System.out.println("OddNumbers are " + OddNumbers.substring(0, OddNumbers.lastIndexOf(",")) );



        // Option 2.

        for (int each: nums) {
            if (each % 2 == 0) {
                EvenCount++;
                EvenNumbers += each + " ";

            }
            else {
                OddCount++;
                OddNumbers += each + " ";
            }


        }

        System.out.println("EvenNumbers count" + ": " + EvenCount);
        System.out.println("EvenNumbers are: " +EvenNumbers );

        System.out.println("OddNumbers count" + ": " + OddCount);
        System.out.println("OddNumbers are: " + OddNumbers);

    }
}

package day21_arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {


//        int [] number = {1, 2, 3, 4, 5};
//
//
//
//        int [] num = new int [3];
//        num[0] = 10;
//        num[1] = 20;
//        num[2] = 30;
//
//
//        System.out.println(Arrays.toString(num));
//
//
//        int [] numbers1 = {22, 33, 44, 55, 66};
//
//        int sum = 0;
//
//
//        for (int each: numbers1) {
//
//            sum += each;
//
//        }
//
//        System.out.println(sum);
//        System.out.println("sum/ numbers.length = " + sum / numbers1.length);
//
//
//        System.out.println("------------");
//        int [] numbers2 = {22, 33, 44, 55, 66};
//
//        int sum2 = 0;
//
//        for (int i = 0; i < numbers2.length; i++) {
//
//            sum2 += numbers2[i];
//
//        }
//
//        System.out.println(sum);
//        System.out.println("sum/ numbers.length = " + sum2 / numbers2.length);
//
//
//        System.out.println("--------------");
//
//        int [] nums = {4, 1, 3, 12, 5, 67};
//         int countEven= 0;
//         int countOdd= 0;
//
//         String evenNumbers = "";
//         String oddNumbers = "";
//
//         for (int eachNumber : nums) {
//
//             if (eachNumber % 2 == 0) {
//                 countEven ++;
//                 evenNumbers += eachNumber + " ";
//             }
//             else {
//                 countOdd++;
//                 oddNumbers+= eachNumber + " ";
//             }
//         }
//        System.out.println(countEven);
//         System.out.println("Even numbers: " + evenNumbers);
//
//        System.out.println(countOdd);
//         System.out.println("Odd numbers: " + oddNumbers);
//
//
//        System.out.println("FriendList");
//
//        Scanner key = new Scanner(System.in);
//
//        System.out.println("How many friends do u have?");
//
//        String []friendList = new String [key.nextInt()];
//
//        key.nextLine();
//
//
//
//
//        for (int i = 0; i < friendList.length; i ++) {
//
//            System.out.println("Please enter name of " + (i+1) + " friends in the list: ");
//
//            friendList [i]  = key.nextLine();
//
//
//
//
//        }
//        System.out.println("Your have " + friendList.length + " friend list:" );
//
//        for (String eachName : friendList) {
//            System.out.println(eachName);
//        }


        // Initials

  //      String[] str = {"Sanan Abdullayev", "Samir Aliyev", "Mahmoud Abdullah", "Tom Jerry", "Donald Trump"};

//        for (String eachFullName : str) {
//
//            String firstName = eachFullName.substring(0, eachFullName.indexOf(" ")).toUpperCase();
//            String lastName = eachFullName.substring(eachFullName.indexOf(" ") + 1).toUpperCase();
//
//            System.out.println("" + firstName.charAt(0) + lastName.charAt(0));
//
//
//        }

//        System.out.println("arrayInitials(str) = " + arrayInitials(str));
//
//
//    }
//
//    public static String arrayInitials(String[] names) {
//
//        String message = "";
//        for (String eachFullName : names) {
//
//            String firstName = eachFullName.substring(0, eachFullName.indexOf(" ")).toUpperCase();
//            String lastName = eachFullName.substring(eachFullName.indexOf(" ") + 1).toUpperCase();
//
//            message += ("\n" + firstName.charAt(0) + lastName.charAt(0));
//
//
//        }
//
//
//        return message;


        // ReverseArray


        int [] nums = {1, 2, 3, 4, 5, 6};


        int [] reversedNums = new int[nums.length];
//
//        for (int i = nums.length - 1; i >= 0; i--) {
//
//            reversedNums[reversedNums.length-1  - i] = nums[i];
//        }
//
//        System.out.println(Arrays.toString(reversedNums));

    int index = nums.length - 1;

    for (int each : nums) {

       // System.out.println(each);

        reversedNums[index] = each;
        index--;

    }

        System.out.println(Arrays.toString(reversedNums));



    }

}

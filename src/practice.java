import java.util.Scanner;

public class practice {
    public static void main(String[] args) {



//        int a = 10;
//       // a++;
//        // --a;
//        int b = 20;
//       // b++;
//       // --b;
//       // b = ++a;
//
////        System.out.println(a);
////        System.out.println(b);
////
////        System.out.println(b++);
////        System.out.println(b);
//
//
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("\n\tPlease enter 1st Number");
//        int num1 = scan.nextInt();
//
//        System.out.println("\n\tPlease enter 2nd Number");
//        int num2 = scan.nextInt();
//
//         scan.nextLine();
//
//        System.out.println("Please enter name");
//        String name = scan.nextLine();
//
////                System.out.println("are numbers of " + num1 + " and " + num2 + " equal? --->" + (num1==num2));
////

        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int num = input.nextInt();

        boolean isEven = num%2== 0;
        boolean isOdd = num%2 == 1;

        if (isEven) {
            System.out.println("The number  " + num + " Is Even");
        }
        else  {
            System.out.println("The number  " + num + " Is Odd");

        }





    }
}

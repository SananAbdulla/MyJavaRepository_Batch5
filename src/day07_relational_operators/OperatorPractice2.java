package day07_relational_operators;

public class OperatorPractice2 {
    public static void main(String[] args) {
        int t = 100; // 101 -> 100 -> 101 -> 100

        int p = - ++t * t-- / t++ + --t;
        // p = '-' 101 '*' 101 '/' 100 '+' 100
        // p = -101 '*' 101 '/' 100 '+' 100
        // p = -101 * 101 / 100 '+' 100 -- >  -10201 / 100 '+' 100
        // p = -102 + 100 --- > -2

        System.out.println(t);
        System.out.println(p);


        /*
              1)      ++ 	--
              2)      -(making it negative)
              3)      *	/	%
              4)      + 	-
         */


//        int a = 5;
//        int b = ++a;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println("__________");
//        System.out.println(a++);
//        System.out.println(++b);


        int a = 10;
       int b= a++;
        System.out.println(a);
        System.out.println(b);

    }
}

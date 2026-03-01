package practice;

import java.util.Arrays;

public class Equals_practice {
    public static void main(String[] args) {


        int [] a = {1, 2, 3, 4};
        int [] b = {1, 2, 3, 4};
        int [] d = {4, 3, 2, 1};



        System.out.println(Arrays.equals(a,b));
        System.out.println("---------");
        boolean result = Arrays.equals(a, b);
        System.out.println(result);
        System.out.println("---------");
        Arrays.sort(d);
        System.out.println(Arrays.equals(a,d));


        System.out.println("-------");

        String str  = "Azerbaijan";

        char [] strCharArr1 = str.toCharArray();
        System.out.println(strCharArr1);
        System.out.println(Arrays.toString(strCharArr1));
        char [] strCharArr2 = new char [str.length()];

        for (int i = 0; i < str.length(); i++) {
            strCharArr2 [i] = str.charAt(i);

        }
        System.out.println(Arrays.toString(strCharArr2));
        System.out.println(strCharArr2);





    }
}

package practice;

import java.util.Arrays;

public class charArray_practice {
    public static void main(String[] args) {


        char []  letters = {'l', 'o', 'o', 'p', 'c', 'a', 'm', 'p'};

        System.out.println(letters.length);
        System.out.println(letters);

        System.out.println(Arrays.toString(letters));
        System.out.println("It will show memory location with concat: "+ letters);

        System.out.println("---------");

        char [] letters2 = new char [letters.length];
        System.out.println(Arrays.toString(letters2));
        System.out.println(letters2.length);

        System.out.println("---------------");
        for (int i = 0; i < letters.length; i++) {

            letters2[i] = letters [i];

        }

        System.out.println(letters2);


        System.out.println("================");
        String str = "NewYork";
        char [] strChar = new char[str.length()];

        for (int i = 0; i <str.length() ; i++) {
            strChar [i] = str.charAt(i);
        }

        System.out.println(Arrays.toString(strChar));

        System.out.println("=============");

        char [] strChar2 = str.toCharArray();
        System.out.println(Arrays.toString(strChar2));


    }
}

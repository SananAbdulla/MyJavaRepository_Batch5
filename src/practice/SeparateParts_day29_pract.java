package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts_day29_pract {
    public static void main(String[] args) {

        String str = "ABCD123$%#@456EFG9!";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println("Original: " + list);

        ArrayList <String> numList = new ArrayList<>(list);
        numList.retainAll(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0"));
        System.out.println("Numbers: "+ numList);

        ArrayList <String> letters = new ArrayList<>(list);
        letters.retainAll(numList);
        System.out.println("Letters: " + letters);








    }
}

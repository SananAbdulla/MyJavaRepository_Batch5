package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveIfExample_pract {
    public static void main(String[] args) {


        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        System.out.println(number);

        number.removeIf(eachElement -> eachElement % 2 == 0 );

        System.out.println(number);


        ArrayList<Integer> number1 = number;
        ArrayList<Integer> number2 = new ArrayList<>(number);

        System.out.println(Collections.max(number));

        number.replaceAll(eachElement -> eachElement + 2);
        System.out.println(number);

        System.out.println("------");
        number.replaceAll(each -> each * 2);
        System.out.println(number);

        System.out.println("------");

        for (int i = 0; i < number.size(); i++) {

            number.set(i, number.get(i)*2);

        }

        System.out.println("for i loop" + number);



    }
}

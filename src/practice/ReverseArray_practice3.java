package practice;

import java.util.Arrays;

public class ReverseArray_practice3 {
    public static void main(String[] args) {

        String[] cities = {"Baku", "London", "NY","Paris"};


        String result = "[";

        for (int i = cities.length-1; i>=0; i--) {

            result += cities[i] + ", ";
        }
        result = result.substring(0, result.lastIndexOf(",")) + "]";

        System.out.println("Original Array: "+ Arrays.toString(cities));
        System.out.println("Reversed Array "+result);

        System.out.println("------------");

        String [] reverse = new String [cities.length];

        for (int i = cities.length-1; i >=0 ; i--) {
            reverse [reverse.length- 1 - i] = cities[i];

        }

        System.out.println("Original Array: "+ Arrays.toString(cities));
        System.out.println("Reversed Array "+ Arrays.toString(reverse));


        System.out.println("================");

        for (int j = 0, i = cities.length-1 ; i>=0; i-- ,j++) {
            reverse[j] = cities[i];

        }

        System.out.println(Arrays.toString(reverse));
    }
}

package day28_arraylist;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {


        ArrayList<String> arr1 = new ArrayList<>();

        arr1.add("Mon");
        arr1.add("Tues");
        arr1.add("Wed");
        System.out.println(arr1);
        System.out.println("----------");

        ArrayList<String> arr3 = new ArrayList<>(arr1);
        System.out.println(arr3);



        ArrayList<String> arr2 = arr1;
        System.out.println("-------------");
        arr2.set(0, "new Mon");
        arr2.set(1, "New Tues");
        arr2.set(2, "New Wed");
        System.out.println(arr2);


    }
}

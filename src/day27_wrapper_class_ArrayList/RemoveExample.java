package day27_wrapper_class_ArrayList;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {


        ArrayList<String> arrList = new ArrayList<>();
        System.out.println(arrList.size()); // gives 0 size

       // arrList.add(10); data type is String we cannot add int and etc

        arrList.add("Java");
        arrList.add("Python");
        arrList.add("Cc+");
        arrList.add("JS");

        System.out.println(arrList);

        // remove method
        arrList.remove(0); // we removed index 0 String

        System.out.println(arrList);

        arrList.remove("Python");
        System.out.println(arrList);




    }
}

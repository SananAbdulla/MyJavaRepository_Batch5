package day42_a_collection.collection;


import java.util.*;

public class Pract {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(12, 33, 55,56, 32, 11, 1));

        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);


        Set<Integer> sortedList = new TreeSet<>(list);
        System.out.println(sortedList);


        List<Integer> list2 = new ArrayList<>(Arrays.asList(11, 0, -4, 55, 12, 100));

        System.out.println(list2);

//        Collections.sort(list2);
//        System.out.println(list2);


        Set<Integer> sorted = new TreeSet<>(list2);

        System.out.println(sorted);



        Integer [] number = {1, 2, 3, 1, 5, 2 ,6, 8, 10};

        System.out.println(Arrays.toString(number));


        System.out.println(new LinkedHashSet<>(Arrays.asList(number)));


        String str = "DFGHJKJHGFDSDBNMNASXZZF";
        System.out.println(Arrays.asList(str.split("")));


        System.out.println(new LinkedHashSet<>(Arrays.asList(str.split(""))));


        ArrayList<String> arr = new ArrayList<>(Arrays.asList("DFGHJKJHGFDSDBNMNASXZZF"));
        System.out.println(arr);

        ArrayList<String>removeDupl = new ArrayList<>(new LinkedHashSet<>(arr));
        System.out.println(removeDupl);







    }
}

package day42_a_collection.iterate;

import java.util.*;

public class pract {
    public static void main(String[] args) {


     ArrayList<Integer> arr=  new  ArrayList<> (Arrays.asList(2, 3, 5, 6, 6, 12, 54, 23, 65, 3, 6));


        System.out.println(arr);


        //System.out.println( new LinkedHashSet<>(arr));

// Todo remember this how to remove elements on list using iterator. fori loop and for each loop does not do this
       Iterator<Integer> iterator=  arr.iterator();

       while (iterator.hasNext()) {
           if (iterator.next() <=6) {
               iterator.remove();
           }
       }
        System.out.println(arr);

        System.out.println("-----------");

       ArrayList<Integer> arrlist = new ArrayList<>(Arrays.asList(11, 10, 11, 9, 2, 4, 10, 4, 2, 1,1));

       Iterator<Integer> iteratorList = arrlist.iterator();

       while (iteratorList.hasNext()) {
           if (iteratorList.next() <= 10) {
               iteratorList.remove();
           }
       }

        System.out.println(arrlist);

    }
}

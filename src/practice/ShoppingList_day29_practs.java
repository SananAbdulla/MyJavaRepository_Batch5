package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShoppingList_day29_practs {
    public static void main(String[] args) {


        /*
    We will have one shopping list container
    We will check if certain items is in the shopping list
    We will ask user to add items in there
        If you wants to continue adding item, they can
    I will check to see what is the status of shopping list (empty or not)

 */

        Scanner key = new Scanner((System.in));

        ArrayList<String> shoppingList = new ArrayList<>();

        // size is 0
        // capacity is 10

        String userAnswer = "";

        do {
            System.out.println("Please enter item to your shopping list");
            String itemToAdd = key.nextLine();

            shoppingList.add(itemToAdd);

            System.out.println("Do you want to add more? (y/n");

            userAnswer = key.nextLine();

        }
        while (userAnswer.equalsIgnoreCase("Yes") || userAnswer.equalsIgnoreCase("y"));


        System.out.println(shoppingList);
        ShoppingListStatus(shoppingList);
        System.out.println("--------------");
        System.out.println(isShoppingListEmpty(shoppingList));
        System.out.println();
        System.out.println(ShoppingListStatus2(shoppingList));



//        if (shoppingList.isEmpty()) {
//            System.out.println("The ArrayList is Empty");
//        }
//        else {
//            System.out.println("It is not Empty");
//        }


        System.out.println("What item do du want to check if it is available in shopping list");

        String itemName = key.nextLine();

        itemAvailableInShoppingList(shoppingList, "Eggs");

    }

    // it is void method without return
    public static void ShoppingListStatus (ArrayList<String> list) {

        if (list.isEmpty()) {
            System.out.println("ArrayList is Empty");
        }
        else {
            System.out.println("ArrayList is not Empty");

        }




    }



public static Boolean isShoppingListEmpty(ArrayList<String> list) {

        return list.isEmpty();
}

public static String ShoppingListStatus2(ArrayList<String> list) {


        if (list.size() == 0 ) {

            return "ArrayList is Empty";
        }
        else {
            return "ArrayList is NOT Empty";

        }


}

    public static void itemAvailableInShoppingList (ArrayList<String> list, String itemName) {

        if (list.contains(itemName)) {
            System.out.println("Shoping list contains the item: " + itemName);
        }
        else {

            System.out.println("Shoping list does NOT contain the item: " + itemName);

        }


    }



}

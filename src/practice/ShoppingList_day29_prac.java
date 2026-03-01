package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList_day29_prac {
    public static void main(String[] args) {

      /*
        We will have one shopping list container
        We will check if certain items is in the shopping list
        We will ask user to add items in there
        If you wants to continue adding item, they can
        I will check to see what is the status of shopping list (empty or not)

      */

        Scanner key = new Scanner(System.in);

        ArrayList<String> shoppingList = new ArrayList<>();


        String userAnswer = "";

        do {
            System.out.println("Please enter item to Shopping List");
            String itemAdd = key.nextLine();

            shoppingList.add(itemAdd);

            System.out.println("Do you want to add more item? (y/n)");
            userAnswer = key.nextLine();


        } while (userAnswer.equalsIgnoreCase("Yes") || userAnswer.equalsIgnoreCase("y"));

        System.out.println(shoppingList);
        shoppingListStatus(shoppingList);

    }


    public static void shoppingListStatus (ArrayList<String> list) {

        if (list.isEmpty()) {
            System.out.println("Shopping List is empty");
        }
        else {
            System.out.println("Shopping List is NOT empty");

        }

    }
}

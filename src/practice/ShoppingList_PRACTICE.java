package practice;


import java.util.Scanner;

public class ShoppingList_PRACTICE {
    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);

        String shoppingList = "Your shopping List Items";
        String userAnswer = "";
        String userItem="";

        do {
            System.out.println("Please add your items:");
               // 1st Option to use userItem
            userItem = key.nextLine();
            shoppingList= shoppingList +"\n\t" +userItem;

                // 2nd Options
           // shoppingList = shoppingList + "\n\t"+ key.nextLine();

            System.out.print("Do you want to add more item (yes/no): ");
            userAnswer = key.nextLine(); // YES


        }
        while (userAnswer.equalsIgnoreCase("yes"));

        System.out.println(shoppingList);
    }


}


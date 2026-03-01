package day18_loops;

import java.util.Scanner;

public class shippingListPractice {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String shoppingList = "";
        String userAnswer = "";


        do {

            System.out.println("Please, ente the items");
            shoppingList = shoppingList +"\n\t"+scanner.nextLine();


            System.out.println("Do u wanna add more items?");
            userAnswer = scanner.nextLine();

        }
        while (userAnswer.equalsIgnoreCase("yes"));

        System.out.println(shoppingList);

    }




}

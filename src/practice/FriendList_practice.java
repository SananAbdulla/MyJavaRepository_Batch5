package practice;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList_practice {
    public static void main(String[] args) {

        Scanner key = new Scanner (System.in);
        System.out.print("Please, enter how many fiends you have: ");
        String [] friendList = new String[key.nextInt()];

       // int friendCount = 0;

        key.nextLine();
        for (int i = 0; i < friendList.length ; i++) {
           // friendCount++;

           // System.out.println("Please enter " + friendCount + " of your friend");
            System.out.println("Please enter " + (i+1) + " friends");
            friendList[i] =  key.nextLine();

        }

        System.out.println(Arrays.toString(friendList));







    }
}

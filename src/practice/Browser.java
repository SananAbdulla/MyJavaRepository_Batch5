package practice;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a browser type: ");
        String browser = key.nextLine();

        System.out.println("What webpage you will naviagate to?");
        String webPage = key.next();

        switch (browser) {
            case "Safari":
            case"safari":
                System.out.println("Opening " + webPage +" in Safari browser");
        }



    }
}

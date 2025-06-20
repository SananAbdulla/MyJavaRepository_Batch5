package practice;

import java.util.Scanner;

public class Website_practice {
    public static void main(String[] args) {
/*

    Task

        ask the user to enter a url
        find and print the website from the url

        assume your url always starts with www.
        assume your url always ends with .com

        www.google.com

        --> google
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a wesbite ");
        String website = scan.nextLine();

        String websiteName = website.substring(website.indexOf(".")+1, website.lastIndexOf("."));

        System.out.println("The name of the website is: " + websiteName);

    }
}

package practice;
import java.util.*;

public class substringMethod {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        String firstName;
        String lastName;

        System.out.println("Please enter first and last name ");
        String firstandLastName = key.nextLine();


        firstName=  firstandLastName.substring(0, firstandLastName.indexOf(" "));
        lastName =  firstandLastName.substring(firstandLastName.indexOf(" ")+1);

//        firstName = firstName.substring(0, 1).toUpperCase()+ firstName.substring(1).toLowerCase();
//        lastName = lastName.substring(0, 1).toUpperCase()+ lastName.substring(1).toLowerCase();

        System.out.println(firstName.substring(0, 1).toUpperCase()+ firstName.substring(1).toLowerCase());
        System.out.println(lastName.substring(0, 1).toUpperCase()+ lastName.substring(1).toLowerCase());




    }
}

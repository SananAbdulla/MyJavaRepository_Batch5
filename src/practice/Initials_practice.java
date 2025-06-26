package practice;

public class Initials_practice {
    public static void main(String[] args) {

        /*
Initials
        • Given an array of classmate’s names, first name and last separated by a space, print the initials of everyone
            Ex:
            Input:
                [ "James Bond", "Eve Rell", "Anna Johnson" ]
            Output:
                JB ER AJ
 */

        String [] classmates = {" James Bond ", " eve Rell ", " Anna johnson "};

        for (String each : classmates) {
            each = each.trim();
            String firstName = each.substring(0, each.indexOf(" ")).toUpperCase();
            String lastName =  each.substring(each.indexOf(" ")+1).toUpperCase();

            String intials = ""+firstName.charAt(0)+lastName.charAt(0);

           // System.out.println(""+firstName.charAt(0)+lastName.charAt(0));
           // System.out.println("------");
//            System.out.println(intials);

            System.out.println(intials);







        }


        System.out.println("---------------");


        for (int i = 0; i < classmates.length ; i++) {

            classmates[i] = classmates[i].trim();

            String firstName = classmates[i].substring(0, classmates[i].indexOf(" ")).toUpperCase();
            String lastName  = classmates[i].substring(classmates[i].indexOf(" ")+1).toUpperCase();

            System.out.println(  ("" + firstName.charAt(0) + lastName.charAt(0)) );

        }



    }
}

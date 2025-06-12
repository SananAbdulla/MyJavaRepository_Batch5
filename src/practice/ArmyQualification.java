package practice;

import java.util.Scanner;

public class ArmyQualification {
    public static void main(String[] args) {
         /*
    Declare and assign these variables: Citizenship(boolean), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the person is qualified to join the army.

        - The person must be a citizen or a resident
            -> If not print: You must be a citizen or a resident
        - Their age must be between 18 and 35  //----- > 18 <= age <= 35
            -> If not print: Your age must be between 18 to 35 years old
        - They must have a high school diploma
            -> If not print: You must have a high school diploma

        > If all the criteria is met print: You are qualified for the Army
     */

        Scanner key = new Scanner(System.in);
        boolean isCitizen, isResident, hasDiploma;
        int age;

        System.out.println("Welcome to Army Station");
        System.out.println("Please answer the questions below:");
        System.out.println("Are you a citizen? true/false");
        isCitizen = key.nextBoolean();
        System.out.println("areu a resident?");
        isResident = key.nextBoolean();
        System.out.println("What is your age?");
        age = key.nextInt();
        System.out.println("Do u have high school diploma? true/false");
        hasDiploma = key.nextBoolean();

        if ((isCitizen || isResident && age >= 18 && age <=35 && hasDiploma))
        {
            System.out.println("You are qualified for the Army");
        } else {
            System.out.println("You are not eligible for Army for following reasons below: ");
            if (isCitizen != true || isResident != true){
                System.out.println("You must be a citizen or resident");
            }
            if (hasDiploma != true) {
                System.out.println("You must have diploma");
            }
            if (age < 18 || age > 35) {
                System.out.println("You must be between 18-35");
            }
        }




    }
}

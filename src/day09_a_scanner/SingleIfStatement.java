package day09_a_scanner;

public class SingleIfStatement {
    public static void main(String[] args) {

        // Single If Statement - with direct boolean value
        // Condition --> true / false
        if (false){
            System.out.println("1st print");
        }

        // print statement
        System.out.println("2nd print");


        System.out.println("---------------------------");
        // Single if statement - with relational operators which results in - true/false
        int age = 75;
        if(age >= 75) { // if true - do the code block of if statement, if false, do nothing (skip code block))
            System.out.println("You are a senior citizen");
        }

        if (age < 75) {
            System.out.println("You are not senior citizen");
        }


        System.out.println("---------------------------");
        // Single if Statement - with logical operators which results in - true/false
        boolean isCitizen = false;
        boolean is18YearOld = age >= 18;

        // Person is only eligible if he/she is citizen and at least 18 years old.
        if  (is18YearOld && isCitizen) { // true && false -- > false
            System.out.println("You are eligible to vote");
            System.out.println("Please, go to the closest voting location to vote");
        }

        System.out.println("---------------------------");
        if (!isCitizen) { // false
            System.out.println("You do not need passport to enter your country");
        }

        System.out.println("---------------------------");
        if(!isCitizen){
            System.out.println("You are not a citizen");
        }

    }
}

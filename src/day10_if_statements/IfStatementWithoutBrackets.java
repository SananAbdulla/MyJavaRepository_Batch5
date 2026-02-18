package day10_if_statements;

public class IfStatementWithoutBrackets {
    public static void main(String[] args) {

        // If statement without brackets ONLY takes 1 single statement after itself.
        if (5 < 1)
            System.out.println("Hi-1"); // This println statement is part of the if statement
        System.out.println("Hi-2"); // This println statement is not part of the if statement

        System.out.println("Bye");

    }
}
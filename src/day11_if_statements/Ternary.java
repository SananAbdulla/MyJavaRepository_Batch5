package day11_if_statements;

public class Ternary {
    public static void main(String[] args) {
        int a = 70;
        String result;


        // Option 1 - with regular IF-ELSE statement
        if (a % 2 == 0) {
            //System.out.println("Even");
            result = "Even";
        } else {
            //System.out.println("Odd");
            result = "Odd";
        }
        System.out.println(result);


        System.out.println("------");
        // OPTION 2 - with TERNARY
        // SYNTAX:        (condition) ? trueValue : falseValue
        String result2 = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(result2);

        /*
            RULES
                - When you assign the result of the TERNARY to a variable, the DATATYPE of the values has to SAME and match to the variable DATA
                - When you use the result of the TERNARY in PRINT statement, the DATATYPE of the values DOES NOT have to be SAME
         */


        System.out.println("------------");
        System.out.println((1 > 2) ? "5 is bigger than 2" : 1100);
        //System.out.println((5 < 2) ? "5 is bigger than 2" : -100);

        if (5 > 2){
            System.out.println("5 is bigger than 2");
        } else {
            System.out.println(-100);
        }


        System.out.println((5 > 10 ) ? " 5 is not larger than 10" : " Yes it is ");
    }
}
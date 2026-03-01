package day11_if_statements;

public class NestedIfExample {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        // If conditions are also called CONTROL FLOW STATEMENTS

        if (a) {
            System.out.println(1);

            if (b) { // NESTED IF STATEMENT
                System.out.println(2);
            }

            System.out.println("ONE");

            if (c) {
                System.out.println("THREE");
            }
        } else {

            System.out.println(4);

            if (d) {
                System.out.println("Five");
            }

        }

        System.out.println("After 1st if");



    }
}


/*

        if it is Monday - I will go out in the morining and in the night
            if I go out in the night - I will put my blue jack
            If I go out in the morning - I will put my yellow jacket

        if is NOT Monday -  I stay at home.

        if (Monday) {
             if (It is Morning ) {
                sout("Blue Jacket")
             } else (It is night) {
                sout ("Yellow jacket")
             }
        } else {
            if (Tues){

            } else if (Wed) {

            }

            sout ("Stay at home");
        }

 */
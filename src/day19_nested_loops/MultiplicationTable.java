package day19_nested_loops;

/*

    print the multiplication by the numbers from 1 to 10
    we will see for all numbers 1 - 10

    1 x 1 = 1
    1 x 2 = 2
    ...
    2 x 1
    2 x 2
    ..
    3 x 1
    ..

    10 x 10

 */
public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) { // OUTER LOOP


            for (int j = 1; j <= 10 ; j++) { // INNER LOOP

                System.out.println(i + " x " + j + " = " + (i * j));

            }

            System.out.println();

        }


    }
}


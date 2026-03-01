package practice;

public class Month_practice {
    public static void main(String[] args) {


        for (int i = 1; i <= 4  ; i++) {

            System.out.println("Week: "+i);

            for (int j = 1; j <= 7; j++) {

                System.out.println("\n\tDay: " + j);


                for (int k = 1; k <= 10; k++) {

                    System.out.println("\n\t\tHours: " + k);

                }

            }
            System.out.println("************");

        }

    }
}

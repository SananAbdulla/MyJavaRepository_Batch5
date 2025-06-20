package practice;

public class SwitchInLoop_practice {
    public static void main(String[] args) {


        for (int i = 0; i < 3; i++) {
            System.out.println(i);

            if(i ==0) {
                System.out.println("I is: " + "zero");
            }
            if (i == 1) {

                System.out.println("I is: " + "one");
            }
            if (i == 2) {
                System.out.println("I is: " + "two");
            }
        }

        System.out.println("-----");

        for (int i = 0; i <= 3; i++) {

            switch (i) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;

            }
        }
    }
}

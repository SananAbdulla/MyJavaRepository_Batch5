package practice;

public class BranchingExample_pract {
    public static void main(String[] args) {


        for (int i = 0; i <=10 ; i++) {

            System.out.println(i + " ");

            if (i==5) {
                continue;
            }
            System.out.println(i);

        }


        System.out.println("==============");

        for (int i = 1; i <20 ; i++) {

            if (i % 2 ==1) {
                continue;

            }
            System.out.println(i);
        }
    }
}

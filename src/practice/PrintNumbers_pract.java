package practice;

public class PrintNumbers_pract {
    public static void main(String[] args) {

//
//        int num = 10;
//
//        while (num <= 40) {
//            System.out.println("Salam " + num);
//            num += 2;
//        }

        System.out.println("-------");
int nums = 5;
        while (nums <=40 ) {

            if (nums %2 ==0) {
                System.out.println(nums);
            }
            nums ++;
        }

        System.out.println("********");

        int i = 20;

        while (i <= 80 ) {
            System.out.println(i);
            i+=10;
        }
        System.out.println(i);


        System.out.println("&&&&&&&&&");

        int k = 10;

        while (k <=100) {

            if (k % 2 == 0) {
                System.out.println(k++);

            }

        }



    }
}

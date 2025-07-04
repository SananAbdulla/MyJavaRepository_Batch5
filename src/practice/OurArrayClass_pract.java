package practice;

public class OurArrayClass_pract {
    public static void main(String[] args) {


        int[] a = {44, 22, 55, 66, 77};
        int[] b = {40, 11, 66, 45, 770, 55};


        FirstElemArr(a);
        LastElemArr(b);
        MiddleElemArr(a);
        MiddleElemArr(b);



    }

    public static void FirstElemArr(int[] num) {

        System.out.println("Firs element of Arrays is: " + num[0]);
    }

    public static void LastElemArr(int[] num) {

        System.out.println("Last element of Arrays is: " + num[num.length - 1]);


    }

    public static void MiddleElemArr(int[] num) {

        if (num.length % 2 == 0) {
            System.out.println("Middle First: " + num [num.length/2-1]);
            System.out.println("Middle Second: " + num [num.length/2]);
        }

        else {
            System.out.println("Middle element of arr is: " + num[num.length/2]);
        }

    }

}
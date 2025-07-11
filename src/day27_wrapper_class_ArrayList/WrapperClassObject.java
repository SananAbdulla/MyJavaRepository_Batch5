package day27_wrapper_class_ArrayList;

public class WrapperClassObject {
    public static void main(String[] args) {


        int a = 5; // primitive data type

        // Integer a2 = new Integer (10); // not in use after java version 9

        Integer a3 = 20; // --- 20 ---> int ----> Integer ----> Autoboxing
        int a4 = a3; // this is Unboxing


        System.out.println(a);
        System.out.println(a3);
        System.out.println(a4);








    }
}

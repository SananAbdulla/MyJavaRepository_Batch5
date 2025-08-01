package day33_b_encapsulation.access_modifiers;

public class Test {

    public String a = "Hello";
    private int b = 123;
    protected int c = 12;


    public static String d = "hi";
    private static int k = 10;



    public static void main(String[] args) {

        Test obj = new Test();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);


        System.out.println(Test.k);


    }
}

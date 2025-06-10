package practice;

public class StringMemory {
    public static void main(String[] args) {


        String str = "Java";
        String st1 = "Java";

        String str2 = new String("Java");
        String str3 = new String("Java");


        System.out.println(str == st1);// ---> true

        System.out.println(str == str2);// ---> false

        System.out.println(str2 == str3); // ---> false

        System.out.println(str2.equals(str3)); //---> true

        System.out.println(str.equals(str3)); //---> true

        System.out.println(str.equals(st1)); //---> true

        // .equals is the good way to compare strings. Because it compares values not memory locations



        int num = 5;
        int nums = 6;

        System.out.println(num == num);


        String key = "Dog";
        String key1 = "Cat";

        System.out.println(key == key1);
        System.out.println(key.equals(key1));


        String opt = "true";
        switch (opt) {
            case "true":
                System.out.println("True");
                break;
            default:
                System.out.println("False");
        }


        System.out.println("Done");


        System.out.println("-------------");

        System.out.println("Java".equals(st1));
        System.out.println(new String ("Java").equals(str2));
        System.out.println("Java".equals(new String("Java")));
        System.out.println(str.equals(new String("Java")));


    }
}

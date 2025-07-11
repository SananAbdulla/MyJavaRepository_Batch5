package practice;

public class Test1 {
    public static void main(String[] args) {


        String str = "hello";

        str.toUpperCase();
        System.out.println(str);


        int num = 123;

        // using ValueOf method
        String str1 = String.valueOf(num);

        System.out.println(str1);

        String str2 = num + "";
        System.out.println(str2);


        String str3 = "Hello";
        String str4 = "hello";
        String str5 = "Hi";
        String str7 = "Hello";
        str3 = str3.toLowerCase();
        String str6 = new String ("hello");
        String str8 = new String ("hello");


        String result = str3.concat(str4);
        System.out.println(str3.concat(" " +str4 + " "+ str5));
        System.out.println(str3.toLowerCase() == str4);
        System.out.println(str3==str4);
        System.out.println(str3 == str6);
        System.out.println(str3 == str7);
        System.out.println(str6 ==str8);




    }
}
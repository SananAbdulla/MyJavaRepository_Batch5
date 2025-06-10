package practice;

public class StartAndEnd {
    public static void main (String []args) {

        String str = "Azerbaijan";

        System.out.println(str.length());
        System.out.println(str.startsWith("Az"));
        System.out.println(str.toUpperCase().startsWith(" AZER".trim()));
        System.out.println(str.toLowerCase().startsWith("AZERi".toLowerCase()));

        System.out.println("--------");
        System.out.println("AZER".startsWith("A"));




    }
}

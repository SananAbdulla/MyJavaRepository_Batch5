package practice;

public class CharMethod {
    public static void main (String []args) {
        
        
        String str = "Azerbaijejan";
        
        //char ch = str.charAt(0);

       // System.out.println("ch = " + ch);

        System.out.println(str.length());


        System.out.println(str.charAt(str.length()-2));

        System.out.println(str.indexOf('z'));
        System.out.println(str.length());
        System.out.println(str.lastIndexOf('j'));
        System.out.println(str.indexOf("rb"));

        System.out.println("-----");
        System.out.println(str.indexOf('e', 3));

        System.out.println("----");
        System.out.println(str.substring(0,1));

    }
}

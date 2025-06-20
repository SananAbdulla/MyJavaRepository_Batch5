package practice;

public class Reverse_String1 {
    public static void main(String[] args) {

        String str = "Azerbaijan";

        String reverse = "";

        for (int i = str.length()-1; i>=0 ; i--) {

            //reverse +=str.charAt(i);
            reverse = reverse + ("" + str.charAt(i)).toLowerCase();

        }
        System.out.println(reverse);

    }
}

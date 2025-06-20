package practice;

public class Reverse_String {
    public static void main(String[] args) {

        String word = "Azerbaijan";

        for (int i = word.length()-1; i >=0 ; i--) {

            System.out.print(" "+ word.charAt(i));

        }
        System.out.println();

        String key = "Baku";

        for (int i = key.length()-1; i >=0 ; i--) {
            System.out.print(" "+key.charAt(i));

        }
    }
}

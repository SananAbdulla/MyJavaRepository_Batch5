package practice;

public class Palindrome_practice {
    public static void main(String[] args) {


        String word= "racecar";
        String reversed = "";

        for (int i = word.length()-1; i>=0 ; i--) {
            //System.out.println(word.charAt(i));

            reversed += word.charAt(i);
        }

        if (reversed.equalsIgnoreCase(word)) {
            System.out.println("It is Palindrome");
        }
        else {
            System.out.println("It is not Palindrome");
        }

        // 2nd Option to Do it with Ternary

        System.out.println("---------");

        System.out.println(word.equalsIgnoreCase(reversed) ? "It is Palindrome" : "It is not Palindrome");

        System.out.println("--------");

        boolean itIsPalindrome = reversed.equalsIgnoreCase(word);

        System.out.println(itIsPalindrome);


    }
}

package practice;

public class Anagram_practice {
    public static void main(String[] args) {


        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println("It is not Anagram");
        }
        else {
            for (int i = 0; i < str1.length() ; i++) {

                char each = str1.charAt(i);

                str2 = str2.replaceFirst(each +"", "");

            }

            if (str2.isEmpty()) {
                System.out.println("It is Anagram");
            }
            else {
                System.out.println("it is not anagram");
            }

        }
    }
}

package day20_nested_loops;

public class AnagramPractice {
    public static void main(String[] args) {



        String str1 = "listen";
        String str2 = "silent";



        if (str1.length() !=str2.length()) {
            System.out.println("Not Anagram");
        }


        else {

            for ( int i = 0; i < str1.length(); i++) {
                char eachChar = str1.charAt(i);

                str2 = str2.replace(eachChar + "", "");

            }
                 if (str2.isEmpty()) {

                     System.out.println("it is anagram");
                 }

                 else {
                     System.out.println("it is not anagram");
                 }






            }
        }




}

package practice;

public class RemoveDuplicates_pract {
    public static void main(String[] args) {

        /*
            remove duplicate chars


         */

        String word = "aaaerdtiohnmkommmbc zxcvbnm,,,,lkjhgfd";
        String unique ="";

        for (int i = 0; i < word.length(); i++) {

            char eachChar = word.charAt(i);

            if (!unique.contains(""+eachChar)) {
                unique +=eachChar;
            }

        }

        System.out.println("Original word: " + word);
        System.out.println("Removed Duplicates: " + unique);
    }
}

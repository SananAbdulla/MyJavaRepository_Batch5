package practice;

public class CharactersInString_pract {
    public static void main(String[] args) {




        String word = "java";

        int asciiNumber = 0;

        for (int i = 0; i < word.length(); i++) {

            asciiNumber = word.charAt(i);

            System.out.println(asciiNumber);

        }

    }
}

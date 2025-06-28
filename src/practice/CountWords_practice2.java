package practice;

public class CountWords_practice2 {
    public static void main(String[] args) {


        String sentence = "My country is Azerbaijan and i proud of that";
        int countOfWords = 0;

        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) == ' ') {
                countOfWords++;
            }

        }
        System.out.println("We have " + (countOfWords +1) + " words in a sentence");
    }
}

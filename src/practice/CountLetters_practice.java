package practice;

public class CountLetters_practice {
    public static void main(String[] args) {


        String word = "Azerbaijan";
        char letter = 'z';
        int count =0;

        for (int i = 0; i < word.length() ; i++) {

            if (word.charAt(i)==letter) {
                count++;
            }

        }

        System.out.println(count);


    }
}

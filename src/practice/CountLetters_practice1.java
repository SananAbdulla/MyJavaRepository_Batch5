package practice;

public class CountLetters_practice1 {
    public static void main(String[] args) {


        String word = "hinskshikksdshihjkhi";
        String wordHI = "hi";
        int count=0;

        for (int i = 0; i < word.length()-1 ; i++) {

            if (word.charAt(i) == 'h' && word.charAt(i+1) == 'i') {
                count++;
            }

        }
        System.out.println(count);

    }
}

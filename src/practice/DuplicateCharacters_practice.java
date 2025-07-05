package practice;

public class DuplicateCharacters_practice {
    public static void main(String[] args) {


        String word = "Azerbaijan";
        String unique = "";
        String duplicate = "";


        for (int i = 0; i < word.length(); i++) {

            int count = 0;

            char outterLetter = word.charAt(i);

            if (unique.contains(""+outterLetter)) {
                continue;
            }


            for (int j = 0; j < word.length() ; j++) {

                char innerLetter = word.charAt(j);

                if (outterLetter == innerLetter) {
                    count++;
                }

            }
            if (count > 1) {
                duplicate += outterLetter;
            }
            unique+=outterLetter;

        }
        System.out.println(duplicate);
    }
}

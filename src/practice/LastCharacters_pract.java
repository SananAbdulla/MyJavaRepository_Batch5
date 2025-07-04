package practice;
/*
    Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines

    Ex:

        {"James", "is", "back"}
        {"he", "was", "never", "gone"}
        {"methods", "tomorrow"}

    Output:
        ssk
        esre
        sw

 */
public class LastCharacters_pract {

    public static void main(String[] args) {

        String[][] words = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"},
        };


        for (String []  each: words) {

            String lastCharacters = "";

            for (String eachWords : each ) {

                lastCharacters += eachWords.charAt(eachWords.length()-1);
            }

            System.out.println(lastCharacters);
        }


    }

}

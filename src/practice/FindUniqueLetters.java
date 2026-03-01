package practice;

public class FindUniqueLetters {
    public static void main(String[] args) {


        System.out.println(duplicateChars("Alibabaa"));

        String word = "Alibababa";

        String unique = "";

        String duplicate ="";

//        for (int i = 0; i < word.length(); i++) {
//
//            int count = 0;
//
//            char outter = word.charAt(i);
//
//            if (duplicate.contains("" + outter)) {
//                continue;
//            }
//
//
//            for (int j = 0; j < word.length(); j++) {
//
//                char inner = word.charAt(j);
//
//
//                if (outter == inner) {
//                    count ++;
//                }
//
//
//            }
//            if ( count == 1) {
//
//                unique+=outter;
//
//            }
//            if (count > 1) {
//                duplicate+=outter;
//            }
//
//        }
//
//        System.out.println(unique);
//        System.out.println(duplicate);



    }

    public static String duplicateChars (String word) {

        String duplicate = "";
        String unique = "";

        for (int i = 0; i < word.length(); i++) {

            int count = 0;

            char outter = word.charAt(i);

            if (duplicate.contains("" + outter)) {
                continue;
            }


            for (int j = 0; j < word.length(); j++) {

                char inner = word.charAt(j);


                if (outter == inner) {
                    count++;
                }


            }
            if (count == 1) {

                unique += outter;

            }
            if (count > 1) {
                duplicate += outter;
            }

        }

        return "Dublicates are "+ duplicate + ", and Unique chars are " + unique;
    }
}

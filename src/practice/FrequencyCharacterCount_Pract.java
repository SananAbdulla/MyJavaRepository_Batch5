package practice;

public class FrequencyCharacterCount_Pract {

    public static void main(String[] args) {


        String str = "Azzerbbbaijaan";

                    // Azerbaijan

        String unique = "";


        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            char outterLetter = str.charAt(i);


            if (unique.contains("" + outterLetter)) {
                continue;
            }


            for (int j = 0; j < str.length(); j++) {

                char innerLetter = str.charAt(j);

                if (outterLetter == innerLetter) {
                    count++;
                }


            }
            System.out.println(outterLetter + " - " + count);
            unique += outterLetter;


        }
    }

}
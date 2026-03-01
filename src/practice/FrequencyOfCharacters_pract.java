package practice;

public class FrequencyOfCharacters_pract {
    public static void main(String[] args) {




        String name = "Karabakh";
        String unique = "";


        for (int i = 0; i < name.length(); i++) {

            char outterLetter = name.charAt(i);
            int count = 0;

            if (unique.contains(""+outterLetter)) {
                continue;
            }


            for (int j = 0; j < name.length() ; j++) {

                char innerLetter = name.charAt(j);

                if (outterLetter == innerLetter) {
                    count++;
                }


            }
            System.out.println(outterLetter + " - " + count);
            unique+=outterLetter;
        }
        System.out.println(unique);
    }
}

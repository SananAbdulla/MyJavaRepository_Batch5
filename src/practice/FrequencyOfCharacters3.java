package practice;

public class FrequencyOfCharacters3 {
    public static void main(String[] args) {


        String str= "Azerrbaiijaaan";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char outterLoop = str.charAt(i);

            if ( (unique).contains(outterLoop+"")) {
                continue;

            }

            for (int j = 0; j < str.length() ; j++) {
                char innerLoop = str.charAt(j);

                if (innerLoop == outterLoop) {
                    count++;
                }

            }

            System.out.println(outterLoop + " " + count);
            unique+=outterLoop;

        }
    }
}

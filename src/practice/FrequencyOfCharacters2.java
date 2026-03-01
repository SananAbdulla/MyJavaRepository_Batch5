package practice;

public class FrequencyOfCharacters2 {
    public static void main(String[] args) {

        String str= "Azerrbaiijaaan";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char outter = str.charAt(i);

            if (unique.contains(""+outter)){
                continue;

            }

            for (int j = 0; j <str.length() ; j++) {
                char inner = str.charAt(j);

                if (outter == inner) {
                    count++;

                }

            }

            System.out.println(outter + " " + count);
            unique+=outter;

        }


    }
}

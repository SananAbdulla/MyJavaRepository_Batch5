package practice;

public class DuplicateCharacters_pract {


    public static void main(String[] args) {

       String str = "applle";
        String unique = "";


        for (int i = 0; i < str.length() ; i++) {
            int count = 0;
            char each1 = str.charAt(i);

            if (unique.contains(each1 + "")) {
                continue;
            }


            for (int j = 0; j <str.length() ; j++) {
                char each2 = str.charAt(j);

                if (each1== each2) {
                    count++;
                }



            }

            System.out.println(each1 + " - " + count);
            unique+=each1;




        }


    }
}

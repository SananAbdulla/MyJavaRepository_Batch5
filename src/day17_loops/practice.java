package day17_loops;

public class practice {

    public static void main(String[] args) {


        for (int i = 0; i <= 10 ; i++) {

            System.out.println("hello");

        }

        System.out.println();
        int i = 0;
        do {
            System.out.println("Hello");
            i++;

        }
        while (i<= 10);

        System.out.println();

        int k = 0;
        while (k < 10) {
            System.out.println("hello");
            k++;
        }


        String str = "Azerbaijan";

        for (int j = 0; j <str.length() ; j++) {

            System.out.println(str.charAt(j));

        }

        System.out.println();

        String str2 = "Azerbaijan";

        for (int j = str2.length()-1; j>=0 ; j--) {

            System.out.print(str2.charAt(j));

        }

        System.out.println();

        for (int j = 0; j <= 10 ; j++) {

            System.out.println("number: " + j);

            if (j ==6 ){
                break;
            }

        }



        String str3 = "AzzerBaijanAa44";

        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;


        for (int j = 0; j < str3.length(); j++) {

            char each = str3.charAt(j);

            if (each >= 'A' && each <= 'Z') {
                upperCase++;
            }
            if (each >= 'a' && each <= 'z') {
                lowerCase++;
            }
            if (each >= '0' && each <= '9') {
                digit++;
            }

        }


        System.out.println(lowerCase);
        System.out.println(digit);
        System.out.println(upperCase);


        String str4 = "Caucasus has a rich cultural heritage";


        int countSpace = 0;


        for (int j = 0; j < str4.length(); j++) {

            if (str4.charAt(j) == ' ') {
                countSpace++;
            }

        }

        System.out.println("We have " + ( countSpace +1 ) + " words in the string");


        String str5 = "ANNAa";

        String reversed = "";


        for (int j = str5.length()-1; j >= 0 ; j--) {

            reversed += str5.charAt(j);

        }

            if (str5.equalsIgnoreCase(reversed)) {
                System.out.println("The word is palindrome");
            }
            else {
                System.out.println("The word is not palindrome");
            }



        // remove duplicates
        String str6 = "sdAAaBBbjkfhdskjhfskdjfhz";
        String unique = "";


        for (int j = 0; j < str6.length(); j++) {

            char each = str6.charAt(j);

            if (!unique.contains(each + "")) {
                unique += each;
            }


        }

        System.out.println(unique);
        }






}

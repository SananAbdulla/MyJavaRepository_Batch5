package practice;

import my_utilities.StringUtil;

public class uniqueChars_pract {

    public static void main(String[] args) {


        System.out.println(StringUtil.frequencyOfChars("Azerbaijna", 'z'));

        System.out.println(uniqueCHARACTERS("Alibaba", 'a'));

        System.out.println(uniqueCHARACTERS2("Alibaba"));

    }



    public static String uniqueCHARACTERS(String str, char chars) {

        String unique = "";

        for (int i = 0; i < str.length(); i++) {


            char eachLetter = str.charAt(i);

            if (StringUtil.frequencyOfLetters(str, eachLetter) == 1) {
                unique+= eachLetter;
            }

        }


        return unique;
    }


   public static String uniqueCHARACTERS2 (String str) {
        String unique =  "";

       for (int i = 0; i < str.length() ; i++) {
           int count = 0;

           char outter = str.charAt(i);

           if (unique.contains("" + outter)) {
               continue;
           }


           for (int j = 0; j < str.length(); j++) {

               char inner = str.charAt(j);

              if (outter == inner) {
                  count++;
              }
               if (count == 1) {
                   unique += outter;
               }
           }


       }


        return unique;
   }

}

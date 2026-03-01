package day25_methods;

import my_utilities.StringUtil;

public class Test {
    public static void main(String[] args) {

//        System.out.println(StringUtil.reverse("Baku"));
//        System.out.println(StringUtil.reverse("Azerbaijan"));


        System.out.println(duplicate("Alibaba"));

    }


    public static String duplicate(String str) {

        String unique = "";
        String duplicate = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            char outterChar = str.charAt(i);

            if (unique.contains("" + outterChar)) {
                continue;
            }


            for (int j = 0; j < str.length(); j++) {

                char innerChar = str.charAt(j);

                if (outterChar == innerChar) {
                    count++;
                }

            }
//            if (!unique.contains("" + outterChar)) {
//
//                unique+=outterChar;
//            }

            if (count == 1) {
                unique += outterChar;
            }

        }

        return unique;
    }
}

package day27_wrapper_class_ArrayList;

public class CountCharacters {
    public static void main(String[] args) {

        String str = "aP24sdf57&seVSL24@#*";

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numCount = 0;
        int otherCharCount = 0;

        for (char each :str.toCharArray()) {

//          // 1 OPTION
//     if (each >= 'A' && each <= 'Z') {
//
//         upperCaseCount ++;
//     }


            if (Character.isUpperCase(each)) {
                upperCaseCount++;
            }
            else if (Character.isLowerCase(each)) {

                lowerCaseCount++;
            }
            else if (Character.isDigit(each)) {
                numCount++;
            }
            else  {
                otherCharCount++;
            }


        }

        System.out.println(upperCaseCount);
        System.out.println(lowerCaseCount);
        System.out.println(numCount);
        System.out.println(otherCharCount);



    }
}
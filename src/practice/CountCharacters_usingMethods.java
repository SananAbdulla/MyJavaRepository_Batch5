package practice;

public class CountCharacters_usingMethods {

    public static void main(String[] args) {


        // TODO remember. IT is an easy way to find UpperCase, LowerCase and etc
        String str = "AzaaRRRbhakh53pi2%^&()(*&^@@##89FSSFM:K";

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (each >='A' && each <= 'Z'){
                upperCaseCount++;
            }
            else if (Character.isLowerCase(each)) {
                lowerCaseCount++;
            }
            else if (Character.isDigit(each)) {
                digitCount++;
            }

        }
        System.out.println(upperCaseCount);
        System.out.println(lowerCaseCount);
        System.out.println(digitCount);

        System.out.println("------------------");
        String str1 = "AzerBaijanNNAM";

        System.out.println(findUpperCase(str1));

    }

    public static int findUpperCase (String str) {

        int upperCaseCount = 0;

        for (int i = 0; i < str.length(); i++) {

            char eachLetter = str.charAt(i);

            if ( eachLetter >= 'A' && eachLetter <= 'Z' ) {
                upperCaseCount++;
            }

        }


        return upperCaseCount;
    }


}

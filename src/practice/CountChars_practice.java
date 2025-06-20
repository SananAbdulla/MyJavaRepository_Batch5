package practice;

public class CountChars_practice {

    public static void main(String[] args) {


        String word = "Afsfsf,bdAWNB455NHKghj$%^UI*&";
        int UpperCasecount = 0;
        int lowerCaseCount=0;
        int numCount = 0;
        int otherChars = 0;


        for (int i = 0; i < word.length() ; i++) {
            char eachChar = word.charAt(i);

            if (eachChar >= 'A' && eachChar <= 'Z') {
                UpperCasecount++;
            } else if (eachChar >= 'a' && eachChar <= 'z') {
                lowerCaseCount++;
            }
            else if (eachChar >= '0' && eachChar <='9') {
                numCount++;
            }
            else {
                otherChars++;
            }


        }
        System.out.println("Upper case count: " + UpperCasecount);
        System.out.println("Lower case count: " + lowerCaseCount);
        System.out.println("Numbers  count: " + numCount);
        System.out.println("Other  chars: " + otherChars);

    }
}

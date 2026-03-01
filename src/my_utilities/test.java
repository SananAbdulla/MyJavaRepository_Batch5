package my_utilities;

public class test {
    public static void main(String[] args) {


        System.out.println(frequencyOfChars("Alibaba", 'i'));

    }

    public static int frequencyOfChars (String str, char letter) {

        int count = 0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == letter) {
                count++;
            }

        }


        return count;
    }
}

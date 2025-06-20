package practice;

public class CountJava_practice {
    public static void main(String[] args) {

        String str = "javas is a good coding language and javas requires good logics javas";
        int countJava = 0;

        for (int i = 0; i < str.length()-4; i++) {
            String forEach4Chars= str.substring(i , i+5);

            if (forEach4Chars.contains("javas")) {
                countJava++;
            }


        }
        System.out.println("Count of Java in the sentence is: "+ countJava);


    }
}

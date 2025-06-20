package practice;

public class substring {
    public static void main(String[] args) {

        String word = "Azerbaijan";
       String midle = word.substring(word.length()/2-1, word.length()/2+1);
        System.out.println(midle);
    }
}

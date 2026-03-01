package practice;

public class UniqueCharacters1 {
    public static void main(String[] args) {

        String str = "AFGHJKJHGFFGVJK<BNnn";
        String unique = "";

        for (int i = 0; i < str.length() ; i++) {
            char each = str.charAt(i);

            if (!unique.contains(""+each)) {
                unique+=each;

            }

        }

        System.out.println(unique);
    }
}

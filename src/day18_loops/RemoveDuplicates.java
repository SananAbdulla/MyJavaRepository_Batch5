package day18_loops;

/*
    Remove Duplicates
        Write a program that can remove duplicates from a String / keep one character from each.
         Ex:
                Input: abcabbcd
                Output: abcd
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "sdAAaBBbjkfhdskjhfskdjfh";
        String unique = "";

        for (int i = 0; i < str.length() ; i++) {

            char each = str.charAt(i);

            if (!unique.contains(""+each)) {

                unique+= each;
            }

        }

        System.out.println("Original str: " + str);
        System.out.println("Removed duplicates: " + unique);

    }
}
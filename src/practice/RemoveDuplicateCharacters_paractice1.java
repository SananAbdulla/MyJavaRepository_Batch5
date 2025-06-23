package practice;

public class RemoveDuplicateCharacters_paractice1 {
    public static void main(String[] args) {


        String str = "applleemm";
        String unique = "";


        for (int i = 0; i < str.length() ; i++) {
            char each1 = str.charAt(i);

            if (!unique.contains(each1+ "")) {
                unique += each1;

            }


        }


        System.out.println(unique);




    }

}

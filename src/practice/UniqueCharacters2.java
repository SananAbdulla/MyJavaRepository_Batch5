package practice;

public class UniqueCharacters2 {

    public static void main(String[] args) {

        String str = "ADFGHJKJHGhhjjjjBNB%^";
        String unique = "";

        for (int i = 0; i <str.length() ; i++) {
            int count = 0;
            char outter = str.charAt(i);

            for (int j = 0; j < str.length() ; j++) {
                char inner = str.charAt(j);

                if (outter == inner) {
                    count++;
                }

            }

            if (count == 1) {
                unique+=outter;
            }


        }
        System.out.println(unique);
    }
}

// TODO this is an interview question
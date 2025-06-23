package practice;

public class FrequencyOfCharacters_practice {

    public static void main(String[] args) {

// TODO: Remembers

    /*

    String: apple

    count how many times each letter is in the String

    a - 1
    p - 2
    l - 1
    e - 1

 */
        String str = "alabalaska";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char outerLetter = str.charAt(i);
            int count = 0;

            if (unique.contains("" + outerLetter)) {
                continue;
            }

            for (int j = 0; j < str.length(); j++) {
                char innerLetter = str.charAt(j);

                if (innerLetter == outerLetter) {
                    count++;
                }


            }

            System.out.println(outerLetter + "-" + count);
            unique+=outerLetter;

        }
            System.out.println(unique);


        }
    }

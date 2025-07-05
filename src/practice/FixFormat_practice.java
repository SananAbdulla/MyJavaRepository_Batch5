package practice;

public class FixFormat_practice {

    public static void main(String[] args) {

        //System.out.println(fixFormat("reyHAN"));
        System.out.println(fixFormat("ReYHAAN ÇAY GəTİR"));


    }

    public static String fixFormat (String input) {

        //  String result = "";     // r e Y H a n
//                                // 0 1 2 3 4 5
//
        //  result =  input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
//        result = input.substring(0, 1).toUpperCase() + input.substring(1, input.indexOf(" ")).toLowerCase() + " " +  input.substring(input.indexOf(" ") + 1, input.indexOf(" ") + 2).toUpperCase() +  input.substring(input.indexOf(" ") + 2).toLowerCase();


        String[] wprdsSplit = input.split(" ");

        if (wprdsSplit.length != 3) {
            return "not valid entry";
        } else {
            String firstWord = input.substring(0, 1).toUpperCase() + input.substring(1, input.indexOf(" ")).toLowerCase();
            String secondWord = input.substring(input.indexOf(" ") + 1, input.indexOf(" ") + 2).toUpperCase() + input.substring(input.indexOf(" ") + 2).toLowerCase();


            return firstWord + " " + secondWord;

        }

    }
}

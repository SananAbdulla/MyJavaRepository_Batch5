package practice;

public class LongShortString_practice {
    public static void main(String[] args) {


        String[] arr = {"java", "seleniummmmm", "softskill", "mentors", "loop", "and"};

        String longest = arr[0];
        String shortest = arr[0];


        for (String each : arr) {

            if (each.length() >= longest.length()) {

                longest = each;
            }
            if (each.length() <= shortest.length()) {

                shortest = each;
            }
        }

        System.out.println(longest);
        System.out.println(shortest);


        System.out.println("------------");


        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() >= longest.length()) {
                longest = arr[i];
            }
            if (arr[i].length() <= shortest.length()) {
                shortest = arr[i];
            }

        }

        System.out.println(longest);
        System.out.println(shortest);

    }

}
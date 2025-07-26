import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {


int [] arr = {1, 9, 2, 3, 10};

for (int eachNum: arr) {

    eachNum+=5;

    System.out.println(eachNum);
}


        //Collections.sort(arr);
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));


        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.addAll(Arrays.asList(3,1,5,8,10));

        Collections.reverse(arrList);
        System.out.println(arrList);


        System.out.println("---------");
        String str = "Alabala";

        ArrayList<String> arrStr = new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println(arrStr);
      int frequency =   Collections.frequency(arrStr, "a");
        System.out.println("frequency a = " + frequency);


        System.out.println(getWekkOfDays());
        ArrayList<String> daysOfWeek = getWekkOfDays();
        System.out.println(daysOfWeek.get(1));

        printElements(getWekkOfDays());

    }

    public static ArrayList<String> getWekkOfDays() {

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList("Monday",
                "Tuesday",
                "Wendesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"));

        return arrList;
    }

    public static void printElements(ArrayList<String> list) {

        for (String each : list) {

            System.out.println("\t"+each);
        }

    }
}

package practice;

import java.util.ArrayList;

public class ClassroomTwo_day28 {
    public static void main(String[] args) {

        ArrayList<String> groupOne = new ArrayList<>(); // capacity -> 10, size -> 0
        groupOne.add("Zakhar");
        groupOne.add("Yuliia");
        groupOne.add("Artem");
        groupOne.add("Roma");
        groupOne.add("Lenka");
        groupOne.add("Adi");
        groupOne.add("Nilufar");
        System.out.println(groupOne);

        ArrayList <String> groupTwo = new ArrayList<>();
        groupTwo.add("Pavlo");
        groupTwo.add("Steven");
        groupTwo.add("Ketevan");
        groupTwo.add("Ayaz");
        groupTwo.add("Kanan");
        groupTwo.add("Sammy");
        System.out.println(groupTwo);


        for (int i = 0; i < groupOne.size() ; i++) {
          int index = i;
            System.out.println("Group one students by index: " + index +" - "+  groupOne.get(i));

        }
    }
}

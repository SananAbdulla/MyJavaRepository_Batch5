package practice;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInfo_practice {
    public static void main(String[] args) {



//        String [] student = new String [3];
//       Scanner key = new Scanner(System.in);
//        System.out.println("Please enter student ID");
//        student [0] = key.nextLine();
//        System.out.println("Please enter Student first name");
//        student[1] = key.nextLine();
//        System.out.println("Please enter studend last name");
//        student[2] = key.nextLine();
//
//
//
//
//        String arraysToString = Arrays.toString(student);
//        arraysToString = arraysToString.substring(1, arraysToString.length()-1);
//        System.out.println(Arrays.toString(student));
//        System.out.println(arraysToString);
//

        Scanner key = new Scanner(System.in);
        String [] questions = {"Please enter Student ID", "Please enter Student First Name", "Please enter Student last Name", "Please enter batch number"};
        String [] Student = new String [4];


        for (int i = 0; i < questions.length ; i++) {
            System.out.println(questions[i]);
            Student [i] = key.nextLine();



        }
        System.out.println(Arrays.toString(Student));

    }
}

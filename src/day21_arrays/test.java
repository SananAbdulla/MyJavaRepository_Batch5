package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        String [] questions = {"Please, enter ID: ", "Please, enter first name: ", "Please, enter last name: ", "Please, enter batch number: "};

        String [] student = new String [questions.length];


        for (int i = 0; i < questions.length ; i++) {
            System.out.println(questions[i]);
            student [i] = key.nextLine();

        }

        System.out.println(Arrays.toString(student));

    }
}

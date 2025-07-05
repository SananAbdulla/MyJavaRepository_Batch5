package practice;

import java.util.Scanner;

public class NumberWords_practice_customMethods {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter num");
        int userEneteredNum = key.nextInt();

        numsAsWords1(4);
        System.out.println("------");
        numsAsWords2(5);
        numsAsWords2(userEneteredNum);
        String str = numsAsWords3(2);

        System.out.println(numsAsWords3(3));
        System.out.println(str);


    }

    public static void numsAsWords1(int input) {

        String [] numsAsWord =  {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};



            if (input < 1 || input > 10) {
                System.out.println("Not valid entry");

            } else  {
                System.out.println(numsAsWord [input-1]);
            }


        }


        public static void numsAsWords2 (int input) {

        String result = "";

            String [] numsAsWord2 =  {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};


            if (input < 1 || input > 10) {
            result =  "Not valid entry";
        }
        else  {
                 result =  numsAsWord2[input-1];
        }

            System.out.println(result);

        }

        public static String numsAsWords3 (int input) {

            String result = "";

            String [] numsAsWord2 =  {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};


            if (input < 1 || input > 10) {
                result =  "Not valid entry";
            }
            else  {
                result =  numsAsWord2[input-1];
            }

        return  result;
        }



    }






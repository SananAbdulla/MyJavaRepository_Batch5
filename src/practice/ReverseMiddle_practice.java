package practice;

import java.util.Arrays;

public class ReverseMiddle_practice {
    public static void main(String[] args) {


        String sentence = "java always fun";

        String [] arr = sentence.split(" ");
        String middle = arr[1];
        char [] charArr = middle.toCharArray();
        String reversed = "";


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(charArr));


        for (int i = charArr.length-1;  i >=0 ; i--) {
            reversed += charArr[i];

        }
        System.out.println(reversed);
        System.out.println(arr[0] + " " + reversed + " " + arr[2] );





    }
}

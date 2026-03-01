package practice;

public class ReverseMiddle_day23_pract {
    public static void main(String[] args) {



        String str = "Java always fun";

        String [] arrString = str.split(" ");
        String middle = arrString[1];
        String reversed = "";


        char [] arrChar = middle.toCharArray();

        for (int i = arrChar.length-1; i>=0 ; i--) {

            reversed += arrChar[i];
        }

        System.out.println((arrString[0] + " " + reversed + " " + arrString[2]));
    }
}

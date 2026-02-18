package day31_custom_classes;

public class Pract {

    public static void main(String[] args) {



        String str = "Azerbaijan";

        String reversed ="";

        for (int i = str.length()-1; i>=0 ; i--) {

            reversed += str.charAt(i);


        }

        System.out.println(reversed);

        System.out.println();

        String str2 = "Sanan";
        String reversed2 = new StringBuffer(str2).reverse().toString();


        System.out.println(reversed2);
        System.out.println(new StringBuffer(str2).reverse());


    }







}

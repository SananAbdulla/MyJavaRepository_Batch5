package practice;

public class test_wrapperClass {
    public static void main(String[] args) {



        String str = "Baku";
        String str1 = "10";

        // when we convert non-primitve data type to primitive we use parse
        int str2 = Integer.parseInt(str1);
        System.out.println(str2);


        // when we convert primitve data type to non-primitive wrapper class  we use valueof
        int num = 15;
        String num1 = String.valueOf(num);
        System.out.println(num1);



    }
}

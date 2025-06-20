package practice;

public class CountJava2_practice {
    public static void main(String[] args) {

        String str = "java is a good coding language and java requires good logics java";
        String orgStr = str;
        int countOfJava = 0;


        while (str.contains("java")) {
            str = str.replaceFirst("java", "*");
            countOfJava++;

        }


        System.out.println(countOfJava);
        System.out.println(str);
        System.out.println(orgStr);

    }
}

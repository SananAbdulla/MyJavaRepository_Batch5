package day39_b_exception;

public class Test {
    public static void main(String[] args) {





      try {
          String s = null;
          System.out.println(s.length());
      }
      catch (NullPointerException e) {

          System.out.println(e.getMessage());
      }
       try {
          int [] num = {1, 2, 3, 4, 5};
          System.out.println(num[5]);

      }


       catch (ArrayIndexOutOfBoundsException a) {
          System.out.println(a.getMessage());
      }

    }
}

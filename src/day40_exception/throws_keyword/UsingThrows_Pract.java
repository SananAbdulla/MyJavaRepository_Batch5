package day40_exception.throws_keyword;

public class UsingThrows_Pract {

    public static void main(String[] args) throws InterruptedException {


        waitSeconds(1000);

        waitLeaveThrows(2000);



    }

    public static void waitSeconds(int millSeconds) {

        try {
            Thread.sleep(millSeconds);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }


    }

    public static void waitLeaveThrows (int millSeconds) throws InterruptedException {

        Thread.sleep(millSeconds);
    }
}

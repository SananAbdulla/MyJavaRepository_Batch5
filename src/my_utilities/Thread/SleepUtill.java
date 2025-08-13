package my_utilities.Thread;

public class SleepUtill {

    /**
     *
     * this methdods is customs replacement of Thread.Sleep()
     * @param millSeconds
     * returns wait in seconds
     *
     */


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

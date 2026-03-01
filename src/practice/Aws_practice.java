package practice;

import java.util.Arrays;

public class Aws_practice {
    public static void main(String[] args) {

        String applicationName = "loopcamp";
        String zone = " us-east1, us-west1, us-north1, us-south1";

        String [] zoneArr = zone.split(",");

        System.out.println(Arrays.toString(zoneArr));


        for (String eachZone : zoneArr) {
            System.out.println(applicationName + " is Deploying to " + eachZone);


            System.out.println("---------------");


            for (int i = 0; i < zoneArr.length; i++) {

                System.out.println(applicationName + " is Deploying to " + zoneArr[i]);


            }
        }
    }
}

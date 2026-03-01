package day33_b_encapsulation.traffic;

public class UseTrafficLightTest {

    public static void main(String[] args) {



        TrafficLightTest test1 = new TrafficLightTest("green");


        System.out.println(test1.color);

        test1.setColor("black");

        System.out.println(test1.getColor());

        System.out.println();

        TrafficLightTest test2 = new TrafficLightTest("White");

        System.out.println(test2.getColor());


    }
}

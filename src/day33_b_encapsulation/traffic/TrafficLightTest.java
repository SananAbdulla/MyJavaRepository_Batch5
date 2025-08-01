package day33_b_encapsulation.traffic;

public class TrafficLightTest {


    String color;


    public TrafficLightTest(String color) {
       // this.color = color;
        setColor(color);
    }

    public String getColor() {

        return color;
    }


    public void  setColor (String color) {

        if (color.equalsIgnoreCase("Yellow") ||
        color.equalsIgnoreCase("red") ||
        color.equalsIgnoreCase("green")) {

            this.color = color;
        }
        else {
            System.out.println("Trafficlight does not have that color");
        }

    }
}

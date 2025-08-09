package day36_inheritance.taxi;

public class CarRide {
    public static void main(String[] args) {


        Lyft l1 = new Lyft("Sanan");
        System.out.println(l1.calculateRate(10));

        LyftXL l2 = new LyftXL("Bahruz");
        System.out.println(l2.calculateRate(10));

    }
}

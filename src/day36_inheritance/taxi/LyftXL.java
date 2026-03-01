package day36_inheritance.taxi;

public class LyftXL extends Lyft {


    public LyftXL(String driverName){
        super(driverName);

    }

    public double calculateRate(int miles) {

       return super.calculateRate(miles) * 1.2;
    }

}
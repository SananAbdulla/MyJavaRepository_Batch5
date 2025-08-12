package day38_a_abstraction_interface.animal;

public class Reptile extends Animal {

    //String name;
    int numOfLegs;

    @Override
    public void eat() {
        System.out.println("Reptile eating....");
    }
}


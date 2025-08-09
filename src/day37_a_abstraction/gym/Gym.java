package day37_a_abstraction.gym;

public class Gym {
    public static void main(String[] args) {

        //CanNOT create object of abstract class
        //Exercise obj = new Exercise("Test");


Running run = new Running("Fitnes");
        System.out.println(run.name);
        System.out.println(run.calculateCaloriesBurned(100));
        run.burnCalorie(50);

    }
}


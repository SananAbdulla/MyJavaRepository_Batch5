package day37_a_abstraction.gym;

public class Running extends Exercise {


    public Running(String name) {
        super(name);
    }

    @Override
    public void doExercise() {
        System.out.println("Running " + name);
    }

    @Override
    public void burnCalorie(int minutes) {
        System.out.println("Burning calories in " + minutes + " minutes while running");
    }

    @Override
    public int calculateCaloriesBurned(int minute) {
        return minute *5;
    }
}


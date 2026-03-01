package day31_custom_classes;

public class test {


    String name;
    String model;


    public test (String name, String model) {
        this.name = name;
        this.model = model;

    }

    @Override
    public String toString() {
        return "Car info: " +
                "\nname: " + name +
                "\nmodel: " + model;
    }
}

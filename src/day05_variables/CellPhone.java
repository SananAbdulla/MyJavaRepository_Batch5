package day05_variables;

/*
    create a class CellPhone
    create a main method
    declare and assign these variables:
        brand, model, color, price, storage, hasCamera, sim(char A, B, C)

    Print all the variables

        sample data: apple, iphone 10, black, 1000.99, 128, true, A
 */
public class CellPhone {

    public static void main(String[] args) {

        String brand = "Apple";
        String model = "IPhone 16";
        String color = "Matt Black";
        double price = 999.99;
        int storage = 256;
        boolean hasCamera = true;
        char sim = 'A';


        System.out.println("I just bought " + model + " from " + brand);
        System.out.println("It is in the color of " + color + " and it has " + storage + " GB");
        System.out.println("It has " + sim + " sim card and with the camera being " + hasCamera + ", the total price $" + price);


        System.out.println();
        System.out.println("I just bought " + model + " from " + brand + "\nIt is in the color of " + color + " and it has " + storage + " GB" + "\nIt has " + sim + " sim card and with the camera being " + hasCamera + ", the total price $" + price);


        System.out.println();
        String fullMessage = "I just bought " + model + " from " + brand + "\nIt is in the color of " + color + " and it has " + storage + " GB" + "\nIt has " + sim + " sim card and with the camera being " + hasCamera + ", the total price $" + price;
        System.out.println(fullMessage);



    }

}

package practice;

public class CurrencyConverter_pract {
    public static void main(String[] args) {


        System.out.println(converter("euro", 110));
        System.out.println(converter("ruble", 100));

    }


    public static double converter (String currencyName, double dollarAmount) {

        double result = 0.0;

        switch (currencyName) {

            case "euro":
                result = dollarAmount * 1.90;
                break;
            case "manat":
                result = dollarAmount * 1.70;
                break;
            case "lira":
                result = dollarAmount * 35;
                break;
            default:
                result = -1;
                System.out.println("Did not find it");
        }

        return result;

    }







}

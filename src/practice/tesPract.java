package practice;

public class tesPract {

    public static void main(String[] args) {



        String [][] arr = {{"Lala", "Abbas", "John"},
                           {"Jersy", "Jerry"},
                           {"Tom", "Brown", "Rice"}
                          };


        for (String [] each : arr) {

            for (String elements : each) {

                System.out.print(elements + " ");

            }

            }
    }
}

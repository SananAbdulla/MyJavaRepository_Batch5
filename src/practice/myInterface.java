package practice;

import day33_b_encapsulation.access_modifiers.Test;
import day38_a_abstraction_interface.relation.AllowUserToSell;

 public interface myInterface  {


    void eat(double oz);


}
abstract class test5 implements myInterface{

    @Override
    public void eat(double oz) {
        System.out.println("Test1 is eating " );
    }
}

class test10 implements myInterface{
    @Override
    public void eat (double oz) {
        System.out.println("Test 2 is eating " + oz + " ounce");
    }
 }


  class runner {
    public static void main(String[] args) {


        test10 t = new test10();
        t.eat(10);





    }
}



package day42_b_maps.map;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {


        HashMap<Integer,String> map = new HashMap<>( );
        // map.add(); - in Map, we have put(KEY, VALUE)
        // How to add KEY/VALUE
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(0, "Zero");
        map.put(-1, "MinusOne");
        map.put(20, "Two");  // Duplicate VALUES are allowed
        map.put(null, null); // null as KEY and nul as VALUE are allowed in HashMap

        System.out.println(map);

        //map.remove(1);

        System.out.println(map);

        System.out.println(map.containsKey(2));

        System.out.println(map.containsValue("Three"));

        System.out.println(map.get(1).contains("One"));

        System.out.println();


        // TODO remember this
        Map <String, String> cartoonCharacters = new HashMap <> ( );
        cartoonCharacters.put("Tom", "Jerry");
        cartoonCharacters.put("Winnie", "Pooh");


        Map<String, String> moviesStars = new HashMap <> ( );
        moviesStars.put("James", "Bond");
        moviesStars.put("Sherlock", "Holmes");

        System.out.println();
        Map < String , Map<String , String> > info = new HashMap<>();

        info.put("cartoonCharacters",  cartoonCharacters);
        info.put("moviesStars" , moviesStars);

        System.out.println(info);

        Map<String, String> map1 = info.get("cartoonCharacters");
        System.out.println(map1);
        System.out.println("------------");

        System.out.println(info.get("cartoonCharacters"));

        System.out.println();
        System.out.println(info.get("moviesStars").get("Sherlock"));

    }
}

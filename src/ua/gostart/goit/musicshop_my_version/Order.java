package ua.gostart.goit.musicshop_my_version;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Order {

    Map<String, Integer> order = new HashMap<>();

    public Map<String, Integer> makeOrder() {
        order.put("guitar",2);
        //order.put("guitar1",2);
        order.put("trumpet",2);
        order.put("piano",2);
        //order.put("piano1",2);

        Set<String> strings = order.keySet();
        System.out.println("\nNew order is getting:" + order.keySet());
        for (String k : strings) {
            System.out.println(k + " " + order.get(k));
        }
        return order;
    }

    public void showOrder() {

        Set<String> strings = order.keySet();
        System.out.println("\nNew order is getting:" + order.keySet());
        for (String k : strings) {
            System.out.println(k + " " + order.get(k));
        }
    }


}


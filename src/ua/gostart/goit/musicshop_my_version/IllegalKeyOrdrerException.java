package ua.gostart.goit.musicshop_my_version;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IllegalKeyOrdrerException extends Exception {

    IllegalKeyOrdrerException() {
        //System.out.println("Order has wrong goods");
        MusicShopStock musicShopStock = new MusicShopStock();
        //Order order = new Order();
        Map<String, Integer> order = new HashMap<>();
        Set<String> keysOrderSet = order.keySet();
        JOptionPane.showInputDialog("Order has wrong goods",keysOrderSet);
    }
}

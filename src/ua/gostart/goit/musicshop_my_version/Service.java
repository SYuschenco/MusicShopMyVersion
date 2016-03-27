package ua.gostart.goit.musicshop_my_version;

import javax.swing.*;
import java.security.InvalidParameterException;
import java.util.*;

public class Service {
    List<MusicalInstrument> listOrderToSale = new ArrayList();
    MusicShopStock musicShopStock = new MusicShopStock();

    public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order) {
        musicShopStock.getStock();
        musicShopStock.showGoods();

        //musicShopStock.addGoods(3, 3, 3);

        Set<String> keysOrderSet = order.keySet();
        //System.out.println("keysOrderSet - это набор ключей в заказе. Всего в заказе ключей сейчас - " + keysOrderSet.size());
        //System.out.println("Значения keysOrderSet:" + keysOrderSet.toString());
        for (String key : keysOrderSet) {
            try {
                if (!key.equals("piano") && !key.equals("guitar") && !key.equals("trumpet")) {

                    throw new IllegalKeyOrdrerException();
                }
            } catch (IllegalKeyOrdrerException e) {
                JOptionPane.showMessageDialog(null,"Order has illegal goods ["+key + "] - program is breaking!");

            }

        }

        for (String k : keysOrderSet) {
            try {
                int needToOrder = order.get(k);
                if (needToOrder <= 0) {
                    throw new InvalidParameterException();
                }
            } catch (InvalidParameterException e) {
                JOptionPane.showMessageDialog(null,"Order items ["+ k + "] has not a positive number ["+ order.get(k)+
                        "]- program is continued" );
            } finally {

                int needToOrder = order.get(k);
                int numberDeleteGoods = 0;
                System.out.println("needToOrder:" + needToOrder);
                //System.out.println(musicShopStock.getStock().size());
                for (int i = 0; i < musicShopStock.getStock().size(); i++) {
                        if (k.equals(musicShopStock.getStock().get(i).getName()) && numberDeleteGoods < needToOrder) {

                            //System.out.println("equals---" + k.equals(musicShopStock.getStock().get(i).getName()));
                            listOrderToSale.add(musicShopStock.getStock().get(i));
                            numberDeleteGoods++;}
                }
                if (numberDeleteGoods < needToOrder)
                    throw new IllegalArgumentException("Shop does not have enough " + k + "s");
            }
        }
            //Печатаем сколько всего товаров в списке заказов на отгрузку
            System.out.println("В остатках " + musicShopStock.getStock().size() + " объектов");
            return listOrderToSale;

    }

    public void removeOrderFromTheStock(Map<String, Integer> order) {
       // MusicShopStock musicShopStock = new MusicShopStock();
        musicShopStock.getStock();
        //musicShopStock.addGoods(3, 3, 3);
        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String goodsType = orderEntry.getKey();
            Integer needToOrder = orderEntry.getValue();
            int numberDeleteGoods = 0;
            Iterator<MusicalInstrument> iterator = musicShopStock.getStock().iterator();
            while (iterator.hasNext()) {
                MusicalInstrument instrument = iterator.next();
                if (instrument.getType().equals(goodsType) && numberDeleteGoods < needToOrder) {
                    iterator.remove();
                    numberDeleteGoods++;
                }
            }
        }
        musicShopStock.showGoods();
    }

    public void showListOrderToSale() {

        System.out.println("В полном списке для продажи " + listOrderToSale.size() + " объектов с именами");
        for (int i = 0; i < listOrderToSale.size(); i++) {
            System.out.println(listOrderToSale.get(i).getName());
        }

    }
}

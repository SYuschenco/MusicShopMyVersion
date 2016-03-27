package ua.gostart.goit.musicshop_my_version;

import java.util.ArrayList;
import java.util.List;

public class MusicShopStock {
    int guitarsNumber = 3;
    int pianosNumber = 3;
    int trumpetsNumber = 3;
    MusicShopStock(){
        addGoods(guitarsNumber,pianosNumber,trumpetsNumber);
    }


    public List<MusicalInstrument> shopStock = new ArrayList();

    public List<MusicalInstrument> getStock() {
        return shopStock;
    }

    public void addGoods(int gn, int pn, int tn) {

        int guitarsNumber = gn;
        int pianosNumber = pn;
        int trumpetsNumber = tn;


        for (int i = 0; i <guitarsNumber ; i++) {
            Guitar guitar = new Guitar("guitar");
            shopStock.add(guitar);
        }
        for (int i = 0; i <pianosNumber ; i++) {
            Piano piano = new Piano("piano");
            shopStock.add(piano);
        }
        for (int i = 0; i <trumpetsNumber ; i++) {
            Trumpet trumpet = new Trumpet("trumpet");
            shopStock.add(trumpet);
        }


    }

    public void showGoods() {
        //System.out.println("Работает:public class MusicShop/public void show()-----------------------------------------------------------------------------------------");
        System.out.println("В списке остатков магазина  " + shopStock.size()+ " объектов с именами:");
        for (int i = 0; i < shopStock.size(); i++) {
            System.out.println(shopStock.get(i).getName());

        }
}

}

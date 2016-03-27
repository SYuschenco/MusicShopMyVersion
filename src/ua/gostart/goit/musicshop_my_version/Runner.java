package ua.gostart.goit.musicshop_my_version;

public class Runner {

 public static void main(String[] args) {

//    Добавить в магазин инструментов метод, который готовит к отгрузке партию музыкальных инструментов согласно заказу.
//        Сигнатура метода:
//          public List<Instrument> prepareInstruments(Map<String, Integer> order){...}
     //Реализовано тут:
//                     public class Service {
//                         List<MusicalInstrument> listOrderToSale = new ArrayList();
//
//                         public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order) {
//                             MusicShopStock musicShopStock = new MusicShopStock();
//                             musicShopStock.addGoods(3, 3, 3);

//        В заказе (Map<String, Integer> order) хранится название инструмента и количество необходимых инструментов.
//        Ключем в заказе является одна из строк "piano", "guitar", "trumpet"
     //Реализовано тут:
//                         public class Order {
//
//                             Map<String, Integer> order = new HashMap<>();
//
//                             public Map<String, Integer> makeOrder() {
//                                 order.put("guitar",2);
//                                 //order.put("guitar1",2);
//                                 order.put("trumpet",2);
//                                 order.put("piano",2);
//                                 //order.put("piano1",2);
//                                 return order;
//                             }

//        Создать свое исключение, которое будет брошено в случае, когда ключ в заказе другой.
     //Реализовано тут:
     //public class Service { lines 13-22
     //public class IllegalKeyOrdrerException extends Exception {

//        Каким-то образом (самостоятельно выбрать решение) обработать ситуацию,
//        когда количество элементов в заказе отрицательное, нулевое.
     //Реализовано тут: public class Service { lines 30-38

//        После выполнения метода из магазина должны пропасть те инструменты, которые были отгружены.
     //Реализовано тут: public class Service

//        В случае, когда количество запрашиваемых инструментов определенного типа больше, чем количество
//        доступных инструментов в магазине, должно быть брошено исключение. Выбрать наиболее подходящее из
//        доступных в стандартной библиотеке исключений
     // //Реализовано тут: public class Service { lines 52-53



     Order order = new Order();
     Service service = new Service();
     service.prepareInstruments(order.makeOrder());
     service.showListOrderToSale();
     service.removeOrderFromTheStock(order.makeOrder());


     //musicShopStock.showGoods();

 }
}

//    Добавить в магазин инструментов метод, который готовит к отгрузке партию музыкальных инструментов согласно заказу.
//
//        Сигнатура метода:
//          public List<Instrument> prepareInstruments(Map<String, Integer> order){...}
//
//        В заказе (Map<String, Integer> order) хранится название инструмента и количество необходимых инструментов.
//
//        Ключем в заказе является одна из строк "piano", "guitar", "trumpet"
//
//        Создать свое исключение, которое будет брошено в случае, когда ключ в заказе другой.
//
//        Каким-то образом (самостоятельно выбрать решение) обработать ситуацию,
//        когда количество элементов в заказе отрицательное, нулевое.
//
//        После выполнения метода из магазина должны пропасть те инструменты, которые были отгружены.
//        В случае, когда количество запрашиваемых инструментов определенного типа больше, чем количество
//        доступных инструментов в магазине, должно быть брошено исключение. Выбрать наиболее подходящее из
//        доступных в стандартной библиотеке исключений
//
//          Пример:
//
//        в магазине было 2 фортепиано, 16 гитар и 7 труб.
//        пришел заказ на 7 гитар и 2 трубы.
//        после выполнения заказа в магазине осталось 2 фортепиано, 9 гитар и 5 труб
//        пришел заказ на 1 фортепиано
//        после выполнения заказа в магазине осталось 1 фортепиано, 9 гитар и 5 труб
//        пришел заказ на 1 фортепиано, 8 гитар и 6 труб
//        товар не был отгружен (было брошено исключение)
//        в магазине осталось 1 фортепиано, 9 гитар и 5 труб
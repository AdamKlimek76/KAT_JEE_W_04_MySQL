package a_Zadania.a_Dzien_2.e_Laczenie_tabel;


public class Main2 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "SELECT * FROM orders JOIN products_orders ON orders.id=products_orders.orders_id WHERE products_orders.products_id=1;";
    public String query2 = "select * from products join products_orders po on products.id = po.products_id where orders_id=1;";

}

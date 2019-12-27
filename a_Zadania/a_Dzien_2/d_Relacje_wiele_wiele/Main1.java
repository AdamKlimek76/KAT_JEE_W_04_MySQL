package a_Zadania.a_Dzien_2.d_Relacje_wiele_wiele;


public class Main1 {
    //poniżej zapisz zapytanie tworzące tabele i łączące je.
    public String query1 = "create table products_orders\n" +
            "(\n" +
            "    id          INT NOT NULL AUTO_INCREMENT,\n" +
            "    products_id INT NOT NULL,\n" +
            "    orders_id   INT NOT NULL,\n" +
            "    PRIMARY KEY (id),\n" +
            "    FOREIGN KEY (products_id) REFERENCES products (id),\n" +
            "    FOREIGN KEY (orders_id) REFERENCES orders (id)\n" +
            ");";

    //zapytania łączące produkty z zamówieniami
    public String query2 = "INSERT INTO products_orders (products_id, orders_id)\n" +
            "VALUES (1, 1);";
    public String query3 = "INSERT INTO products_orders (products_id, orders_id)\n" +
            "VALUES (1, 2);";
    public String query4 = "INSERT INTO products_orders (products_id, orders_id)\n" +
            "VALUES (2, 2);";
    public String query5 = "INSERT INTO products_orders (products_id, orders_id)\n" +
            "VALUES (2, 3);";

}

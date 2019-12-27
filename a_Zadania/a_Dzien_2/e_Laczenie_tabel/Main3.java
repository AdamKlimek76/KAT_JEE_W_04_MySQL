package a_Zadania.a_Dzien_2.e_Laczenie_tabel;


public class Main3 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "SELECT * FROM products JOIN opinions ON products.id = opinions.id_product;";
    public String query2 = "SELECT * FROM products LEFT JOIN opinions ON products.id = opinions.id_product;";
    public String query3 = "SELECT * FROM opinions JOIN products ON opinions.id_product=products.id;";

}

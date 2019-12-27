package a_Zadania.a_Dzien_2.e_Laczenie_tabel;


public class Main4 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "SELECT categories_sub.main_id, categories_sub.name FROM categories_sub JOIN categories\n" +
            "ON categories_sub.main_id = categories.id WHERE categories.id=1;";
    public String query2 = "SELECT DISTINCT categories.id, categories.name FROM categories JOIN categories_sub cs on categories.id = cs.main_id;";

}

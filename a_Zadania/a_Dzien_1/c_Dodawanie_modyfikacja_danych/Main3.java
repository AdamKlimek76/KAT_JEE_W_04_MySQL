package a_Zadania.a_Dzien_1.c_Dodawanie_modyfikacja_danych;

public class Main3 {
    
    public String query1 = "INSERT INTO products SET id=0, name=produkt1, description=name, price=904";
    public String query1fixed = "INSERT INTO products SET name='produkt1', description='name', price=90.40;";

    public String query2 = "INSERT INTO clients VALUES(\"Jan\", \"Kowalski\", 4, \"Mr.\")";
    public String query2fixed = "INSERT INTO clients (name, surname) VALUES('Jan', 'Kowalski');";

    public String query3 = "INSERT INTO movies(id, rating, title) VALUES(null, \"bardzo dobry\", \"Szybcy i wściekli\")";
    public String query3fixed = "INSERT INTO movies(rating, title) VALUES(9.82, 'Szybcy i wściekli');";

    public String query4 = "INSERT INTO payments SET id=90 AND VALUES(\"cash\", NOW())";
    public String query4fixed = "INSERT INTO payments SET id=90, type='cash', payment_date=NOW();";
}

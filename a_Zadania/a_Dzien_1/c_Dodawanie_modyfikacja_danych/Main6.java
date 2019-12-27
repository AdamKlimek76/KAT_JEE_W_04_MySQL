package a_Zadania.a_Dzien_1.c_Dodawanie_modyfikacja_danych;

public class Main6 {

	//zapisz poniżej zapytania do bazy
    public static String query1 = "SELECT SUM(quantity) FROM tickets;";
    public static String query2 = "SELECT type, COUNT(*) FROM payments GROUP BY type;";
    public static String query3 = "SELECT AVG(price) FROM tickets;";
    public static String query4 = "SELECT * FROM payments LIMIT 1, 5;\n" +
            "SELECT * FROM payments LIMIT 5 OFFSET 1;";
    public static String query5 = "SELECT type, COUNT(*) AS size FROM payments GROUP BY type HAVING size>2;";
    public static String query6 = "SELECT SUM(quantity) from tickets WHERE price>23.15;";
}
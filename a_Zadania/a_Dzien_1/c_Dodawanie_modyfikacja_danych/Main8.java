package a_Zadania.a_Dzien_1.c_Dodawanie_modyfikacja_danych;

public class Main8 {

	//zapisz poniżej zapytania do bazy
    public static String query1 = "UPDATE cinemas SET address='Stadion Narodowy' WHERE address LIKE '%z';";
    public static String query2 = "DELETE FROM payments WHERE payment_date<(NOW()- INTERVAL 4 DAY);";
    public static String query3 = "UPDATE movies SET rating=5.4 WHERE LENGTH(description)>4;";
    public static String query4 = "UPDATE tickets SET price=price*0.5 WHERE quantity>10;";
}
package a_Zadania.a_Dzien_1.b_Modyfikacja_tabel;


public class Main1 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "ALTER TABLE tickets ADD priceUSD DECIMAL(11, 2);";
    public String query2 = "use cinemas_ex;\n" +
            "ALTER TABLE movies ADD director CHAR(80);";
    public String query3 = "ALTER TABLE movies MODIFY COLUMN director VARCHAR(50);";
    public String query4 = "ALTER TABLE tickets DROP COLUMN priceUSD;";
}

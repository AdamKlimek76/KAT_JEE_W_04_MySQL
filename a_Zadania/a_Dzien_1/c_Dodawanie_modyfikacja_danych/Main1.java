package a_Zadania.a_Dzien_1.c_Dodawanie_modyfikacja_danych;

public class Main1 {

	//zapisz poniżej zapytania dodające rekordy do pierwszej tabeli:

    public String table1row1 = "NSERT INTO clients (name, surname)\n" +
            "VALUES ('Adam', 'Nowak');";
    public String table1row2 = "INSERT INTO clients (name, surname)\n" +
            "VALUES ('Michał', 'Kowalski');";


	//zapisz poniżej zapytania dodające rekordy do drugiej tabeli:

    public String table2row1 = "INSERT INTO orders (description)\n" +
            "VALUES ('zamówienie1');";
    public String table2row2 = "INSERT INTO orders (description)\n" +
            "VALUES ('zamówienie2');";


	//zapisz poniżej zapytania dodające rekordy do trzeciej tabeli:
	
    public String table3row1 = "INSERT INTO products (name, description, price)\n" +
            "VALUES ('tow1', 'towar1', 20.12);";
    public String table3row2 = "INSERT INTO products (name, description, price)\n" +
            "VALUES ('tow2', 'towar2', 10.02);";
}

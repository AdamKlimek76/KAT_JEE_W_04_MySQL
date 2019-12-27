package a_Zadania.a_Dzien_1.d_Relacje_1_1;


public class Main3 {
    //zapisz poniżej zapytanie tworzące tabelę - pamiętaj o relacji i dodaniu odpowiedniej kolumny
    public String queryCreateTable = "CREATE TABLE payments\n" +
            "(\n" +
            "    id           INT AUTO_INCREMENT,\n" +
            "    type         VARCHAR(255),\n" +
            "    payment_date DATE,\n" +
            "    PRIMARY KEY (id),\n" +
            "    FOREIGN KEY (id) REFERENCES tickets (id)\n" +
            ");";

    //zapisz zapytania dodające wpisy do tabeli `payments`
    public String query1 = "INSERT INTO payments (id, type, payment_date)\n" +
            "values (1, 'cash', '2019-12-01');";
    public String query2 = "INSERT INTO payments (id, type, payment_date)\n" +
            "values (2, 'card', '2019-12-02');";
    public String query3 = "INSERT INTO payments (id, type, payment_date)\n" +
            "values (3, 'transfer', '2019-12-03');";
    public String query4 = "INSERT INTO payments (id, type, payment_date)\n" +
            "values (4, 'transfer', '2019-12-04');";
    public String query5 = "INSERT INTO payments (id, type, payment_date)\n" +
            "values (5, 'card', '2019-12-05');";
}

package a_Zadania.a_Dzien_1.d_Relacje_1_1;


public class Main1 {
    //zapisz poniżej zapytanie dodające tabelę do bazy pamiętaj o relacji
    public String tableAddQuery = "CREATE TABLE client_adresses(\n" +
            "    client_id INT AUTO_INCREMENT,\n" +
            "    city VARCHAR(255),\n" +
            "    street VARCHAR(255),\n" +
            "    house_nr VARCHAR(255),\n" +
            "    PRIMARY KEY (client_id),\n" +
            "    FOREIGN KEY (client_id) REFERENCES clients(id)\n" +
            ");";

    //zapisz poniżej kod dodania do bazy rekordów
    public String tableAddRow1 = "INSERT INTO client_adresses(client_id, city, street, house_nr)\n" +
            "VALUES (1, 'Katowice', 'Zielona', '1'),\n" +
            "       (2, 'Chybie', 'Spokojna', '8a'),\n" +
            "       (3, 'Skoczów', 'Bór', '10'),\n" +
            "       (4, 'Wrocław', 'Muchoborska', '10'),\n" +
            "       (5, 'Chorzów', 'Stadionowa', '6');";
    public String tableAddRow2 = "INSERT INTO client_adresses(client_id, city, street, house_nr)\n" +
            "VALUES (1, 'Katowice', 'Zielona', '1'),\n" +
            "       (2, 'Chybie', 'Spokojna', '8a'),\n" +
            "       (3, 'Skoczów', 'Bór', '10'),\n" +
            "       (4, 'Wrocław', 'Muchoborska', '10'),\n" +
            "       (5, 'Chorzów', 'Stadionowa', '6');";
    public String tableAddRow3 = "INSERT INTO client_adresses(client_id, city, street, house_nr)\n" +
            "VALUES (1, 'Katowice', 'Zielona', '1'),\n" +
            "       (2, 'Chybie', 'Spokojna', '8a'),\n" +
            "       (3, 'Skoczów', 'Bór', '10'),\n" +
            "       (4, 'Wrocław', 'Muchoborska', '10'),\n" +
            "       (5, 'Chorzów', 'Stadionowa', '6');";
    public String tableAddRow4 = "INSERT INTO client_adresses(client_id, city, street, house_nr)\n" +
            "VALUES (1, 'Katowice', 'Zielona', '1'),\n" +
            "       (2, 'Chybie', 'Spokojna', '8a'),\n" +
            "       (3, 'Skoczów', 'Bór', '10'),\n" +
            "       (4, 'Wrocław', 'Muchoborska', '10'),\n" +
            "       (5, 'Chorzów', 'Stadionowa', '6');";
    public String tableAddRow5 = "INSERT INTO client_adresses(client_id, city, street, house_nr)\n" +
            "VALUES (1, 'Katowice', 'Zielona', '1'),\n" +
            "       (2, 'Chybie', 'Spokojna', '8a'),\n" +
            "       (3, 'Skoczów', 'Bór', '10'),\n" +
            "       (4, 'Wrocław', 'Muchoborska', '10'),\n" +
            "       (5, 'Chorzów', 'Stadionowa', '6');";
}

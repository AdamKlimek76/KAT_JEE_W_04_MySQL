package a_Zadania.a_Dzien_2.d_Relacje_wiele_wiele;


public class Main2 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "create table cinemas_movies\n" +
            "(\n" +
            "    id          INT NOT NULL AUTO_INCREMENT,\n" +
            "    cinemas_id INT NOT NULL,\n" +
            "    movies_id   INT NOT NULL,\n" +
            "    PRIMARY KEY (id),\n" +
            "    FOREIGN KEY (cinemas_id) REFERENCES cinemas (id),\n" +
            "    FOREIGN KEY (movies_id) REFERENCES movies (id)\n" +
            ");";
    public String query2 = "INSERT INTO cinemas_movies (cinemas_id, movies_id)\n" +
            "VALUES (1, 1),\n" +
            "       (1, 2),\n" +
            "       (1, 3),\n" +
            "       (2, 1),\n" +
            "       (2, 2),\n" +
            "       (2, 3),\n" +
            "       (4, 1),\n" +
            "       (4, 2),\n" +
            "       (4, 3);";
}

package a_Zadania.a_Dzien_1.d_Relacje_1_wiele;


public class Main1 {
    //zapisz poniżej zapytanie dodające tabelę do bazy pamiętaj o relacji
    public String tableAddQuery = "REATE TABLE opinions(\n" +
            "    id INT NOT NULL AUTO_INCREMENT,\n" +
            "    id_product INT NOT NULL,\n" +
            "    description VARCHAR(255) NOT NULL,\n" +
            "    PRIMARY KEY (id),\n" +
            "    FOREIGN KEY (id_product) REFERENCES products(id)\n" +
            ");";

    //poniżej zapisz zapytania dodające rekordy do tabeli
    public String queryProduct1Opinion1 = "insert into opinions(description, id_product)\n" +
            "values ('extra product', 1);";
    public String queryProduct1Opinion2 = "insert into opinions(description, id_product)\n" +
            "values ('average product', 1);";
    public String queryProduct1Opinion3 = "insert into opinions(description, id_product)\n" +
            "values (' product', 1);";
    public String queryProduct1Opinion4 = "insert into opinions(description, id_product)\n" +
            "values ('best product', 1);";
    public String queryProduct1Opinion5 = "insert into opinions(description, id_product)\n" +
            "values ('bad product', 1);";

    public String queryProduct2Opinion1 = "insert into opinions(description, id_product)\n" +
            "values ('extra product', 2);";
    public String queryProduct2Opinion2 = "insert into opinions(description, id_product)\n" +
            "values ('average product', 2);";
    public String queryProduct2Opinion3 = "insert into opinions(description, id_product)\n" +
            "values (' product', 2);";
    public String queryProduct2Opinion4 = "insert into opinions(description, id_product)\n" +
            "values ('best product', 2);";
    public String queryProduct2Opinion5 = "insert into opinions(description, id_product)\n" +
            "values ('bad product', 2);";

    public String queryProduct3Opinion1 = "insert into opinions(description, id_product)\n" +
            "values ('extra product', 3);";
    public String queryProduct3Opinion2 = "insert into opinions(description, id_product)\n" +
            "values ('average product', 3);";
    public String queryProduct3Opinion3 = "insert into opinions(description, id_product)\n" +
            "values (' product', 3);";
    public String queryProduct3Opinion4 = "insert into opinions(description, id_product)\n" +
            "values ('best product', 3);";
    public String queryProduct3Opinion5 = "insert into opinions(description, id_product)\n" +
            "values ('bad product', 3);";
}

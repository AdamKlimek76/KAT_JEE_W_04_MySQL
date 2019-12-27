package a_Zadania.a_Dzien_1.d_Relacje_1_wiele;


public class Main2 {
    //zapisz poniżej zapytania tworzące odpowiednie tabele

    public String queryAddCategories = "create table categories\n" +
            "(\n" +
            "    id   INT NOT NULL AUTO_INCREMENT,\n" +
            "    name VARCHAR(255),\n" +
            "    PRIMARY KEY (id)\n" +
            ");";

    public String queryAddCategoriesSub = "create table categories_sub\n" +
            "(\n" +
            "    id      INT NOT NULL AUTO_INCREMENT,\n" +
            "    main_id INT NOT NULL,\n" +
            "    name    VARCHAR(255),\n" +
            "    PRIMARY KEY (id),\n" +
            "    FOREIGN KEY (main_id)\n" +
            "    REFERENCES categories (id)\n" +
            ");";

}

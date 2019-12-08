package b_Zadania_domowe.a_Dzien_1;


public class Main2 {
    public String createTableImagesQuery = "create table images\n" +
            "(\n" +
            "    id      INT UNSIGNED NOT NULL AUTO_INCREMENT,\n" +
            "    offer_id INT UNSIGNED NOT NULL,\n" +
            "    scr     VARCHAR(100),\n" +
            "    dimension VARCHAR(10),\n" +
            "    PRIMARY KEY (id)\n" +
            ");";

    public String createTableUsersCompaniesQuery = "create table users_companies\n" +
            "(\n" +
            "    id      INT UNSIGNED NOT NULL AUTO_INCREMENT,\n" +
            "    user_id INT UNSIGNED NOT NULL UNIQUE,\n" +
            "    name     VARCHAR(30),\n" +
            "    nip INT,\n" +
            "    street VARCHAR(50),\n" +
            "    street_nr MEDIUMINT,\n" +
            "    phone CHAR(9),\n" +
            "    post_code CHAR(6),\n" +
            "    capital DECIMAL(7, 2),\n" +
            "    rate DECIMAL(5, 4),\n" +
            "    created_at DATETIME,\n" +
            "    PRIMARY KEY (id)\n" +
            ");";
}

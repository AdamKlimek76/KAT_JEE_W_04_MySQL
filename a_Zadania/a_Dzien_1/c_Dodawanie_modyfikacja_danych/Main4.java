package a_Zadania.a_Dzien_1.c_Dodawanie_modyfikacja_danych;

public class Main4 {
    
    //zapisz poniżej zapytania dodające rekordy do pierwszej tabeli:
    public String table1row1 = "INSERT INTO cinemas (name, address, openTime, closeTime)\n" +
            "VALUES ('Kino1', 'Adres1', '08:00:00', '21:00:00'),\n" +
            "       ('Kino2', 'Adres2', '09:00:00', '20:00:00'),\n" +
            "       ('Kino3', 'Adres3', '10:00:00', '22:00:00'),\n" +
            "       ('Kino4', 'Adres4', '11:00:00', '23:00:00'),\n" +
            "       ('Kino5', 'Adres5', '12:00:00', '19:59:00');";
    public String table1row2 = "INSERT INTO cinemas (name, address, openTime, closeTime)\n" +
            "VALUES ('Kino1', 'Adres1', '08:00:00', '21:00:00'),\n" +
            "       ('Kino2', 'Adres2', '09:00:00', '20:00:00'),\n" +
            "       ('Kino3', 'Adres3', '10:00:00', '22:00:00'),\n" +
            "       ('Kino4', 'Adres4', '11:00:00', '23:00:00'),\n" +
            "       ('Kino5', 'Adres5', '12:00:00', '19:59:00');";
    public String table1row3 = "INSERT INTO cinemas (name, address, openTime, closeTime)\n" +
            "VALUES ('Kino1', 'Adres1', '08:00:00', '21:00:00'),\n" +
            "       ('Kino2', 'Adres2', '09:00:00', '20:00:00'),\n" +
            "       ('Kino3', 'Adres3', '10:00:00', '22:00:00'),\n" +
            "       ('Kino4', 'Adres4', '11:00:00', '23:00:00'),\n" +
            "       ('Kino5', 'Adres5', '12:00:00', '19:59:00');";
    public String table1row4 = "INSERT INTO cinemas (name, address, openTime, closeTime)\n" +
            "VALUES ('Kino1', 'Adres1', '08:00:00', '21:00:00'),\n" +
            "       ('Kino2', 'Adres2', '09:00:00', '20:00:00'),\n" +
            "       ('Kino3', 'Adres3', '10:00:00', '22:00:00'),\n" +
            "       ('Kino4', 'Adres4', '11:00:00', '23:00:00'),\n" +
            "       ('Kino5', 'Adres5', '12:00:00', '19:59:00');";
    public String table1row5 = "INSERT INTO cinemas (name, address, openTime, closeTime)\n" +
            "VALUES ('Kino1', 'Adres1', '08:00:00', '21:00:00'),\n" +
            "       ('Kino2', 'Adres2', '09:00:00', '20:00:00'),\n" +
            "       ('Kino3', 'Adres3', '10:00:00', '22:00:00'),\n" +
            "       ('Kino4', 'Adres4', '11:00:00', '23:00:00'),\n" +
            "       ('Kino5', 'Adres5', '12:00:00', '19:59:00');";


    //zapisz poniżej zapytania dodające rekordy do drugiej tabeli:
    public String table2row1 = "INSERT INTO movies (title, description, rating, director, watchCount, isTop)\n" +
            "VALUES ('Tytul1', 'Fajny', 9.20, 'Ford', 56520, 1),\n" +
            "       ('Tytul2', 'Gupi', 1.20, 'Scorcese', 200, 0),\n" +
            "       ('Tytul3', 'Wredny', 3.20, 'Costner', 2210, 0),\n" +
            "       ('Tytul4', 'Nudny', 3.40, 'Spilberg', 32120, 0),\n" +
            "       ('Tytul5', 'Śmieszny', 7.20, 'Stone', 12220, 1);";
    public String table2row2 = "INSERT INTO movies (title, description, rating, director, watchCount, isTop)\n" +
            "VALUES ('Tytul1', 'Fajny', 9.20, 'Ford', 56520, 1),\n" +
            "       ('Tytul2', 'Gupi', 1.20, 'Scorcese', 200, 0),\n" +
            "       ('Tytul3', 'Wredny', 3.20, 'Costner', 2210, 0),\n" +
            "       ('Tytul4', 'Nudny', 3.40, 'Spilberg', 32120, 0),\n" +
            "       ('Tytul5', 'Śmieszny', 7.20, 'Stone', 12220, 1);";
    public String table2row3 = "INSERT INTO movies (title, description, rating, director, watchCount, isTop)\n" +
            "VALUES ('Tytul1', 'Fajny', 9.20, 'Ford', 56520, 1),\n" +
            "       ('Tytul2', 'Gupi', 1.20, 'Scorcese', 200, 0),\n" +
            "       ('Tytul3', 'Wredny', 3.20, 'Costner', 2210, 0),\n" +
            "       ('Tytul4', 'Nudny', 3.40, 'Spilberg', 32120, 0),\n" +
            "       ('Tytul5', 'Śmieszny', 7.20, 'Stone', 12220, 1);";
    public String table2row4 = "INSERT INTO movies (title, description, rating, director, watchCount, isTop)\n" +
            "VALUES ('Tytul1', 'Fajny', 9.20, 'Ford', 56520, 1),\n" +
            "       ('Tytul2', 'Gupi', 1.20, 'Scorcese', 200, 0),\n" +
            "       ('Tytul3', 'Wredny', 3.20, 'Costner', 2210, 0),\n" +
            "       ('Tytul4', 'Nudny', 3.40, 'Spilberg', 32120, 0),\n" +
            "       ('Tytul5', 'Śmieszny', 7.20, 'Stone', 12220, 1);";
    public String table2row5 = "INSERT INTO movies (title, description, rating, director, watchCount, isTop)\n" +
            "VALUES ('Tytul1', 'Fajny', 9.20, 'Ford', 56520, 1),\n" +
            "       ('Tytul2', 'Gupi', 1.20, 'Scorcese', 200, 0),\n" +
            "       ('Tytul3', 'Wredny', 3.20, 'Costner', 2210, 0),\n" +
            "       ('Tytul4', 'Nudny', 3.40, 'Spilberg', 32120, 0),\n" +
            "       ('Tytul5', 'Śmieszny', 7.20, 'Stone', 12220, 1);";


    //zapisz poniżej zapytania dodające rekordy do trzeciej tabeli:
    public String table3row1 = "INSERT INTO payments (type, payment_date)\n" +
            "VALUES ('cash', '2019-01-20 08:00:00'),\n" +
            "       ('cash', '2019-02-20 10:00:00'),\n" +
            "       ('transfer', '2019-10-23 23:00:00'),\n" +
            "       ('cash', '2019-11-01 13:17:23'),\n" +
            "       ('check', '2019-12-01 12:14:50');";
    public String table3row2 = "INSERT INTO payments (type, payment_date)\n" +
            "VALUES ('cash', '2019-01-20 08:00:00'),\n" +
            "       ('cash', '2019-02-20 10:00:00'),\n" +
            "       ('transfer', '2019-10-23 23:00:00'),\n" +
            "       ('cash', '2019-11-01 13:17:23'),\n" +
            "       ('check', '2019-12-01 12:14:50');";
    public String table3row3 = "INSERT INTO payments (type, payment_date)\n" +
            "VALUES ('cash', '2019-01-20 08:00:00'),\n" +
            "       ('cash', '2019-02-20 10:00:00'),\n" +
            "       ('transfer', '2019-10-23 23:00:00'),\n" +
            "       ('cash', '2019-11-01 13:17:23'),\n" +
            "       ('check', '2019-12-01 12:14:50');";
    public String table3row4 = "INSERT INTO payments (type, payment_date)\n" +
            "VALUES ('cash', '2019-01-20 08:00:00'),\n" +
            "       ('cash', '2019-02-20 10:00:00'),\n" +
            "       ('transfer', '2019-10-23 23:00:00'),\n" +
            "       ('cash', '2019-11-01 13:17:23'),\n" +
            "       ('check', '2019-12-01 12:14:50');";
    public String table3row5 = "INSERT INTO payments (type, payment_date)\n" +
            "VALUES ('cash', '2019-01-20 08:00:00'),\n" +
            "       ('cash', '2019-02-20 10:00:00'),\n" +
            "       ('transfer', '2019-10-23 23:00:00'),\n" +
            "       ('cash', '2019-11-01 13:17:23'),\n" +
            "       ('check', '2019-12-01 12:14:50');";


    //zapisz poniżej zapytania dodające rekordy do czwartej tabeli:
    public String table4row1 = "INSERT INTO tickets (quantity, price, status)\n" +
            "VALUES (1, 20.01, 1),\n" +
            "       (2, 10.01, 0),\n" +
            "       (10, 16.99, 1),\n" +
            "       (12, 11.50, 0),\n" +
            "       (9, 20.99, 1);";
    public String table4row2 = "INSERT INTO tickets (quantity, price, status)\n" +
            "VALUES (1, 20.01, 1),\n" +
            "       (2, 10.01, 0),\n" +
            "       (10, 16.99, 1),\n" +
            "       (12, 11.50, 0),\n" +
            "       (9, 20.99, 1);";
    public String table4row3 = "INSERT INTO tickets (quantity, price, status)\n" +
            "VALUES (1, 20.01, 1),\n" +
            "       (2, 10.01, 0),\n" +
            "       (10, 16.99, 1),\n" +
            "       (12, 11.50, 0),\n" +
            "       (9, 20.99, 1);";
    public String table4row4 = "INSERT INTO tickets (quantity, price, status)\n" +
            "VALUES (1, 20.01, 1),\n" +
            "       (2, 10.01, 0),\n" +
            "       (10, 16.99, 1),\n" +
            "       (12, 11.50, 0),\n" +
            "       (9, 20.99, 1);";
    public String table4row5 = "INSERT INTO tickets (quantity, price, status)\n" +
            "VALUES (1, 20.01, 1),\n" +
            "       (2, 10.01, 0),\n" +
            "       (10, 16.99, 1),\n" +
            "       (12, 11.50, 0),\n" +
            "       (9, 20.99, 1);";
}

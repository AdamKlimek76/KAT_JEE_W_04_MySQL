package b_Zadania_domowe.a_Dzien_1;


public class Main3 {
    public String queryAddImages1 = "INSERT INTO images(id, offer_id, scr, dimension)\n" +
            "VALUES (1, 1, '/home/adam/Pulpit/pictures/001.jpg', '400x800');";
    public String queryAddImages2 = "INSERT INTO images(offer_id, scr, dimension)\n" +
            "VALUES (1, '/home/adam/Pulpit/pictures/002.jpg', '400x800');";
    public String queryAddImages3 = "INSERT INTO images(offer_id, scr, dimension)\n" +
            "VALUES (2, '/home/adam/Pulpit/pictures/003.jpg', '400x800');";
    public String queryAddImages4 = "INSERT INTO images(offer_id, scr, dimension)\n" +
            "VALUES (2, '/home/adam/Pulpit/pictures/004.jpg', '400x800');";
    public String queryAddImages5 = "INSERT INTO images(offer_id, scr, dimension)\n" +
            "VALUES (3, '/home/adam/Pulpit/pictures/005.jpg', '400x800');";

    public String queryAddCompany1 = "INSERT INTO users_companies(user_id, name, nip, street, street_nr, phone, post_code, capital, rate, created_at)\n" +
            "VALUES (1, 'Adam', 123123123, 'Zielona', 8, '338598987', '43-520', 10000.00, 9.1111, '2019-12-08 17:00:00');";
    public String queryAddCompany2 = "INSERT INTO users_companies(user_id, name, nip, street, street_nr, phone, post_code, capital, rate, created_at)\n" +
            "VALUES (2, 'Barbara', 123123111, 'Zielona', 9, '338598988', '43-520', 10000.00, 8.3111, '2019-12-09 19:00:00');";
    public String queryAddCompany3 = "INSERT INTO users_companies(user_id, name, nip, street, street_nr, phone, post_code, capital, rate, created_at)\n" +
            "VALUES (3, 'Cecylia', 156423111, 'Niebieska', 11, '328598988', '40-456', 20000.00, 5.4321, '2019-12-10 19:55:00');\n";
    public String queryAddCompany4 = "INSERT INTO users_companies(user_id, name, nip, street, street_nr, phone, post_code, capital, rate, created_at)\n" +
            "VALUES (4, 'Bogusław', 356423111, 'Niebieska', 111, '328597888', '40-456', 30000.00, 8.4321, '2019-12-10 15:55:00');";
    public String queryAddCompany5 = "INSERT INTO users_companies(user_id, name, nip, street, street_nr, phone, post_code, capital, rate, created_at)\n" +
            "VALUES (5, 'Jolanta', 315923111, 'Czerwona', 222, '178597888', '30-123', 99000.00, 9.9999, '2019-12-07 14:02:12');";

}

package b_Zadania_domowe.a_Dzien_1;


public class Main1 {
    public String query1 = "SELECT * FROM users WHERE name LIKE 'Julia%';";

    public String query2 = "SELECT * FROM users ORDER BY email DESC LIMIT 5;";

    public String query3 = "SELECT * FROM users WHERE email LIKE '%@yahoo.com' AND name LIKE 'L%';";

    public String query4 = "SELECT * FROM users WHERE sha2(CONCAT(name, salt), 256)=password;";

    public String query5 = "SELECT id, title FROM offers WHERE price>500000;";

    public String query6 = "SELECT id, price FROM offers WHERE activation_token='' AND price BETWEEN 2000 AND 400000;";

    public String query7 = "SELECT title, price, phone FROM offers WHERE expire>NOW() AND expire<NOW() + INTERVAL 10 DAY;";

    public String query7a = "SELECT title, price, phone FROM offers WHERE expire>CURRENT_TIMESTAMP AND expire<ADDDATE(CURRENT_TIMESTAMP, 10);";

    public String query8 = "SELECT * FROM offers WHERE description LIKE '%violent%' AND phone LIKE '%2%' AND PRICE>50000;";

    public String query9 = "SELECT * FROM offers WHERE promoted=0 AND price<300000 AND title LIKE '%LLC';";

    public String query10 = "SELECT * FROM offers WHERE price*2<50000 AND expire>CURRENT_TIMESTAMP;";

    public String query11 = "SELECT COUNT(*) sum_active from offers WHERE expire>CURRENT_TIMESTAMP;";

    public String query12 = "SELECT owner, COUNT(*) sum_user from offers WHERE expire>CURRENT_TIMESTAMP GROUP BY owner;";

    public String query13 = "SELECT status AS type, COUNT(*) counter from offers WHERE status>0 GROUP BY status;";

    public String query14 = "SELECT SUM(price) sum_nonactive_nonpromoted FROM offers WHERE expire<CURRENT_TIMESTAMP AND status=1 AND promoted=0;";

    public String query15 = "SELECT ROUND(AVG(price), 2) avg_price FROM offers WHERE expire>CURRENT_TIMESTAMP AND promoted=1 AND price>44645.04;";

}

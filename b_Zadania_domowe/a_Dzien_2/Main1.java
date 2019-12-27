package b_Zadania_domowe.a_Dzien_2;


public class Main1 {

    public String query1 = "UPDATE offers SET price=price+1000 WHERE id BETWEEN 20 AND 25;";

    public String query2 = "DELETE FROM offers WHERE expire <=NOW() - INTERVAL 3 DAY;";

    public String query3 = "DELETE FROM offers WHERE LEFT(phone, 3) = '+48' AND promoted = 1 AND expire > NOW();";

    public String query4 = "UPDATE offers SET expire=NOW() + INTERVAL 23 DAY, promoted=1 WHERE SUBSTRING(phone, 3, 2)='48' AND promoted=0;";

    public String query5 = "UPDATE offers SET description=REPLACE(description, 'executed', 'found') WHERE INSTR(phone, '(')<>0 OR INSTR(phone, ')')<>0 AND price>400000;";
}

package a_Zadania.a_Dzien_2.e_Laczenie_tabel;


public class Main1 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "SELECT * FROM tickets JOIN payments on tickets.id = payments.id WHERE payments.type='cash';";
    public String query2 = "SELECT * FROM tickets JOIN payments on tickets.id = payments.id WHERE tickets.status=0;";

}

package b_Zadania_domowe.a_Dzien_2;


public class Main2 {

    public String queryRelationImages = "ALTER TABLE images ADD FOREIGN KEY (offer_id) REFERENCES offers(id);";

    public String queryRelationUsersCompanies = "ALTER TABLE users_companies DROP id, ADD PRIMARY KEY (user_id), ADD FOREIGN KEY (user_id) REFERENCES users(id);";
}

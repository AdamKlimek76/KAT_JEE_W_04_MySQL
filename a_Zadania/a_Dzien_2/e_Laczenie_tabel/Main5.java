package a_Zadania.a_Dzien_2.e_Laczenie_tabel;


public class Main5 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "SELECT cinemas.id, cinemas.name, cinemas.address FROM cinemas JOIN cinemas_movies\n" +
            "ON cinemas.id = cinemas_movies.cinemas_id WHERE cinemas_movies.movies_id=1;";
    public String query2 = "SELECT movies.id, movies.title, movies.director FROM movies JOIN cinemas_movies\n" +
            "ON movies.id = cinemas_movies.movies_id WHERE cinemas_movies.cinemas_id=1;";

}

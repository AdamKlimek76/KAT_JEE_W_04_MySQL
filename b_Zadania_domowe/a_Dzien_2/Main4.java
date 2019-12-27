package b_Zadania_domowe.a_Dzien_2;


import java.sql.*;

public class Main4 {

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex"
                + "?useSSL=false&characterEncoding=utf8", "root", "coderslab");
             PreparedStatement preStmt = conn.prepareStatement("SELECT * FROM cinemas JOIN screenings s ON cinemas.id = s.cinema_id\n" +
                     "JOIN movies m ON s.movie_id = m.id ORDER BY title;");) {

            ResultSet rs = preStmt.executeQuery();
            String previousMovieTitle = "";
            while (rs.next()) {
                String movieTitle = rs.getString("title");
                String cinemaName = rs.getString("name");
                if (!movieTitle.equals(previousMovieTitle)) {
                    String movieDescripton = rs.getString("description");
                    double movieRating = rs.getDouble("rating");
                    System.out.println("");
                    System.out.println("Film: " + movieTitle);
                    System.out.println("Opis filmu: " + movieDescripton);
                    System.out.println("Rating: " + movieRating);
                    System.out.println("Lista kin:");
                    System.out.println(cinemaName);
                } else {
                    System.out.println(cinemaName);
                }
                previousMovieTitle = movieTitle;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

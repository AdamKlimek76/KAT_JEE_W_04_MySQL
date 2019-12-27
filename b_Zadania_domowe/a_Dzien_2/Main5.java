package b_Zadania_domowe.a_Dzien_2;


import java.sql.*;

public class Main5 {

    public static void main(String[] args) {

        final String DB_URL = "jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false&characterEncoding=utf8";
        final String DB_USER = "root";
        final String DB_PASS = "coderslab";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement stat = conn.prepareStatement("SELECT name FROM cinemas GROUP BY name;");) {

            ResultSet rs = stat.executeQuery();
            while (rs.next()) {
                String cinemaName = rs.getString("name");
                System.out.println("Kino: " + cinemaName);
            }
            System.out.println("");
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement stat = conn.prepareStatement("SELECT name, title FROM cinemas JOIN screenings s ON cinemas.id = s.cinema_id\n" +
                     "JOIN movies m ON s.movie_id = m.id;");) {

            ResultSet rs = stat.executeQuery();
            String previousCinemaName = "";
            while (rs.next()) {
                String cinemaName = rs.getString("name");
                String movieTitle = rs.getString("title");
                if (!cinemaName.equals(previousCinemaName)) {
                    System.out.println("");
                    System.out.println("Kino: " + cinemaName);
                    System.out.println("Film: " + movieTitle);
                } else {
                    System.out.println("Film: " + movieTitle);
                }
                previousCinemaName = cinemaName;

            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement stat = conn.prepareStatement("SELECT * FROM movies JOIN screenings s on movies.id = s.movie_id;");) {

            ResultSet rs = stat.executeQuery();
            System.out.println("");
            while (rs.next()) {
                String movieTitle = rs.getString("title");
                String showTime = rs.getString("show_time");
                System.out.println("Film:" + movieTitle + " data i czas projekcji: " + showTime);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }

    }
}

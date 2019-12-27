package b_Zadania_domowe.a_Dzien_2;


import java.sql.*;
import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {

        final String DB_URL = "jdbc:mysql://localhost:3306/cinemas_ex_1?useSSL=false&characterEncoding=utf8";
        final String DB_USER = "root";
        final String DB_PASS = "coderslab";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement statement = conn.prepareStatement("select * from cinemas;");
        ) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getString(1) + " ");
                System.out.print(rs.getString(2) + " ");
                System.out.println(rs.getString(3));
            }

        } catch (
                SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Podaj id kina:");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("id musi być liczbą naturalna!");
            scan.next();
        }
        String cinemaId = scan.next();


        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement statement = conn.prepareStatement("select * from movies join cinemas_movies on movies.id = cinemas_movies.movies_id " +
                     "join cinemas on cinemas_movies.cinemas_id = cinemas.id where cinemas.id=?;");
        ) {
            statement.setString(1, cinemaId);
            ResultSet rs = statement.executeQuery();
            int i = 0;
            while (rs.next()) {
                System.out.print(rs.getString(1) + " ");
                System.out.print(rs.getString(2) + " ");
                System.out.print(rs.getString(3) + " ");
                System.out.println(rs.getString(3));
                i++;
            }
            if (i == 0) {
                System.out.println("Obecnie w kinie o id = " + cinemaId + " nie wyświetla się filmów.");
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Podaj id filmu:");
        while (!scan.hasNextInt()) {
            System.out.println("id musi być liczbą naturalna!");
            scan.next();
        }
        String movieId = scan.next();

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement statement = conn.prepareStatement("select * from cinemas_movies where movies_id=?;");
        ) {
            statement.setString(1, movieId);
            ResultSet rs = statement.executeQuery();
            int i = 0;
            while (rs.next()) {
                System.out.print("Seans nr " + (i + 1));
                System.out.println(" w kinie nr " + rs.getString("cinemas_movies.cinemas_id"));
                i++;
            }
            if (i == 0) {
                System.out.println("Obecnie nie wyświetla się filmu o id = " + movieId);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }


    }
}

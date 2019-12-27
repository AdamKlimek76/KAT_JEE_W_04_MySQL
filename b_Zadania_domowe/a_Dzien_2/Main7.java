package b_Zadania_domowe.a_Dzien_2;


import java.sql.*;
import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {

        final String DB_URL = "jdbc:mysql://localhost:3306/cinemas_ex_1?useSSL=false&characterEncoding=utf8";
        final String DB_USER = "root";
        final String DB_PASS = "coderslab";

        System.out.println("Podaj nazwę kina:");
        Scanner scan = new Scanner(System.in);
        String cinemaName = scan.nextLine();

        boolean isCinemaExist = true;

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement statement = conn.prepareStatement("select id from cinemas where name=?;");)
        {
            statement.setString(1, cinemaName);
            ResultSet rs = statement.executeQuery();
            int i = 0;
            while (rs.next()) {
                System.out.println("Kino o id " + rs.getString("cinemas.id"));
                i++;
            }
            if (i == 0) {
                isCinemaExist = false;
                System.out.println("Nie odnaleziono kina.");
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }


        if (isCinemaExist) {
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                 PreparedStatement statement = conn.prepareStatement("select * from movies join cinemas_movies on movies.id = cinemas_movies.movies_id " +
                         "join cinemas on cinemas_movies.cinemas_id = cinemas.id where cinemas.name=?;");)
            {
                statement.setString(1, cinemaName);
                ResultSet rs = statement.executeQuery();
                int i = 0;
                while (rs.next()) {
                    System.out.println("* Film o id " + rs.getString("movies.id"));
                    i++;
                }
                if (i == 0) {
                    System.out.println("Obecnie w kinie nie wyświetlamy żadnych filmów.");
                }
            } catch (
                    SQLException e) {
                e.printStackTrace();
            }
        }

    }
}



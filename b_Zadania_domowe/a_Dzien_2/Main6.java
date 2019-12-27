package b_Zadania_domowe.a_Dzien_2;


import java.sql.*;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {

        System.out.println("Podaj tytuł filmu:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex"
                + "?useSSL=false&characterEncoding=utf8", "root", "coderslab");
             PreparedStatement statement = conn.prepareStatement("SELECT * FROM movies WHERE title LIKE ?");) {
            statement.setString(1, str);
            ResultSet rs = statement.executeQuery();
            int i = 0;
            while (rs.next()) {
                System.out.print(rs.getString("title") + " ");
                System.out.print(rs.getString("description") + " ");
                System.out.println(rs.getString("rating"));
                i++;
            }
            if (i == 0) {
                System.out.println("Nie odnaleziono filmu.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}

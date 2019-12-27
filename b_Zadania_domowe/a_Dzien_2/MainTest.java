package b_Zadania_domowe.a_Dzien_2;

import java.sql.*;

public class MainTest {

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/offers_ex"
                + "?useSSL=false&characterEncoding=utf8", "root", "coderslab");) {
            PreparedStatement preStmt = conn.prepareStatement("SELECT * FROM offers WHERE title LIKE ?");
            String promoted = "%Stark%";
            //int id =10;
            preStmt.setString(1, promoted);
            ResultSet rs = preStmt.executeQuery();
            while (rs.next()) {
                String title = rs.getString("title");
                int promoted1 = rs.getInt("promoted");
                Date date_exp = rs.getDate("expire");
                System.out.println(promoted1 + " " + title + " " + date_exp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}

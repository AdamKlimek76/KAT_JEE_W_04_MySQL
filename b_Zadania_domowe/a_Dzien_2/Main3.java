package b_Zadania_domowe.a_Dzien_2;


import java.sql.*;

public class Main3 {

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex"
                + "?useSSL=false&characterEncoding=utf8", "root", "coderslab");
             Statement stat = conn.createStatement()) {
            String sql = "create table screenings\n" +
                    "(\n" +
                    "    id          INT NOT NULL AUTO_INCREMENT,\n" +
                    "    cinema_id   INT NOT NULL,\n" +
                    "    movie_id    INT NOT NULL,\n" +
                    "    show_time   DATETIME,\n" +
                    "    PRIMARY KEY (id),\n" +
                    "    FOREIGN KEY (cinema_id) REFERENCES cinemas (id),\n" +
                    "    FOREIGN KEY (movie_id) REFERENCES movies (id)\n" +
                    ");";
            stat.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}

package b_Zadania_domowe.a_Dzien_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainRep {

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/firstbase?useSSL=false&characterEncoding=utf8",
                    "root",
                    "coderslab");
            System.out.println("Połączono z bazą danych");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

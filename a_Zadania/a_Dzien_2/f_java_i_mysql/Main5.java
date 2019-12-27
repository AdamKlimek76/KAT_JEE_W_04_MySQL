package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int movieId = scanner.nextInt();
        try (Connection conn = DBUtil.connect()) {
            DBUtil.remove(conn, "movies", movieId);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

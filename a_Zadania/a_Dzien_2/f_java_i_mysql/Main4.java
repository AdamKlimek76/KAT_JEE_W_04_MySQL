package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main4 {

    public static void main(String[] args) {

        try (Connection conn = DBUtil.connect()) {
            DBUtil.printData(conn, "SELECT * FROM movies;", "title", "rating");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try (Connection conn = DBUtil.connect()) {
            DBUtil.printData(conn, "SELECT * FROM cinemas WHERE id<10;", "id", "name");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}


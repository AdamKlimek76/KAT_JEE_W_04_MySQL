package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main6 {

    public static void main(String[] args) {

        try (Connection conn = DBUtil.connect()) {
            System.out.println(DBUtil.avgMovieRating(conn));
            DBUtil.getRatingAboveAvg(conn, DBUtil.avgMovieRating(conn));

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}

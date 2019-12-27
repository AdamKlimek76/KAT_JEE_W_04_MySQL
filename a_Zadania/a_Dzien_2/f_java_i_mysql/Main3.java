package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String cinemaName=scanner.nextLine();
        Scanner scanner1=new Scanner(System.in);
        String cinemaAddress=scanner1.nextLine();
        addCinema(cinemaName, cinemaAddress);
    }

    static void addCinema(String name, String address) {
        try (Connection conn = DBUtil.connect()) {
            DBUtil.insert(conn, "INSERT INTO cinemas(name, address) VALUES (?, ?)", name, address);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

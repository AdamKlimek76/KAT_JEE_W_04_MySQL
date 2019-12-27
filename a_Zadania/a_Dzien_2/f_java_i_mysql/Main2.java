package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main2 {

    public static void main(String[] args) {


        try (Connection conn = DBUtil.connect()) {
            DBUtil.insert(conn, "INSERT INTO categories(name) VALUES (?)", "aa");
            DBUtil.insert(conn, "INSERT INTO categories_sub(name, main_id) VALUES (?, ?)", "SUB_NAME", "1");
            DBUtil.insert(conn, "INSERT INTO clients(name, surname) VALUES (?, ?)", "Imie", "Nazwisko");
            DBUtil.insert(conn, "INSERT INTO client_adresses(city, street, house_nr) VALUES (?, ?, ?)", "miasto", "ulica", "1");
            DBUtil.insert(conn, "INSERT INTO opinions(id_product, description) VALUES (?, ?)", "1", "Opis do produktu 1");
            DBUtil.insert(conn, "INSERT INTO orders(description) VALUES (?)", "opis");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

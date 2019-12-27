package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main7 {


    public static void main(String[] args) {

        try (Connection conn = DBUtil.connect()) {
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM cinemas");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.print(resultSet.getString("id") + " ");
                System.out.print(resultSet.getString("name") + " ");
                System.out.println(resultSet.getString("address"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        int id = -1;
        System.out.println("Wpisz e - edycja, u - usunięcie lub x - wyście z programu:");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        while (!(str.equals("e") | str.equals("u") | str.equals("x"))) {
            System.out.println("Podałeś niepoprawną literę!");
            str = scan.next();
        }

        if (str.equals("e")) {
            System.out.println("Podaj id wiersza do edycji");
            while (!scan.hasNextInt()) {
                System.out.println("id wiersza musi być liczbą naturalną");
                scan.next();
            }
            id = scan.nextInt();
            scan.nextLine();
            System.out.println("Podaj nazwę kina:");
            String cinemaName = scan.nextLine();

            System.out.println("Podaj adres kina:");
            String cinemaAddress = scan.nextLine();


            try (Connection conn = DBUtil.connect()) {
                DBUtil.updateCinema(conn, id, cinemaName, cinemaAddress);
                DBUtil.showCinemas(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else if (str.equals("u")) {
            System.out.println("Podaj id wiersza do usunięcia");
            while (!scan.hasNextInt()) {
                System.out.println("id wiersza musi być liczbą naturalną");
                scan.next();
            }
            id = scan.nextInt();
            System.out.println("Czy usunąć wiersz o id = " + id + "? Wpisz t lub n.");
            String decision = scan.next();
            if (decision.equals("t")) {
                try (Connection conn = DBUtil.connect()) {
                    DBUtil.removeCinema(conn, id);
                    DBUtil.showCinemas(conn);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (decision.equals("n")) {
                System.out.println("Nie usuwamy wiersza.");
                try (Connection conn = DBUtil.connect()) {
                    DBUtil.showCinemas(conn);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Zły wybór - nie usuwamy wiersza i koniec programu.");
            }
        } else {
            System.out.println("Koniec programu");
        }
    }


}

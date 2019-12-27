package a_Zadania.a_Dzien_2.f_java_i_mysql;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class DBUtil {

    public static final String DB_URL = "jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false&characterEncoding=utf8";
    public static final String DB_USER = "root";
    public static final String DB_PASS = "coderslab";
    private static final String DELETE_QUERY = "DELETE FROM tableName where id = ?";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }


    public static void insert(Connection conn, String query, String... params) {
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                statement.setString(i + 1, params[i]);
                System.out.println(statement);
            }
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void printData(Connection conn, String query, String... params) throws SQLException {

        try (PreparedStatement statement = conn.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                for (String param : params) {
                    System.out.println(resultSet.getString(param));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void remove(Connection conn, String tableName, int id) {
        try (PreparedStatement statement =
                     conn.prepareStatement(DELETE_QUERY.replace("tableName", tableName));) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static double avgMovieRating(Connection conn) throws SQLException {

        double avgRating = 0;
        try (PreparedStatement statement = conn.prepareStatement("SELECT AVG(rating) FROM movies");
             ResultSet resultSet = statement.executeQuery();) {
            if (resultSet.next()) {
                avgRating = resultSet.getDouble(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return avgRating;
    }


    public static void getRatingAboveAvg(Connection conn, double avgRating) throws SQLException {

        try (PreparedStatement statement = conn.prepareStatement("SELECT * FROM movies WHERE rating>?");) {

            statement.setDouble(1, avgRating);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.print(resultSet.getString("id") + " ");
                System.out.print(resultSet.getString("title") + " ");
                System.out.println(resultSet.getString("rating"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void removeCinema(Connection conn, int id) {
        try (PreparedStatement statement =
                     conn.prepareStatement("DELETE FROM cinemas WHERE id=?");) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showCinemas(Connection conn) {
        try (PreparedStatement statement =
                     conn.prepareStatement("SELECT * FROM cinemas");) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.print(resultSet.getString("id") + " ");
                System.out.print(resultSet.getString("name") + " ");
                System.out.println(resultSet.getString("address"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void updateCinema(Connection conn, int id, String name, String address) {
        try (PreparedStatement statement =
                     conn.prepareStatement("update cinemas set name=?, address=? where id=?;");) {
            statement.setString(1, name);
            statement.setString(2, address);
            statement.setInt(3, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {

    private static final String URL = "jdbc:mysql://localhost:3306/service";
    private static final String USER = "root";
    private static final String PASSWORD = "Tennis00711";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Успешное подключение к базе данных!");
            // Ваш код для работы с базой данных здесь
        } catch (SQLException e) {
            System.err.println("Ошибка подключения к базе данных!");
            e.printStackTrace();
        }
    }
}


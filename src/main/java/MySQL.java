// Создал жтот класс в самом начале когда пытался подключиться к SQL через Idea, у меня в принципе получилось,
// но потом понял что жто мне не нужно)) но все равно пока оставил

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL {

    private static final String URL = "jdbc:mysql://localhost:3306/service";
    private static final String USER = "root";
    private static final String PASSWORD = "Tennis00711";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Успешное подключение к базе данных!");



        } catch (SQLException e) {
            System.err.println("Ошибка подключения к базе данных!");
            e.printStackTrace();
        }
    }
}





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

            // Создание объекта Statement для выполнения SQL-запросов
            try (Statement statement = connection.createStatement()) {
                // Создание таблицы Pets
                String createPetsTableQuery = "CREATE TABLE IF NOT EXISTS Pets ("
                        + "ID INT AUTO_INCREMENT PRIMARY KEY,"
                        + "Name VARCHAR(255),"
                        + "Type VARCHAR(255),"
                        + "BirthDate DATE,"
                        + "Commands VARCHAR(255)"
                        + ")";
                statement.executeUpdate(createPetsTableQuery);
                System.out.println("Таблица Pets создана успешно!");

                // Создание таблицы PackAnimals
                String createPackAnimalsTableQuery = "CREATE TABLE IF NOT EXISTS PackAnimals ("
                        + "ID INT AUTO_INCREMENT PRIMARY KEY,"
                        + "Name VARCHAR(255),"
                        + "Type VARCHAR(255),"
                        + "BirthDate DATE,"
                        + "Commands VARCHAR(255)"
                        + ")";
                statement.executeUpdate(createPackAnimalsTableQuery);
                System.out.println("Таблица PackAnimals создана успешно!");

                // Заполнение таблицы Pets данными
                String insertIntoPetsQuery = "INSERT INTO Pets (Name, Type, BirthDate, Commands) VALUES "
                        + "('Artur', 'Dog', '2020-01-01', 'Sit, Stay, Fetch'),"
                        + "('Ilya', 'Cat', '2019-05-15', 'Sit, Pounce'),"
                        + "('Masha', 'Hamster', '2021-03-10', 'Roll, Hide'),"
                        + "('Emir', 'Dog', '2018-12-10', 'Sit, Paw, Bark')";
                statement.executeUpdate(insertIntoPetsQuery);
                System.out.println("Данные в таблицу Pets добавлены успешно!");

                // Заполнение таблицы PackAnimals данными
                String insertIntoPackAnimalsQuery = "INSERT INTO PackAnimals (Name, Type, BirthDate, Commands) VALUES "
                        + "('Kate', 'Horse', '2015-07-21', 'Trot, Canter, Gallop'),"
                        + "('Sasha', 'Camel', '2016-11-03', 'Walk, Carry Load'),"
                        + "('Alex', 'Donkey', '2017-09-18', 'Walk, Carry Load, Bray'),"
                        + "('Messi', 'Horse', '2014-05-05', 'Trot, Canter'),"
                        + "('Ovechkin', 'Camel', '2018-12-12', 'Walk, Sit'),"
                        + "('Biden', 'Donkey', '2019-01-23', 'Walk, Bray, Kick')";
                statement.executeUpdate(insertIntoPackAnimalsQuery);
                System.out.println("Данные в таблицу PackAnimals добавлены успешно!");
            }

        } catch (SQLException e) {
            System.err.println("Ошибка подключения к базе данных!");
            e.printStackTrace();
        }
    }
}




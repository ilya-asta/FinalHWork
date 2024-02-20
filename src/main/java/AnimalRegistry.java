import java.util.Scanner;

public class AnimalRegistry {
    public static void main(String[] args){
        try (Counter counter = new Counter(); Scanner scanner = new Scanner(System.in)) {
            System.out.println("Добро пожаловать в реестр домашних животных!");

            while (true) {
                System.out.println("Меню:");
                System.out.println("1. Завести новое животное");
                System.out.println("2. Определить животное в правильный класс");
                System.out.println("3. Увидеть список команд, которое выполняет животное");
                System.out.println("4. Обучить животное новым командам");
                System.out.println("5. Выход");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Чтение символа новой строки

                switch (choice) {
                    case 1:
                        System.out.println("Введите имя нового животного:");
                        String name = scanner.nextLine();
                        System.out.println("Введите возраст нового животного:");
                        int age = scanner.nextInt();
                        scanner.nextLine(); // Чтение символа новой строки

                        System.out.println("Животное успешно добавлено в реестр!");
                        break;
                    case 2:
                        // Логика определения животного в правильный класс
                        break;
                    case 3:
                        // Логика просмотра списка команд животного
                        break;
                    case 4:
                        // Логика обучения животного новым командам
                        break;
                    case 5:
                        System.out.println("Выход из программы.");
                        return;
                    default:
                        System.out.println("Некорректный ввод. Попробуйте снова.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Класс AnimalRegistry представляет собой программу для регистрации домашних животных.
 * Пользователь может заводить новых животных, определять их класс, просматривать список команд,
 * которые выполняют животные, а также обучать животных новым командам.
 */
public class AnimalRegistry {
    // Список для хранения всех животных
    // Переменная animals хранит список всех животных в реестре
    private static List<Animal> animals = new ArrayList<>();

    // Метод для вывода списка всех животных
    private static void showAllAnimals() {
        System.out.println("Список всех животных:");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " - возраст: " + animal.getAge());
        }
    }

    // Метод для сохранения списка всех животных в файл
    private static void saveAnimalsToFile() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("animals.ser"))) {
            outputStream.writeObject(animals);
            System.out.println("Список всех животных сохранен в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении списка животных: " + e.getMessage());
        }
    }

    /**
     * Основной метод программы, запускающий регистрацию домашних животных.
     * @param args параметры командной строки (не используются)
     */
    public static void main(String[] args) {
        // Переменная counter создает счетчик для отслеживания количества животных
        try (Counter counter = new Counter(); Scanner scanner = new Scanner(System.in)) {
            System.out.println("Добро пожаловать в реестр домашних животных!");

            // Основной цикл программы
            while (true) {
                System.out.println("Меню:");
                System.out.println("1. Завести новое животное");
                System.out.println("2. Определить животное в правильный класс");
                System.out.println("3. Увидеть список команд, которое выполняет животное");
                System.out.println("4. Обучить животное новым командам");
                System.out.println("5. Выход");
                // Получаем выбор пользователя
                int choice = scanner.nextInt();
                scanner.nextLine(); // Чтение символа новой строки
                // Обработка выбора пользователя
                switch (choice) {
                    case 1:
                        try (Counter unusedCounter = new Counter()) {
                            System.out.println("Введите имя нового животного:");
                            String name = scanner.nextLine();
                            System.out.println("Введите возраст нового животного:");
                            int age = scanner.nextInt();
                            scanner.nextLine(); // Чтение символа новой строки

                            animals.add(new Pet(name, age));
                            System.out.println("Животное успешно добавлено в реестр!");
                        } catch (Exception e) {
                            throw new RuntimeException("Ошибка: работа с объектом счетчика была не в ресурсном try или ресурс остался открыт.");
                        }
                        break;
                    case 2:
                        System.out.println("Введите имя животного для определения его класса:");
                        String animalName2 = scanner.nextLine(); // Переименовываем переменную, чтобы избежать конфликта имени

                        boolean found2 = false; // Переименовываем переменную, чтобы избежать конфликта имени
                        for (Animal animal : animals) {
                            if (animal.getName().equals(animalName2)) {
                                if (animal instanceof Pet) {
                                    System.out.println(animal.getName() + " - домашнее животное.");
                                } else if (animal instanceof PackAnimals) {
                                    System.out.println(animal.getName() + " - вьючное животное.");
                                } else {
                                    System.out.println(animal.getName() + " - тип животного не определен.");
                                }
                                found2 = true; // Переименовываем переменную, чтобы избежать конфликта имени
                                break;
                            }
                        }

                        if (!found2) {
                            System.out.println("Животное с таким именем не найдено.");
                        }
                        break;

                    case 3:
                        System.out.println("Введите имя животного для просмотра списка его команд:");
                        String animalName3 = scanner.nextLine(); // Переименовываем переменную, чтобы избежать конфликта имени

                        boolean found3 = false; // Переименовываем переменную, чтобы избежать конфликта имени
                        for (Animal animal : animals) {
                            if (animal.getName().equals(animalName3)) {
                                if (animal instanceof Pet) {
                                    Pet pet = (Pet) animal;
                                    List<String> commands = pet.getCommands();
                                    if (commands.isEmpty()) {
                                        System.out.println("У этого животного нет команд.");
                                    } else {
                                        System.out.println("Список команд для животного " + animalName3 + ":");
                                        for (String command : commands) {
                                            System.out.println("- " + command);
                                        }
                                    }
                                } else {
                                    System.out.println("У этого вьючного животного нет команд.");
                                }
                                found3 = true; // Переименовываем переменную, чтобы избежать конфликта имени
                                break;
                            }
                        }

                        if (!found3) {
                            System.out.println("Животное с таким именем не найдено.");
                        }
                        break;

                    case 4:
                        System.out.println("Введите имя животного для обучения новой команде:");
                        String animalName4 = scanner.nextLine(); // Переименовываем переменную, чтобы избежать конфликта имени

                        boolean found4 = false; // Переименовываем переменную, чтобы избежать конфликта имени
                        for (Animal animal : animals) {
                            if (animal.getName().equals(animalName4)) {
                                System.out.println("Введите новую команду для обучения:");
                                String newCommand = scanner.nextLine();
                                if (animal instanceof Pet) {
                                    Pet pet = (Pet) animal;
                                    pet.learnCommand(newCommand);
                                    System.out.println("Новая команда успешно добавлена для животного " + animalName4 + ".");
                                } else {
                                    System.out.println("Вьючные животные не обучаются командам.");
                                }
                                found4 = true; // Переименовываем переменную, чтобы избежать конфликта имени
                                break;
                            }
                        }

                        if (!found4) {
                            System.out.println("Животное с таким именем не найдено.");
                        }
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



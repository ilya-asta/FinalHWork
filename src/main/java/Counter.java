/**
 * Класс Counter представляет собой счетчик для отслеживания количества животных в реестре.
 * Он реализует интерфейс AutoCloseable для использования в блоке try-with-resources.
 */
public class Counter implements AutoCloseable{
    private static int count =0;
    /**
     * Конструктор класса, увеличивает значение счетчика при создании нового объекта.
     */
    public Counter(){
        count++;
    }
    /**
     * Метод add() увеличивает значение счетчика на 1.
     */
    public void add() {
        count++;
    }
    /**
     * Метод getCount() возвращает текущее значение счетчика.
     * @return текущее значение счетчика
     */
    public static int getCount(){
        return count;
    }
    /**
     * Метод close() уменьшает значение счетчика при закрытии объекта.
     */
    @Override
    public void close() throws Exception {
        count--;
    }
}

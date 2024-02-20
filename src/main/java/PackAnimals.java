public class PackAnimals extends Animal {
    public PackAnimals(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void performCommand(String command) {
        System.out.println(name + " выполняет команду: " + command);
    }
}

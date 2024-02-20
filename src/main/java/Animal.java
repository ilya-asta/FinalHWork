public abstract class Animal {
    protected String name;
    protected Integer age;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public abstract void performCommand(String command);

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

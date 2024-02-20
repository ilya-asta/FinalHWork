import java.util.ArrayList;
import java.util.List;

public class Pet extends Animal{
    private List<String> commands;
    public Pet(String name, Integer age) {
        super(name, age);
        this.commands = new ArrayList<>();
    }

    @Override
    public void performCommand(String command) {
        System.out.println(name + "Выполняет команду" + command);
    }
    public void learnCommand(String command){
        commands.add(command);
    }
    public List<String> getCommands(){
        return commands;
    }
}

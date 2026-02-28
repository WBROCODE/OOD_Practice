package SimpleLightController.Command;

public class MacroCommand implements Command{
    Command[] commands;
    String name;
    public MacroCommand(Command[] commands){
        this.commands = commands;
        this.name = "Macro Command";
    }

    @Override
    public void excute() {
        for(Command command : commands){
            command.excute();
        }
    }

    @Override
    public void undo() {
        for(int i = commands.length - 1; i >= 0; i--){
            commands[i].undo();
        }
    }

    @Override
    public String getName() {
        return name;
    }
}

package SimpleLightController.Command;

public class NoCommand implements Command{
    @Override
    public void excute() {}
    @Override
    public String getName(){
        return "No Command";
    }
    @Override
    public void undo() {}
}

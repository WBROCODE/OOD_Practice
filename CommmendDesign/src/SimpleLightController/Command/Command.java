package SimpleLightController.Command;

public interface Command {
    public void excute();
    // undo
    public void undo();
    public String getName();
}

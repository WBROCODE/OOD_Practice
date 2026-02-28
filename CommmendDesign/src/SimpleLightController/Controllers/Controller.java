package SimpleLightController.Controllers;

import SimpleLightController.Command.Command;
import SimpleLightController.Command.LightOffCommand;
import SimpleLightController.Command.LightOnCommand;
import SimpleLightController.Command.NoCommand;

public class Controller {
    Command[] commandOn;
    Command[] commandOff;
    Command undoCommand;
    public Controller(){
        commandOn = new Command[9];
        commandOff = new Command[9];

        for (int i = 0; i < 9; i++) {
            Command noCommand = new NoCommand();
            commandOn[i] = noCommand;
            commandOff[i] = noCommand;
        }
        undoCommand = new NoCommand();
    }

    public void setCommand(Command on, Command off, int index){
        // on
        commandOn[index] = on;
        // off
        commandOff[index] = off;
    }
    // on
    public void executeCommandOn(int index){
        if(commandOn[index] != null){
            commandOn[index].excute();
        }
        undoCommand = commandOn[index];
    }
    // off
    public void executeCommandOff(int index){
        if(commandOff[index] != null){
            commandOff[index].excute();
        }
        undoCommand = commandOff[index];
    }

    public void executeUndo(){
        undoCommand.undo();
    }

    // to String
    public void printPortal(){
        System.out.println("----------Controller----------");
        for(int i = 0; i < commandOn.length; i++){
            System.out.println(
                    (i + 1) + " ON: " + commandOn[i].getName()
                                + " OFF: " + commandOff[i].getName()
            );
        }
        System.out.println("Undo: " + undoCommand.getName());
    }
}

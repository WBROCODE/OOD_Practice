package SimpleLightController.Command;

import SimpleLightController.Objects.Light;

public class LightOnCommand implements Command{
    Light light;
    String name;
    public LightOnCommand(Light light){
        this.light = light;
        this.name = "Light On Command";
    }
    @Override
    public void excute() {
        light.on();
    }
    @Override
    public void undo() {
        light.off();
    }
    @Override
    public String getName(){
        return name;
    }

}

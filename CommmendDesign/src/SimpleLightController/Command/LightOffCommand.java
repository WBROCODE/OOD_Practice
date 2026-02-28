package SimpleLightController.Command;

import SimpleLightController.Objects.Light;

public class LightOffCommand implements Command{
    Light light;
    String name;
    public LightOffCommand(Light light){
        this.light = light;
        this.name = "Light Off Command";
    }
    @Override
    public void excute() {
        light.off();
    }
    @Override
    public void undo() {
        light.on();
    }
    @Override
    public String getName(){
        return name;
    }


}

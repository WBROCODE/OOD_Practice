package SimpleLightController.Command;

import SimpleLightController.Objects.Stereo;

public class StereoOnCommand implements Command{
    Stereo stereo;
    String name;
    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
        this.name = "Stereo On Command";
    }
    @Override
    public void excute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(5);
    }
    @Override
    public void undo() {
        stereo.off();
    }
    @Override
    public String getName(){
        return name;
    }
}

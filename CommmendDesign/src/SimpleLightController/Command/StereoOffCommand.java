package SimpleLightController.Command;

import SimpleLightController.Objects.Stereo;

public class StereoOffCommand implements Command{
    Stereo stereo;
    String name;
    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
        this.name = "Stereo Off Command";
    }
    @Override
    public void excute() {
        stereo.off();
    }
    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(5);
    }
    @Override
    public String getName(){
        return name;
    }
}

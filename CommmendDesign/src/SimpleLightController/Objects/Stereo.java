package SimpleLightController.Objects;

public class Stereo {
    private String location;
    public Stereo(String location){
        this.location = location;
    }
    public void on(){
        System.out.println(location + " Stereo is on");
    }
    public void setCD(){
        System.out.println(location + " Stereo is set CD");
    }
    public void setVolume(int volume){

        System.out.println(location+" Stereo is set volume to " + volume);
    }
    public void off(){
        System.out.println(location + "Stereo is off");
    }
}




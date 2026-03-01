package HomeTheater.Objects.Lights;

public class TheaterLights {
    private static final String name = "TheaterLights";
    public void on(){
        System.out.println( name + " is on");
    }

    public void off(){
        System.out.println( name + " is off");
    }

    public void dim(int level){
        System.out.println( name + " is dimmed to " + level);
    }

    @Override
    public String toString(){
        return name;
    }
}

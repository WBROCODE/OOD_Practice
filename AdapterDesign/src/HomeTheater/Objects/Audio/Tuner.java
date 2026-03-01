package HomeTheater.Objects.Audio;

public class Tuner {
    private static final String name = "Tuner";
    private Amplifier amplifier;

    public Tuner(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println( name + " is on");
    }

    public void off() {
        System.out.println( name + " is off");
    }

    public void setFrequency(int frequency) {
        System.out.println( name + " frequency is set to " + frequency);
    }

    public void setAm(int am) {
        System.out.println( name + " am is set to " + am);
    }

    public void setFm(int fm) {
        System.out.println( name + " fm is set to " + fm);
    }

    @Override
    public String toString() {
        return name;
    }
}

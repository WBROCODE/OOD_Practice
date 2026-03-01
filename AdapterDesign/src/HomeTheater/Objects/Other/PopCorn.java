package HomeTheater.Objects.Other;

public class PopCorn {
    private static final String name = "PopCorn";

    public void on(){
        System.out.println(name + " is on");
    }

    public void off(){
        System.out.println(name + " is off");
    }

    public void pop(){
        System.out.println(name + " is popping");
    }

    @Override
    public String toString() {
        return name;
    }
}

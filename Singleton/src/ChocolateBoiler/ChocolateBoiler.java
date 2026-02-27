package ChocolateBoiler;

public class ChocolateBoiler {
    // single thread
    private boolean empty;
    private boolean boiled;
    // need to set constructor to private
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    private static ChocolateBoiler instance;

    public static ChocolateBoiler getInstance() {
        if(instance == null) {
            instance = new ChocolateBoiler();
            return instance;
        }else return instance;
    }


    // fill
    public void fill() {
        if(isEmpty()){
            empty = false;
            boiled = false;
            System.out.println("Start to fill the boiler");
        }
    }

    // drain
    public void drain() {
        if(!isEmpty() && isBoiled()){
            empty = true;
            System.out.println("Start to drain the boiler");
        }
    }

    // boil
    public void boil() {
        if(!isEmpty() && !isBoiled()){
            boiled = true;
            System.out.println("Start to boil the chocolate");
        }
    }


    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}

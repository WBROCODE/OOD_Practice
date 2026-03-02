package Types;

public abstract class CaffineDrink {

    public void prepareRecipe() {
        boilliquid();
        brew();
        putItInCup();
        if(customerWantsCondiment()){
            addCondiment();
        }
    }

    public void boilliquid() {
        System.out.println("Boil water");
    }

    public abstract void brew();

    public void putItInCup() {
        System.out.println("Put it in cup");
    }

    public abstract void addCondiment();

    public abstract boolean customerWantsCondiment();
}

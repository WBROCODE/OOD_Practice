package Comparator;

public class GreaterComparator<T extends Number> implements Comparator<T> {
    @Override
    public boolean isMatch(T one, T two){
        return Double.compare(one.doubleValue(), two.doubleValue()) > 0.0;
    }
}

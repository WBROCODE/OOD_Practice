package Comparator;

import java.util.Objects;

public class EqualComparator<T> implements Comparator<T> {
    @Override
    public boolean isMatch(T one, T two){
        return Objects.equals(one, two);
    }
}

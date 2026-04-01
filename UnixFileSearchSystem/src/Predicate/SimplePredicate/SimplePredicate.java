package Predicate.SimplePredicate;

import Comparator.Comparator;
import File.File;
import File.FileAttribute;
import Predicate.Predicate;

public class SimplePredicate<T> implements Predicate{
    
    private final FileAttribute fa;
    private final Comparator comparator;
    T comparedV;

    public SimplePredicate(FileAttribute fa, Comparator comparator, T comparedV){
        this.fa = fa;
        this.comparator = comparator;
        this.comparedV = comparedV;
    }   

    @Override
    public boolean isMatch(File file){
        Object typObject = file.extract(fa);
        if(comparedV.getClass().isInstance(typObject)){
            return comparator.isMatch(typObject, comparedV);
        }else return false;
    }
}

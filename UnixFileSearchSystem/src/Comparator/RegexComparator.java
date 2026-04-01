package Comparator;

import java.util.regex.Pattern;

public class RegexComparator<T extends String> implements Comparator<T> {
    @Override
    public boolean isMatch(T one, T two){
        final Pattern p = Pattern.compile(two);
        return p.matcher(one).matches();
    }
}
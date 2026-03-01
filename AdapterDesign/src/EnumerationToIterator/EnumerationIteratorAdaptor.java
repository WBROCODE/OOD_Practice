package EnumerationToIterator;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Objects;

public class EnumerationIteratorAdaptor implements Iterator<Object>{
    Enumeration<?> enumeration;

    public EnumerationIteratorAdaptor(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }
    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }
    @Override
    public Object next() {
        return  enumeration.nextElement();
    }
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

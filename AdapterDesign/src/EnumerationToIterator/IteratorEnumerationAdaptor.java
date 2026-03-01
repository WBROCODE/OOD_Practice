package EnumerationToIterator;

import java.util.Enumeration;
import java.util.Iterator;

//   Iterator to Enumeration
public class IteratorEnumerationAdaptor implements Enumeration<Object> {
    Iterator<?> iterator;

    public IteratorEnumerationAdaptor(Iterator<?> iterator) {
        this.iterator = iterator;
    }
    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }
    @Override
    public Object nextElement() {
        return iterator.next();
    }

}

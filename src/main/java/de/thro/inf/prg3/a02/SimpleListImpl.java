package de.thro.inf.prg3.a02;

import java.util.Iterator;

/**
 * @author Peter Kurfer
 * Created on 10/6/17.
 */
public class SimpleListImpl implements SimpleList, Iterable {


    @Override
    public void add(Object o) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public SimpleList filter(SimpleFilter filter) {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    private static class Element{
        Object item;
        Element next;
    }

    class SimpleIteratorImpl implements Iterator{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}

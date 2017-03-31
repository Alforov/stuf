package com.cs.alf.patterns.behavioral.iterator;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * Created by root1 on 28.03.17.
 */
public class IterableEntity <T> implements Iterable<T> {
    public static final int  INITIAL_ARRAY_LENGTH =10;
    private final T[] a =  (T[])new Integer[INITIAL_ARRAY_LENGTH]; //todo wrong type need to fix

    public T[] getA() {
        return a;
    }

    private class EntityIterator implements Iterator<T> {
        int head = 0;
        int end = a.length - 1;
        int next = -1;

        @Override
        public boolean hasNext() {
            return head < end;
        }

        @Override
        public T next() {
            if(!hasNext()) throw new NoSuchElementException();
            next = head;
            return a[head++];
        }

        @Override
        public void remove() {
          if(next == -1){
              throw new ConcurrentModificationException();
          }
          a[next] = null;
          next = -1;
        }

    }

    @Override
    public Iterator iterator() {
        return new EntityIterator();
    }
}

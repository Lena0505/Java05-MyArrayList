package org.example;

import java.util.*;

public class MyArrayList<E> implements List<E> {
    static int INITIAL_SIZE = 16;
    static  int stepsize = 16;
    private E[] internalArray;
    private int iMax;

    MyArrayList() {
        this.internalArray = (E[])new Object[INITIAL_SIZE];
        this.iMax = -1;
    }

    @Override
    public int size() {
        return this.iMax+1;
    }

    @Override
    public boolean isEmpty() {
        throw new RuntimeException();
        //return false;
    }

    @Override
    public boolean contains(Object o) {
        throw new RuntimeException();
        //return false;
    }

    @Override
    public Iterator<E> iterator() {
        throw new RuntimeException();
        //return null;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(this.internalArray,iMax+1);
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new RuntimeException();
        //return null;
    }

    @Override
    public boolean add(E t) {
        if (this.internalArray.length == (this.iMax+1)) {
            this.internalArray = Arrays.copyOf(this.internalArray,this.internalArray.length + stepsize);
        }
        this.internalArray[++this.iMax] = t;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        throw new RuntimeException();
        //return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new RuntimeException();
        //return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new RuntimeException();
        //return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new RuntimeException();
        //return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new RuntimeException();
        //return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new RuntimeException();
        //return false;
    }

    @Override
    public void clear() {
        throw new RuntimeException();
    }

    @Override
    public E get(int index) {
        if (index >=0 && index <= this.iMax) {
            return this.internalArray[index];
        }
        else {
           throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index > iMax) {
            throw new IndexOutOfBoundsException();
        }
        E oldEl = internalArray[index];
        internalArray[index] = element;

        return oldEl;
    }

    @Override
    public void add(int index, E element) {
        throw new RuntimeException();
    }

    @Override
    public E remove(int index) {
        throw new RuntimeException();
        //return null;
    }

    @Override
    public int indexOf(Object o) {
        throw new RuntimeException();
        //return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new RuntimeException();
        //return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return new MyArrayListIterator();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new RuntimeException();
        //return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new RuntimeException();
        //return null;
    }

    public String toString() {
        if (this.iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(String.valueOf(this.internalArray[i]));
            if (i == this.iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    private class MyArrayListIterator implements ListIterator<E> {

        private int cursor;

        MyArrayListIterator() {
            this.cursor = -1;
        }

        @Override
        public boolean hasNext() {
            return cursor != iMax;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.cursor++;
            return (E)internalArray[this.cursor];
        }

        @Override
        public boolean hasPrevious() {
            return cursor != 0;
        }

        @Override
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            this.cursor--;
            return (E)internalArray[this.cursor];
        }

        @Override
        public int nextIndex() {
            return this.cursor + 1;
        }

        @Override
        public int previousIndex() {
            return this.cursor - 1;
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(cursor);
        }

        @Override
        public void set(E t) {
            MyArrayList.this.set(cursor,t);
        }

        @Override
        public void add(E t) {
            MyArrayList.this.add(t);
        }
    }
}

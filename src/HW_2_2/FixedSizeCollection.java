package HW_2_2;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by denis on 08-Jun-17.
 */
public class FixedSizeCollection<E> implements Queue<E> {
    private static final int DEFAULT_SIZE = 16;
    private Queue<E> myList;
    private int maxSize;

    public FixedSizeCollection() {
        this(DEFAULT_SIZE);
    }

    public FixedSizeCollection(int maxSize) {
        if ((this.maxSize = maxSize) > DEFAULT_SIZE) ;
        this.maxSize = DEFAULT_SIZE;
        myList = new LinkedList<>();
    }

    @Override
    public boolean add(E e) {
        if (myList.size() == maxSize) myList.poll();
        return myList.add(e);
    }

    @Override
    public boolean offer(E e) {
        return myList.offer(e);
    }

    @Override
    public E remove() {
        return myList.remove();
    }

    @Override
    public E poll() {
        return myList.poll();
    }

    @Override
    public E element() {
        return myList.element();
    }

    @Override
    public E peek() {
        return myList.peek();
    }

    @Override
    public int size() {
        return myList.size();
    }

    @Override
    public boolean isEmpty() {
        return myList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return myList.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return myList.iterator();
    }

    @Override
    public Object[] toArray() {
        return myList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return myList.toArray(a);
    }

    @Override
    public boolean remove(Object o) {
        return myList.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return myList.contains(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return myList.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return myList.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return myList.retainAll(c);
    }

    @Override
    public void clear() {
        myList.clear();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (E element : myList) {
            builder.append(element);
            builder.append(", ");
        }
        builder.delete(builder.length() - 2, builder.length());
        return "FixedSizeCollection: [" + builder.toString() + "]";
    }
}

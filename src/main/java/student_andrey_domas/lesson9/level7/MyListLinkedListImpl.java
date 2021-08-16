package student_andrey_domas.lesson9.level7;

import student_andrey_domas.lesson9.level1.MyList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;


public class MyListLinkedListImpl<T> implements MyList<T> {

    private LinkedListElement<T> first = null;
    private LinkedListElement<T> last = null;

    public MyListLinkedListImpl(Iterable<T> iterable) {
        for (T t: iterable)
            add(t);
    }

    public MyListLinkedListImpl(T[] array) {
        for (T t: array)
            add(t);
    }

    @Override
    public void add(T t) {
        LinkedListElement<T> newEl =  new LinkedListElement<>(t, last, null);
        if (first == null)
            first = newEl;
        if (last != null)
            last.next = newEl;
        last = newEl;
    }

    @Override
    public void remove(T t) {
        LinkedListElement<T> e = first;
        while (e != null) {
            if (Objects.equals(t, e.object)) {
                if (e.prev != null)
                    e.prev.next = e.next;
                else
                    first = e.next;
                return;
            }
            e = e.next;
        }
    }

    @Override
    public T pop(int index) {
        int idx = 0;
        for (T o: this) {
            if (idx++ == index) {
                T object = o;
                remove(o);
                return object;
            }
        }
        return null;
    }

    @Override
    public int index(T t) {
        int idx = -1;
        for (T o: this) {
            idx++;
            if (Objects.equals(t, o))
                return idx;
        }
        return -1;
    }

    @Override
    public void extend(MyList<T> listT) {
        if (Objects.isNull(listT))
            return;
        if (listT instanceof MyListLinkedListImpl<T>) {
            MyListLinkedListImpl<T> listTLL = (MyListLinkedListImpl<T>) listT;
            if (Objects.isNull(first)) {
                first = listTLL.first;
                last = listTLL.last;
            }
            else
                last.next = listTLL.first;
        } else {
            for(T t: listT)
                add(t);
        }
    }

    @Override
    public void clear() {
        first = null;
    }

    @Override
    public int size() {
        int size = 0;
        for (Iterator<T> i = iterator(); i.hasNext(); i.next())
            size++;
        return size;
    }

    @Override
    public T[] toArray() {
        T array[] = (T[]) new Object[size()];
        int i = 0;
        for (Iterator<T> it = iterator(); it.hasNext();)
            array[i++] = it.next();
        return array;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            LinkedListElement<T> e = first;

            @Override
            public boolean hasNext() {
                return e != null;
            }

            @Override
            public T next() {
                if (e == null)
                    throw new NoSuchElementException();
                T object = e.object;
                e = e.next;
                return object;
            }
        };
    }

}

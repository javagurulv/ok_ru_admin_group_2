package student_andrey_domas.lesson9.level7;

import student_andrey_domas.lesson9.level1.MyList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MyListArrayImpl<T> implements MyList<T> {

    private T list[];

    public MyListArrayImpl(Iterable<T> iterable) {
        this();
        for (T t: iterable)
            add(t);
    }

    public MyListArrayImpl(T[] array) {
        this();
        for (T t: array)
            add(t);
    }

    public MyListArrayImpl() {
        clear();
    }

    @Override
    public void add(T t) {
        list = Arrays.copyOf(list, list.length + 1);
        list[list.length - 1] = t;
    }

    @Override
    public void remove(T t) {
        pop(index(t));
    }

    @Override
    public T pop(int index) {
        T element = null;

        try {
            element = list[index];
        } catch (IndexOutOfBoundsException e) {
        }

        if (index >= 0 && index < list.length) {
            T newList[] = instantiateNewList(list.length - 1);
            System.arraycopy(list, 0, newList, 0, index);
            System.arraycopy(list, index + 1, newList, index, list.length - index - 1);
            list = newList;
        }

        return element;
    }

    @Override
    public int index(T t) {
        for (int i = 0; i < list.length; i++)
            if (Objects.equals(t, list[i]))
                return i;
        return -1;
    }

    @Override
    public void extend(MyList<T> listT) {
        if (Objects.isNull(listT))
            return;
        T newList[] = instantiateNewList(list.length + listT.size());
        System.arraycopy(list, 0, newList, 0, list.length);
        if (listT instanceof MyListArrayImpl) {
            System.arraycopy(listT.toArray(), 0, newList, list.length, listT.size());
        } else {
            int i = list.length;
            for(T t: listT)
                newList[i++] = t;
        }
        list = newList;
    }

    private T[] instantiateNewList(int length) {
        return (T[]) new Object[length];
    }

    @Override
    public void clear() {
        list = instantiateNewList(0);
    }

    @Override
    public int size() {
        return list.length;
    }

    @Override
    public T[] toArray() {
        return list;
    }

    @Override
    public Iterator<T> iterator() {
        return Arrays.stream(list).iterator();
    }
}

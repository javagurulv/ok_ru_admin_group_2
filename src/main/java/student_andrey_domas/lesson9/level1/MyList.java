package student_andrey_domas.lesson9.level1;

public interface MyList<T> extends Iterable<T> {
    /**
     * Add an element to the list.
     * @param t element
     */
    void add(T t);

    /**
     * Remove an element from the list.
     * @param t element
     */
    void remove(T t);

    /**
     * Return an element by the index and remove it from the list.
     * @param index
     * @return element by the index or null
     */
    T pop(int index);

    /**
     * Find index of an element by the value.
     * @param t
     * @return index of the first element occurrence or -1
     */
    int index(T t);

    /**
     * Extend the list by another one (Append all elements from a given list to this).
     * @param listT another one list
     */
    void extend(MyList<T> listT);

    /**
     * Clean up the list.
     */
    void clear();

    /**
     * @return size of the list.
     */
    int size();

    /**
     * @return array representation of the list.
     */
    T[] toArray();
}

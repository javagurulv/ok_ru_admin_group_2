package student_andrey_domas.lesson9.level7;

import java.util.Iterator;

public class LinkedListElement<T>  {
    protected T object;
    protected LinkedListElement<T> prev;
    protected LinkedListElement<T> next;

    public LinkedListElement(T object, LinkedListElement prev, LinkedListElement next) {
        this.object = object;
        this.prev = prev;
        this.next = next;
    }
}

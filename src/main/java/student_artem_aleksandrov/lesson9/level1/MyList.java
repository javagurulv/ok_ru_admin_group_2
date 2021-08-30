package student_artem_aleksandrov.lesson9.level1;


import java.util.Arrays;

public interface MyList<I> extends Iterable<I> {

    Arrays[] createList();

    void append(I i);
    void extend(Arrays[] array);

    int pop(int index);
    int size(int index);
    int index(int index);

    void remove(I i);
}

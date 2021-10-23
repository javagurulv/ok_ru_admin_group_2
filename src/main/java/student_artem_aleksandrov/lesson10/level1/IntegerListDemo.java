package student_artem_aleksandrov.lesson10.level1;

/*
В классе IntegerListDemo создайте список целых чисел.
Продемонстрируйте как:
- добавить в список элемент (в начало и в конец)
- узнать длину списка
- удалить элемент из списка (по интексу и без)
- узнать пустой список или нет
- обойти список и вывести на консоль каждый элемент.
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class IntegerListDemo {


    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        // Insert to begin of ArrayList
        arrayList.add(0, 0);
        // Remove by index
        arrayList.remove(4);

        linkedList.add("First");
        linkedList.add("Second");

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

        System.out.printf("First item in linkedList %s%n", linkedList.poll());
        System.out.printf("Next item in linkedList %s%n", linkedList.poll());
}
}

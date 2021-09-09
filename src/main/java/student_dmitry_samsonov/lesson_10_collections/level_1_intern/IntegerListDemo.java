package student_dmitry_samsonov.lesson_10_collections.level_1_intern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(arrayList.size(), 9);
        System.out.println("Length is " + arrayList.size());
        arrayList.remove(1);
        arrayList.remove(Integer.valueOf(1));
        System.out.println("Array is empty: " + arrayList.isEmpty());
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("Array elements:");
        for (Integer i:arrayList) {
            System.out.println(i);
        }
        // Примитивные типы нельзя
        // List<int> arrayListPrimitive = new ArrayList<int>();

        // Две известные мне реализации интерфейса List - это ArrayList и LinkedList
        List<Object> linkedList = new LinkedList<Object>();

        // В LinkedList каждый объект хранит ссылку на предыдущий и следующий объект.

        Integer integer = Integer.valueOf(1);
        linkedList.add(integer);
        linkedList.add(integer);
        // Можно добавить один объект два раза
    }
}

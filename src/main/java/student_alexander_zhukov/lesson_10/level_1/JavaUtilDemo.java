package student_alexander_zhukov.lesson_10.level_1;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class JavaUtilDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Object> anyArr = new LinkedList<>();
        Book book1 = new Book("Bulgakov", "prose");

        numbers.add(1);
        numbers.add(100);
        numbers.add(55);
        numbers.add(1);
        numbers.add(Integer.parseInt("45"));

        anyArr.add("test");
        anyArr.add(6.67);
        anyArr.add(11);
        anyArr.add(book1);



        numbers.forEach(System.out::println);

        anyArr.forEach(System.out::println);
    }
}

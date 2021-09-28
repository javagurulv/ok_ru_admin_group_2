package student_alexander_zhukov.lesson_10.level_1;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(77);
        numbers.add(78);
        numbers.add(79);
        numbers.add(77);
        numbers.add(77);
        numbers.add(77);
        numbers.add(77);
        numbers.add(0,1);
        numbers.add(numbers.size(),99);
        System.out.println("List length = " + numbers.size());
        numbers.remove(Integer.parseInt("1"));
        numbers.remove(3);
        System.out.println("List isEmpty = " + numbers.isEmpty());

        numbers.forEach(System.out::println);
    }
}

package student_artem_khokhlov.lesson_8.task_4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SafeDemo {
    public static void main(String[] args) {
        List<Safe> pack = new LinkedList<>();
        Random test;

        test = new Random();

        System.out.println(pack);

        for(int i = 0; i < 10; i++) {
            Safe el = new Safe("", test.nextInt());
            el.password = String.valueOf(el.hashCode());
            pack.add(el);
        }
        for(Safe p : pack) {
            System.out.println(p.toString());
        }
    }
}

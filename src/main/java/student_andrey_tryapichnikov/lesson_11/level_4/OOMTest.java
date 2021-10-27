package student_andrey_tryapichnikov.lesson_11.level_4;

import java.util.LinkedList;
import java.util.List;

public class OOMTest {
    public static void main(String[] args) {
        runOutOfMemory();
    }
    static void runOutOfMemory() {
        List<Object> throwAway = new LinkedList<>();
        long quiteALot = 999999999L;
        while (true) {
            quiteALot *= quiteALot^9;
            throwAway.add(quiteALot);
            runOutOfMemory();
        }
    }
}

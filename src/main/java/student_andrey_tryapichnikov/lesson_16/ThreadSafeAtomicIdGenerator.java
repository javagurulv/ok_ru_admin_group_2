package student_andrey_tryapichnikov.lesson_16;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeAtomicIdGenerator {
    private AtomicInteger id = new AtomicInteger(0);

    public int nextId() {
        return id.incrementAndGet();
    }

    public int getId() {
        return id.get();
    }
}

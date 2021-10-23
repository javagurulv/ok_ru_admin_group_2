package student_alexander_zhukov.lesson_16;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeAtomicIdGeneratorComplexState {

    private AtomicInteger id;
    private boolean even;

    public ThreadSafeAtomicIdGeneratorComplexState(AtomicInteger id) {
        this.id = id;
    }

    public int nextId() {
        this.even = id.incrementAndGet() % 2 == 0;
        return id.get();
    }

    public boolean isEven() {
        return this.even;
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}

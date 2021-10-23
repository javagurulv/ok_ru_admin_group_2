package student_alexander_zhukov.lesson_16;

import java.util.concurrent.atomic.AtomicInteger;

class ThreadSafeAtomicIdGenerator {

    private AtomicInteger id;

    public ThreadSafeAtomicIdGenerator(AtomicInteger id) {
        this.id = id;
    }

    public int nextId() {
        return id.addAndGet(1);
    }
}

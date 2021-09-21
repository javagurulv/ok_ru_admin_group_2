package student_dmitry_samsonov.lesson_16_multithreading;

import java.util.concurrent.atomic.AtomicInteger;

class ThreadSafeAtomicIdGenerator implements Runnable {
    private AtomicInteger id;

    public int nextId() {
        return this.id.getAndIncrement();
    }

    public ThreadSafeAtomicIdGenerator(AtomicInteger id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(nextId());
    }

}

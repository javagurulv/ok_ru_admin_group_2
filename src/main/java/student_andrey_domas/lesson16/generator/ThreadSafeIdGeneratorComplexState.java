package student_andrey_domas.lesson16.generator;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeIdGeneratorComplexState implements Generator {
    private AtomicInteger id = new AtomicInteger(0);
    private boolean even;

    @Override
    public int nextId() {
        return id.updateAndGet(operand -> {
            even = ++operand % 2 == 0;
            return operand;
        });
    }

    /**
     * Это все равно не будет работать - надо синхронизировать isEvent() и nextId() в вызывающем потоке.
     */
    @Override
    public boolean isEven() {
        return even;
    }
}

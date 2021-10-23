package student_alexander_zhukov.lesson_16;

class ThreadSafeAtomicIdGeneratorComplexStateRunnable implements Runnable {
    private ThreadSafeAtomicIdGeneratorComplexState safe;

    public ThreadSafeAtomicIdGeneratorComplexStateRunnable(ThreadSafeAtomicIdGeneratorComplexState safe) {
        this.safe = safe;
    }

    @Override
    public void run() {
        for (int i=0; i < 10000; i++) {
            int currentNumber = safe.nextId();
            if (safe.isEven() && (currentNumber % 2 != 0)) {
                System.out.printf("[%s] [%s] is Even=true, but number not Even\n", Thread.currentThread().getName(), currentNumber);
            }
        }
    }
}

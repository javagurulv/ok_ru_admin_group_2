package student_alexander_zhukov.lesson_16;

class ThreadSafeAtomicIdGeneratorRunnable implements Runnable {

    private ThreadSafeAtomicIdGenerator safeGen;

    public ThreadSafeAtomicIdGeneratorRunnable(ThreadSafeAtomicIdGenerator safeGen) {
        this.safeGen = safeGen;
    }

    @Override
    public void run() {
        for (int i=0; i < 1000; i++) {
            safeGen.nextId();
        }
        //System.out.printf("[%s] [%s]\n", Thread.currentThread().getName(), safeGen.nextId());
    }
}

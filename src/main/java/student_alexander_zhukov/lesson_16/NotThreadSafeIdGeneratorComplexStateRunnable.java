package student_alexander_zhukov.lesson_16;

class NotThreadSafeIdGeneratorComplexStateRunnable implements Runnable {

    private NotThreadSafeIdGeneratorComplexState notSafe;

    public NotThreadSafeIdGeneratorComplexStateRunnable(NotThreadSafeIdGeneratorComplexState notSafe) {
        this.notSafe = notSafe;
    }

    @Override
    public void run() {
        int currentNumber;
        boolean even;
        for (int i=0; i < 10000; i++) {
            synchronized (this) {
                currentNumber = notSafe.nextId();
                even = notSafe.isEven();
            }
            //int currentNumber = notSafe.nextId();
            if (even && (currentNumber % 2 != 0)) {
                System.out.printf("[%s] [%s] is Even=true, but number not Even\n", Thread.currentThread().getName(), currentNumber);
            }
        }
    }
}

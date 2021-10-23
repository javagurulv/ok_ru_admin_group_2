package student_alexander_zhukov.lesson_16;

class NotThreadSafeIdGeneratorRunnable implements Runnable {

    private NotThreadSafeIdGenerator notSafe;

    public NotThreadSafeIdGeneratorRunnable(NotThreadSafeIdGenerator notSafe) {
        this.notSafe = notSafe;
    }

    @Override
    public void run() {
        for (int i=0; i < 10000; i++) {
            notSafe.nextId();
        }
        //System.out.printf("[%s] [%s]\n", Thread.currentThread().getName(), notSafe.nextId());
    }
}

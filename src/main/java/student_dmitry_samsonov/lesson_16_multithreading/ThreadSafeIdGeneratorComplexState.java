package student_dmitry_samsonov.lesson_16_multithreading;

class ThreadSafeIdGeneratorComplexState implements Runnable{

    private int id;
    private boolean even;

    public int nextId() {
        id++;
        this.even = isEven(id);
        return id;
    }

    public boolean isEven() {
        return this.even;
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    @Override
    public void run() {
        int id;
        boolean even;
        for (int i=0; i<1000000; i++) {
            synchronized (this) {
                id = nextId();
                even = isEven();
            }
            String msg;
            if (isEven(id) != even) {
                if (even) {
                    msg = "even";
                } else {
                    msg = "odd";
                }
                System.out.println(id + " is not " + msg);
            }
        }
    }
}

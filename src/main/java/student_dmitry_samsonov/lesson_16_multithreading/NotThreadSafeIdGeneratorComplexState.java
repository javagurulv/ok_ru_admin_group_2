package student_dmitry_samsonov.lesson_16_multithreading;

class NotThreadSafeIdGeneratorComplexState implements Runnable{

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
        int id = nextId();
        boolean even = isEven();
        String msg;
        if (even) {
            msg = "even";
        } else {
            msg = "odd";
        }
        if (isEven(id) != even) {
            System.out.println(id + " is not " + msg);
        }
    }
}

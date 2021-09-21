package student_dmitry_samsonov.lesson_16_multithreading;

class NotThreadSafeIdGenerator implements Runnable {

    private int id;

    public int nextId() {
        return id++;
    }

    public NotThreadSafeIdGenerator(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(nextId());
    }
}
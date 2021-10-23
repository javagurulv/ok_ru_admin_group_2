package student_alexander_zhukov.lesson_16;

class NotThreadSafeIdGenerator {

    private int id;

    public NotThreadSafeIdGenerator(int id) {
        this.id = id;
    }

    public int nextId() {
        return id++;
    }

}

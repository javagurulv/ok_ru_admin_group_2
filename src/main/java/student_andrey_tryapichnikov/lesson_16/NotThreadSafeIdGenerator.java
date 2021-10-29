package student_andrey_tryapichnikov.lesson_16;

public class NotThreadSafeIdGenerator {
    private int id;

    public int nextId() {
        return id++;
    }

    public int getId() {
        return id;
    }
}

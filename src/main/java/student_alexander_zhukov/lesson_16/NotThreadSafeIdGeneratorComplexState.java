package student_alexander_zhukov.lesson_16;

class NotThreadSafeIdGeneratorComplexState {

    private int id;
    private boolean even;

    public NotThreadSafeIdGeneratorComplexState(int id) {
        this.id = id;
    }

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

}

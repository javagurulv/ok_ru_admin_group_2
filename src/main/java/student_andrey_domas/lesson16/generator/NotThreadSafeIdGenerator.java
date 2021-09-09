package student_andrey_domas.lesson16.generator;

class NotThreadSafeIdGenerator implements Generator {

    private int id;
    private boolean even;

    @Override
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
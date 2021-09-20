package student_dmitry_samsonov.lesson_13_streams.level_1_intern;

class Apple {

    private String color;
    private int weight;

    public Apple (String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {

        Apple apple = (Apple) obj;
        return super.equals(obj) || (apple.color.equals(this.color) && apple.weight == this.weight);
    }
}
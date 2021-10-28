package student_dmitry_drozdetsky.lesson_7.level_5.Task_21;

abstract class Shape {
    private final String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

    public String getTitle() {
        return title;
    }
}

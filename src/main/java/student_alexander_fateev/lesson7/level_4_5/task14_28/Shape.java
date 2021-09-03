package student_alexander_fateev.lesson7.level_4_5.task14_28;

abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}

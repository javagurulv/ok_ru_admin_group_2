package student_andrey_domas.lesson7.level4;

public abstract class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    double calculatePerimeter(Shape[] shapes) {
        double accumPerimeter = 0;
        for (Shape sh: shapes) {
            accumPerimeter += sh.calculatePerimeter();
        }
        return accumPerimeter;
    }

}

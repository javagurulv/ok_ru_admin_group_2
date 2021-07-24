package student_andrey_tryapichnikov.lesson_7.level_5;

abstract public class Shape {
    private Double area;
    private Double perimeter;

    abstract double calculateArea();
    abstract double calculatePerimeter();

    // since we shouldn't have to calculate area and perimeter more than once,
    // separate calculate and get methods with only calculate methods needing class specific implementation
    double getArea() {
        if (area == null) area = calculateArea();
        return area;
    }

    double getPerimeter() {
        if (perimeter == null) perimeter = calculatePerimeter();
        return perimeter;
    }
}

package student_sergo_kurbanov.lesson_3.level_7;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        System.out.printf("\nArea of circle with radius %.2f = %.2f", circle.getRadius(), circle.calculateArea());
    }
}

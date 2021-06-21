package student_andrey_domas.lesson3.level7;

public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle(4);
        System.out.println(c1.calculateArea());

        Circle c2 = new Circle(Math.PI);
        System.out.println(c2.calculateArea());

        Circle c3 = new Circle(Math.sqrt(2));
        System.out.println(c3.calculateArea());
    }
}

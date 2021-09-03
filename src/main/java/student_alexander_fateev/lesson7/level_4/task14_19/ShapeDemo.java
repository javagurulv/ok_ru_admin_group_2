package student_alexander_fateev.lesson7.level_4.task14_19;

class ShapeDemo {
    public static void main(String[] args) {
        // Circle
        Circle myCircle = new Circle(10);
        System.out.println("Circle area: " + myCircle.calculateArea());
        System.out.println("Circle perimeter: " + myCircle.calculatePerimeter());

        //Square
        Square mySquare = new Square(10);
        System.out.println("Square area: " + mySquare.calculateArea());
        System.out.println("Square perimeter: " + mySquare.calculatePerimeter());

        //Rectangle
        Rectangle myRectangle = new Rectangle(10, 5);
        System.out.println("Rectangle area: " + myRectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + myRectangle.calculatePerimeter());

        //Triangle
        Triangle myTriangle = new Triangle(10);
        System.out.println("Triangle area: " + myTriangle.calculateArea());
        System.out.println("Triangle perimeter: " + myTriangle.calculatePerimeter());
    }
}

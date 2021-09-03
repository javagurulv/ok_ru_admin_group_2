package student_alexander_fateev.lesson7.level_4_5.task14_28;

class ShapeDemo {
    public static void main(String[] args) {
        // Circle
        Circle myCircle = new Circle(4);
        double circleArea = myCircle.calculateArea();
        System.out.println("Circle area: " + circleArea);
        double circlePerimeter = myCircle.calculatePerimeter();
        System.out.println("Circle perimeter: " + circlePerimeter);

        //Square
        Square mySquare = new Square(4);
        double squareArea = mySquare.calculateArea();
        System.out.println("Square area: " + squareArea);
        double squarePerimeter = mySquare.calculatePerimeter();
        System.out.println("Square perimeter: " + squarePerimeter);

        //Rectangle
        Rectangle myRectangle = new Rectangle(4, 4);
        double rectangleArea = myRectangle.calculateArea();
        System.out.println("Rectangle area: " + rectangleArea);
        double rectanglePerimeter = myRectangle.calculatePerimeter();
        System.out.println("Rectangle perimeter: " + rectanglePerimeter);

        //Triangle
        Triangle myTriangle = new Triangle(4);
        double triangleArea = myTriangle.calculateArea();
        System.out.println("Triangle area: " + triangleArea);
        double trianglePerimeter = myTriangle.calculatePerimeter();
        System.out.println("Triangle perimeter: " + trianglePerimeter);

        double sumArea = circleArea + squareArea + rectangleArea + triangleArea;
        double sumPerimeter = circlePerimeter + squarePerimeter + rectanglePerimeter + trianglePerimeter;

        System.out.println("Sum area: " + sumArea);
        System.out.println("Sum perimeter: " + sumPerimeter);
    }
}

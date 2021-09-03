package student_alexander_fateev.lesson7.level_4_5.task14_28;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        System.out.println("Random square area: " + squareArea);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Random square perimeter: " + squarePerimeter);
    }
}

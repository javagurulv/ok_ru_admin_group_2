package student_alexander_zhukov.lesson_7.level_5;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape randomFigure = shapeUtil.createRandomShape();
        double randomFigureArea = shapeUtil.calculateArea(randomFigure);
        double randomFigurePerimeter = shapeUtil.calculatePerimeter(randomFigure);

        System.out.printf("%s %s\n", randomFigureArea, randomFigurePerimeter);

    }
}

package student_alexander_fateev.lesson7.level_7.task32;

class Addition extends TwoArgumentMathOperation {

    public Addition(MathOperation leftArgument,
                    MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() + calculateRightSide();
    }
}

package student_sergo_kurbanov.lesson_7.level_7.task_32;

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

package student_dmitry_samsonov.lesson_7.level_7_senior.task_32;

abstract class TwoArgumentMathOperation extends MathOperation {

	private MathOperation leftArgument;
	private MathOperation rightArgument;

	public TwoArgumentMathOperation(MathOperation leftArgument,
									MathOperation rightArgument) {
		this.leftArgument = leftArgument;
		this.rightArgument = rightArgument;
	}

	protected double calculateLeftSide() {
		return leftArgument.calculate();
	}

	protected double calculateRightSide() {
		return rightArgument.calculate();
	}

}

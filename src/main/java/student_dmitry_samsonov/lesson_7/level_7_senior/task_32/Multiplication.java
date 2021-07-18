package student_dmitry_samsonov.lesson_7.level_7_senior.task_32;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Multiplication extends TwoArgumentMathOperation {

	public Multiplication(MathOperation leftArgument,
                          MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() * calculateRightSide();
	}
}

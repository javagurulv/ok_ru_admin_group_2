package student_dmitry_samsonov.lesson_7.level_7_senior.task_32;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Argument extends MathOperation {

	private double argument;

	public Argument(double argument) {
		this.argument = argument;
	}

	@Override
	public double calculate() {
		return argument;
	}
}

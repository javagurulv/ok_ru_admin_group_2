package student_andrey_domas.lesson7.level7.task_32;

class Division extends TwoArgumentMathOperation {

	public Division(MathOperation leftArgument,
                    MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {	return calculateLeftSide() / calculateRightSide(); }
}

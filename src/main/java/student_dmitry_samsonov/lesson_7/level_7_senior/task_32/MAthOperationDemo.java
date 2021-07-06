package student_dmitry_samsonov.lesson_7.level_7_senior.task_32;

class MAthOperationDemo {

	public static void main(String[] args) {
		// build and calculate: 10 + 20
		Argument arg1 = new Argument(10);
		Argument arg2 = new Argument(20);
		MathOperation addition = new Addition(arg1, arg2);
		System.out.println("Left side Addition result = " + addition.calculate());

		// build and calculate: 50 - 20
		Argument arg3 = new Argument(50);
		Argument arg4 = new Argument(20);
		MathOperation subtraction = new Subtraction(arg3, arg4);
		System.out.println("Right side Subtraction result = " + addition.calculate());

		// build and calculate: (10 + 20) + (50 - 20)
		MathOperation addition1 = new Addition(addition, subtraction);
		System.out.println("Final Addition result = " + addition1.calculate());



		// build and calculate: 10 - 5
		Argument arg11 = new Argument(10);
		Argument arg12 = new Argument(5);
		MathOperation subtraction1 = new Subtraction(arg11, arg12);
		System.out.println("Left side Subtraction result = " + subtraction1.calculate());

		// build and calculate: 20 / 5
		Argument arg13 = new Argument(20);
		Argument arg14 = new Argument(5);
		MathOperation division = new Division(arg13, arg14);
		System.out.println("Right side Division result = " + division.calculate());

		// build and calculate: (10 - 5) * (20 / 5)
		MathOperation multiplication = new Multiplication(subtraction1, division);
		System.out.println("Final Multiplication result = " + multiplication.calculate());

	}

}

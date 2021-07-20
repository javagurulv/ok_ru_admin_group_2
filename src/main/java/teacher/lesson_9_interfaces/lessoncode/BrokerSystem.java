package teacher.lesson_9_interfaces.lessoncode;

public class BrokerSystem {

	public static void main(String[] args) {
		InsurancePolicyCalculator calculator
				= new InsurancePolicyCalculatorImpl();

		calculator = new InsurancePolicyCalculatorV2Impl();


		calculator.calculate(new Policy());

		int sum = calculator.sum(1, 3);



		Broker broker = new Broker(calculator);
		broker.run();
	}

}

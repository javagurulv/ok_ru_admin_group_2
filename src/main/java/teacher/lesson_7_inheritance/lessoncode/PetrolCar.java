package teacher.lesson_7_inheritance.lessoncode;

public class PetrolCar extends Car {

	public PetrolCar(String model) {
		//super(model);
		super(model, 10);

		this.model2 = "afdss";
		this.model3 = "afdss";
		this.model4 = "afdss";
	}

	@Override
	public void start() {
		this.model2 = "";
		this.model3 = "";
		this.model4 = "";
		//abc();
		method2();
		method3();
		method4();

		//new Car("model");

		System.out.println("Start Petrol Engine!");
	}

	@Override
	public void stop() {
		System.out.println("Stop Petrol Engine!");
	}

	@Override
	public String toString() {
		return "Petrol Car model = " + getModel();
	}

}

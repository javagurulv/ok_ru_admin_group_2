package teacher.lesson_7_inheritance.lessoncode;

public final class PetrolCar extends Car {

	public static final String ABC = "zdfsdf";

	public PetrolCar(String model) {
		super(model);
		//super(model, 10);
		//super();

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
		abc();
		System.out.println("Start Petrol Engine!");
	}

	@Override
	protected void method4() {
		System.out.println("dsfdfds");
	}

	private void abc() {

	}

	@Override
	public void stop() {
		System.out.println("Stop Petrol Engine!");
	}

	@Override
	public String toString() {
		return "Petrol Car model = " + getModel();
	}

	public void m2() {
		System.out.println("Naslednik M2");
	}

}

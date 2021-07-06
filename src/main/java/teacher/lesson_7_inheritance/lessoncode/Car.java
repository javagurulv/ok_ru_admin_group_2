package teacher.lesson_7_inheritance.lessoncode;

public abstract class Car extends Object {

	private String model;

	protected String model2;
	String model3;
	public String model4;

	protected void changeModel(String newModel) {
		if (newModel != null) {
			this.model = newModel;
		}
	}

	public Car() {
		//super();
		this.model = model;
	}

	public Car(String model) {
		//super();
		this.model = model;
	}

	public Car(String model, int abc) {
		//super();
		this.model = model;
	}


	public String getModel() {
		return this.model;
	}

	private void abc() {

	}

	void method2() {

	}

	public void method3() {
		System.out.println("sdfsgfd sdfdfd");
	}

	protected void method4() {
		System.out.println("dsfdfds asfsdf");
	}

	public abstract void start();

	public abstract void stop();

	public void m1() {
		m2();
	}

	public void m2() {
		System.out.println("Parent M2");
	}

}

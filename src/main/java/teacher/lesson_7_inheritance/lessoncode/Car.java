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

	}

	public abstract void start();

	public abstract void stop();

}

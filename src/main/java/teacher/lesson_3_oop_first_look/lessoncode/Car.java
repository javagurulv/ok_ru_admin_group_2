package teacher.lesson_3_oop_first_look.lessoncode;

public class Car {

	private String color;
	private int currentSpeed;

	Car() {
		this("Red", 0);
	}

	Car(String color) {
		this(color, 0);
		// ....
		// ....
	}

	Car(String color, int currentSpeed) {
		this.color = color;
		this.currentSpeed = currentSpeed;
	}

	void accelerate() {
		this.currentSpeed = this.currentSpeed + 1;
	}

	void accelerate(int speedUp) {
		this.currentSpeed = this.currentSpeed + speedUp;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
}

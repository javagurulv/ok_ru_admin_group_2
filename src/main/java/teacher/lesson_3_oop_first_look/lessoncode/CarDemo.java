package teacher.lesson_3_oop_first_look.lessoncode;

public class CarDemo {

	public static void main(String[] args) {

		Car car1 = new Car();

		Car car2 = new Car("Blue");
		Car car3 = new Car("Black");


		//car1.currentSpeed = car1.currentSpeed - 100;

		//System.out.println(car1.currentSpeed);
		//System.out.println(car1.color);

		car1.accelerate();
		car1.accelerate(10);

		car2.accelerate();
		car2.accelerate(100);

		System.out.println("Car 1 current speed = " + car1.getCurrentSpeed());
		System.out.println("Car 2 current speed = " + car2.getCurrentSpeed());


	}

}

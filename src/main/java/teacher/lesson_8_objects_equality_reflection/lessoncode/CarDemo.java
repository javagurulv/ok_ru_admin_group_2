package teacher.lesson_8_objects_equality_reflection.lessoncode;

public class CarDemo {

	public static void main(String[] args) {
		Car car = new Car(false, 0.0);
		// Car car1 = new Car(0.0);

		// car.isSwithedOn = true;  // not valid!!!!

		car.start();  // is valid!!!

		// car.haveFuel();

		System.out.println("Car is swithed on? " + car.isSwithedOn());


		System.out.println(car);

	}

}

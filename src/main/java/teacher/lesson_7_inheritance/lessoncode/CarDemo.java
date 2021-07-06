package teacher.lesson_7_inheritance.lessoncode;

public class CarDemo {

	public static void main(String[] args) {

		//Car car = new Car();

		PetrolCar petrolCar = new PetrolCar("Ferrary");

		petrolCar.m1();


		System.out.println(petrolCar);

		ElectricCar electricCar = new ElectricCar("Tesla 3", 100);
		//PetrolCar petrolCar = new PetrolCar("Ferrary Monza");

		Car car1 = electricCar;
		//car1.additionalMethod();

		ElectricCar car2 = electricCar;
		car2.additionalMethod();

		if (car1 instanceof ElectricCar) {
			car2 = (ElectricCar) car1;
			car2.additionalMethod();
		}

		//car1 = new PetrolCar("Ferrary");
		car1.start();

		System.out.println(electricCar);


		PetrolCar[] pcars = new PetrolCar[10];

		Car[] cars = new Car[10];
		cars[0] = new PetrolCar("Ferrary");
		cars[1] = new ElectricCar("Tesla 3", 100);
		cars[2] = new PetrolCar("Ferrary");


		//Car car2 = petrolCar;

		cars[0].start();


		//car2.start();


		/*Car car = new Car("Nissan");
		car.start();
		car.stop();*/

	}

}

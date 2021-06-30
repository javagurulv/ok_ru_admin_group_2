package teacher.lesson_2_variables.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class Car {

	final Long MAX_SPEED = 200L;

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			Car car = new Car();
			cars.add(car);
		}
		System.out.println(cars.size());
	}

}

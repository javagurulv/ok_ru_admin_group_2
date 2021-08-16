package teacher.lesson_16_multithreading.lessoncode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiMultiThreading {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		List<String> result = list.stream().parallel()
				.filter(s -> s.equals("ABC"))
				.collect(Collectors.toList());

	}

}

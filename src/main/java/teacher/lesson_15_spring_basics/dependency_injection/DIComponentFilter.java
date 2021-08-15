package teacher.lesson_15_spring_basics.dependency_injection;

import java.util.List;
import java.util.stream.Collectors;

class DIComponentFilter {

	public List<Class> filter(List<Class> classes) {
		return classes.stream()
				.filter(cl -> cl.isAnnotationPresent(DIComponent.class))
				.collect(Collectors.toList());
	}

}

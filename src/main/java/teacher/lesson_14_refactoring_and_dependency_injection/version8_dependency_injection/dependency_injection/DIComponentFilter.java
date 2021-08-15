package teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.dependency_injection;

import java.util.List;
import java.util.stream.Collectors;

class DIComponentFilter {

	public List<Class> filter(List<Class> classes) {
		return classes.stream()
				.filter(cl -> cl.isAnnotationPresent(DIComponent.class))
				.collect(Collectors.toList());
	}

}

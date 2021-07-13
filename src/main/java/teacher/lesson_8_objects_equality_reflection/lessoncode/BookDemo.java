package teacher.lesson_8_objects_equality_reflection.lessoncode;

import java.lang.reflect.Field;

public class BookDemo {

	public static void main(String[] args)
			throws NoSuchFieldException,
			       IllegalAccessException {
		Book book1 = new Book("Star", "A");
		Book book2 = new Book("Star", "A");

		//book1 = book2;

		if (book1 == book2) {
			System.out.println("References are equals!");
		} else {
			System.out.println("References are NOT equals!");
		}

		//book2 = null;

		if (book1.equals(book2)) {
			System.out.println("Books are equals!");
		} else {
			System.out.println("Books are NOT equals!");
		}


		Book book3 = new Book("Star", "A");

		System.out.println("Book 3 title = " + book3.getTitle());

		Class bookClass = book3.getClass();

		Field[] fields = bookClass.getDeclaredFields();

		Field titleField = bookClass.getDeclaredField("title");
		titleField.setAccessible(true);
		titleField.set(book3, "PPPPP");

		bookClass.getDeclaredMethods();

		System.out.println("Book 3 title = " + book3.getTitle());

	}

}

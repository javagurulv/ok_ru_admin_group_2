package teacher.lesson_4_if_statement.lessoncode;

public class SwitchExample {

	private static final String MONDAY = "Monday";

	public static void main(String[] args) {

		String dayOfTheWeek = "Monday";

		//float ff = 12.0F;

		switch (dayOfTheWeek) {
			case MONDAY : {
				System.out.println("print Monday");
				break;
			}
			case "Tuesday" : {
				System.out.println("print Tuesday");
				break;
			}
			default: {
				System.out.println("print All others days");
			}
		}

		System.out.println("after switch");

	}



}

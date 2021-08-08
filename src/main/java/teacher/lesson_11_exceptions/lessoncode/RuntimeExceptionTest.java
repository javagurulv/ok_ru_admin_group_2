package teacher.lesson_11_exceptions.lessoncode;

public class RuntimeExceptionTest {

	public static void main(String[] args) throws Exception {
		//int[] arr = new int[1];
		//System.out.println(arr[100]);

		RuntimeException e = new RuntimeException("sdfsdfsd");

		// open resource
		try {
			System.out.println("szfsds");

			//throw e;
		} catch (RuntimeException e1) {
			System.out.println(e1);
			throw new Exception("dfsdgfd asdas", e1);
		} catch (Exception e2) {
			System.out.println("fsdfds" + e2);
		} finally {
			// close resource
			System.out.println("code");
		}
	}


}

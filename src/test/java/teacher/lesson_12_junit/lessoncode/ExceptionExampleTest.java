package teacher.lesson_12_junit.lessoncode;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionExampleTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void test1() {
		ExceptionExample exception = new ExceptionExample();
		try {
			exception.throwException(5);
			fail();
		} catch (RuntimeException e) {
			assertEquals("message 9898", e.getMessage());
		}
	}

	@Test
	public void test2() {
		exception.expect(RuntimeException.class);
		exception.expectMessage("message 9898");
		ExceptionExample exception = new ExceptionExample();
		exception.throwException(5);
	}

	@Test(expected = RuntimeException.class)
	public void test3() {
		ExceptionExample exception = new ExceptionExample();
		exception.throwException(5);
	}

}
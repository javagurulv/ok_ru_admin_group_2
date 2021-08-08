package teacher.lesson_12_junit.lessoncode;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaxCalculatorImplTest {

	private TaxCalculator calculator = new TaxCalculatorImpl();

	@Test
	public void test1() {
		double tax = calculator.calculate(1000);
		assertEquals(250, tax, 0.001);
	}

	@Test
	public void test2() {
		double tax = calculator.calculate(1000);
		assertEquals(250, tax, 0.001);
		assertFalse(false);
		assertTrue(true);
		Object obj = null;
		assertNull(obj);
	}

	public void test3() {
		TaxCalculator calculator = new TaxCalculatorImpl();
		double tax = calculator.calculate(1000);
		assertEquals(200, tax, 0.001);
	}


}
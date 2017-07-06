package calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

	Calculator stringCalculator = new Calculator();

	@Test
	public void calculateEmptyString() {
		assertEquals(0, stringCalculator.calculate(""));
	}

	@Test
	public void calculateOneNum() {
		assertEquals(1, stringCalculator.calculate("1"));
	}

	@Test
	public void calculateTwoNums() {
		assertEquals(3, stringCalculator.calculate("1,2"));
	}

	@Test
	public void calculateUnlimitedNums() {
		assertEquals(468, stringCalculator.calculate("1,2,456,9,0"));
	}

	@Test
	public void calculateDiffDelimiters() {
		assertEquals(6, stringCalculator.calculate("1\n2,3"));
	}

}

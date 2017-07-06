package sum;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SumTest {

	Sum stringSum = new Sum();

	@Test
	public void testEmptyString() {
		assertEquals(0, stringSum.parseStringToInt(""));
	}

	@Test
	public void testSimpleNaturalNumber() {
		assertEquals(1, stringSum.parseStringToInt("1"));
	}

	@Test
	public void testDecimal() {
		assertEquals(0, stringSum.parseStringToInt("123.436"));
	}

	@Test
	public void testChar() {
		assertEquals(0, stringSum.parseStringToInt("bajididh"));
	}

	@Test
	public void testProcessSumOnNaturalNums() {
		assertEquals(5, stringSum.processSum("2", "3"));
	}

	@Test
	public void testProcessSumOnNums() {
		assertEquals(3, stringSum.processSum("123.436", "3"));
	}

	@Test
	public void testProcessSumOnDecimalNums() {
		assertEquals(0, stringSum.processSum("123.436", "964.987564"));
	}

	@Test
	public void testSumOnBigNums() {
		assertEquals(1, stringSum.processSum("1", "3333333333333333333333333333333333333333333333333333333"));
	}

	@Test
	public void testSumOnNegativeNum() {
		assertEquals(22, stringSum.processSum("-1", "22"));
	}

	@Test
	public void testSumOnNegativeNums() {
		assertEquals(0, stringSum.processSum("-2", "-3456"));
	}

	@Test
	public void testSumOnNegativeNumAndBigNum() {
		assertEquals(23456, stringSum.processSum("-1", "23456"));
	}

	@Test
	public void testSumOnChars() {
		assertEquals(0, stringSum.processSum(":", "a"));
	}
}

package fizzbuzz;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {

	FizzBuzz fizzBuzz = new FizzBuzz();

	@Test
	public void testProcessValue1() {
		assertEquals("1", fizzBuzz.processValue(1));
	}

	@Test
	public void testProcessValue2() {
		assertEquals("2", fizzBuzz.processValue(2));
	}

	@Test
	public void testProcessValue14() {
		assertEquals("14", fizzBuzz.processValue(14));
	}

	@Test
	public void testProcessValue3() {
		assertEquals("Fizz", fizzBuzz.processValue(3));
	}

	@Test
	public void testProcessValue6() {
		assertEquals("Fizz", fizzBuzz.processValue(6));
	}

	@Test
	public void testProcessValue5() {
		assertEquals("Buzz", fizzBuzz.processValue(5));
	}

	@Test
	public void testProcessValue10() {
		assertEquals("Buzz", fizzBuzz.processValue(10));
	}

	@Test
	public void testProcessValue15() {
		assertEquals("FizzBuzz", fizzBuzz.processValue(15));
	}

	@Test
	public void testProcessValue30() {
		assertEquals("FizzBuzz", fizzBuzz.processValue(30));
	}

	@Test
	public void testPrint1ToLimit20() {
		assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz", fizzBuzz.print1ToLimit(20));
	}

}

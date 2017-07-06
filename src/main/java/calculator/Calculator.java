package calculator;

import java.util.stream.Stream;

class Calculator {

	int parseStringToInt(String stringNum) {
		try {
			return Integer.parseInt(stringNum);
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	int calculate(String stringNumbers) {

		String[] numbers = stringNumbers.split(",|\n");

		if (numbers.length > 0) {
			return Stream.of(numbers).map(this::parseStringToInt).reduce(0, (current, previous) -> previous + current);
		} else {
			return parseStringToInt(stringNumbers);
		}
	}
}
